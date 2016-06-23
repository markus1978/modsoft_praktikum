package de.hub.modsoft.twittersearch.codegen;

import java.io.IOException;
import java.util.Map;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD.Response.Status;

public class TwitterProxyServer extends NanoHTTPD {

	val Token token;
	val OAuthService service;
	
    new(String port, String appKey, String appSecret, String token, String secret) throws IOException {
        super(Integer.parseInt(port));
        this.token = new Token(token,  secret);
        service = new ServiceBuilder()
                .provider(TwitterApi)
                .apiKey(appKey)
                .apiSecret(appSecret)
                .build();
        
        start();
        System.out.println("Running at 8080");
        try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {		
			e.printStackTrace();
		}
    }

    static def void main(String[] args) {
        try {
            new TwitterProxyServer(args.get(0), args.get(1), args.get(2), args.get(3), args.get(4));
        } catch (IOException ioe) {
            System.err.println("Couldn't start server:\n" + ioe);
        }
    }

    override serve(IHTTPSession session) {
    	try {
	    	val uri = session.getUri();
	    	if (session.getMethod() != Method.GET) {
	    		return new Response(Status.BAD_REQUEST, "application/json", '''{"errors":[{"message":"Wrong method. Only GET requests are allowed."}]}''');
	    	}
	    	
    		if (!(uri.startsWith("/1.1/users/search") || uri.startsWith("/1.1/search/tweets"))) {
    			return new Response(Status.BAD_REQUEST, "application/json", '''{"errors":[{"message":"Only requests for search/tweets or users/search are allowed."}]}''');
    		}
    		
    		val urlString = "https://api.twitter.com" + uri;
			val request = new OAuthRequest(Verb.GET, urlString);
    		for (Map.Entry<String, String> param: session.getParms().entrySet()) {
    			request.addQuerystringParameter(param.getKey(), param.getValue());
    		}
    		
    		service.signRequest(token, request); 
    		val response = request.send();
    		val body = response.getBody();	 
    		val code = response.getCode();
	        return new Response(Status.values.findFirst[it.requestStatus==code], response.getHeaders().get("Content-type"), body);
    	} catch (Exception e) {
    		e.printStackTrace();
    		return new Response(Status.INTERNAL_ERROR, "text", "Something went wrong!");
    	}
    }
}
