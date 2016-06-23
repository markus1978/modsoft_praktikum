package de.hub.modsoft.twittersearch.codegen;

import com.google.common.base.Objects;
import fi.iki.elonen.NanoHTTPD;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

@SuppressWarnings("all")
public class TwitterProxyServer extends NanoHTTPD {
  private final Token token;
  
  private final OAuthService service;
  
  public TwitterProxyServer(final String port, final String appKey, final String appSecret, final String token, final String secret) throws IOException {
    super(Integer.parseInt(port));
    Token _token = new Token(token, secret);
    this.token = _token;
    ServiceBuilder _serviceBuilder = new ServiceBuilder();
    ServiceBuilder _provider = _serviceBuilder.provider(TwitterApi.class);
    ServiceBuilder _apiKey = _provider.apiKey(appKey);
    ServiceBuilder _apiSecret = _apiKey.apiSecret(appSecret);
    OAuthService _build = _apiSecret.build();
    this.service = _build;
    this.start();
    System.out.println("Running at 8080");
    try {
      Thread _currentThread = Thread.currentThread();
      _currentThread.join();
    } catch (final Throwable _t) {
      if (_t instanceof InterruptedException) {
        final InterruptedException e = (InterruptedException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public static void main(final String[] args) {
    try {
      String _get = args[0];
      String _get_1 = args[1];
      String _get_2 = args[2];
      String _get_3 = args[3];
      String _get_4 = args[4];
      new TwitterProxyServer(_get, _get_1, _get_2, _get_3, _get_4);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException ioe = (IOException)_t;
        System.err.println(("Couldn\'t start server:\n" + ioe));
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public NanoHTTPD.Response serve(final NanoHTTPD.IHTTPSession session) {
    try {
      final String uri = session.getUri();
      NanoHTTPD.Method _method = session.getMethod();
      boolean _notEquals = (!Objects.equal(_method, NanoHTTPD.Method.GET));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{\"errors\":[{\"message\":\"Wrong method. Only GET requests are allowed.\"}]}");
        return new NanoHTTPD.Response(NanoHTTPD.Response.Status.BAD_REQUEST, "application/json", _builder.toString());
      }
      boolean _or = false;
      boolean _startsWith = uri.startsWith("/1.1/users/search");
      if (_startsWith) {
        _or = true;
      } else {
        boolean _startsWith_1 = uri.startsWith("/1.1/search/tweets");
        _or = _startsWith_1;
      }
      boolean _not = (!_or);
      if (_not) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("{\"errors\":[{\"message\":\"Only requests for search/tweets or users/search are allowed.\"}]}");
        return new NanoHTTPD.Response(NanoHTTPD.Response.Status.BAD_REQUEST, "application/json", _builder_1.toString());
      }
      final String urlString = ("https://api.twitter.com" + uri);
      final OAuthRequest request = new OAuthRequest(Verb.GET, urlString);
      Map<String, String> _parms = session.getParms();
      Set<Map.Entry<String, String>> _entrySet = _parms.entrySet();
      for (final Map.Entry<String, String> param : _entrySet) {
        String _key = param.getKey();
        String _value = param.getValue();
        request.addQuerystringParameter(_key, _value);
      }
      this.service.signRequest(this.token, request);
      final org.scribe.model.Response response = request.send();
      final String body = response.getBody();
      final int code = response.getCode();
      NanoHTTPD.Response.Status[] _values = NanoHTTPD.Response.Status.values();
      final Function1<NanoHTTPD.Response.Status, Boolean> _function = (NanoHTTPD.Response.Status it) -> {
        int _requestStatus = it.getRequestStatus();
        return Boolean.valueOf((_requestStatus == code));
      };
      NanoHTTPD.Response.Status _findFirst = IterableExtensions.<NanoHTTPD.Response.Status>findFirst(((Iterable<NanoHTTPD.Response.Status>)Conversions.doWrapArray(_values)), _function);
      Map<String, String> _headers = response.getHeaders();
      String _get = _headers.get("Content-type");
      return new NanoHTTPD.Response(_findFirst, _get, body);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        e.printStackTrace();
        return new NanoHTTPD.Response(NanoHTTPD.Response.Status.INTERNAL_ERROR, "text", "Something went wrong!");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
