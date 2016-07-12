package de.hub.modsoft.twittersearch.xtext.generator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

public class AquireTwitterAuthCredentials {
	public static void main(String[] args) throws Exception {	
		OAuthService service = new ServiceBuilder()
                .provider(TwitterApi.class)
                .apiKey(args[0])
                .apiSecret(args[1])
                .build();
		Token requestToken = service.getRequestToken();
		String authUrl = service.getAuthorizationUrl(requestToken);
		System.out.println("auth please: " + authUrl);
		String input = readline();
		Verifier v = new Verifier(input);
		Token accessToken = service.getAccessToken(requestToken, v); 
		System.out.println("token: " + accessToken.getToken() + ", secret: " + accessToken.getSecret());
		
		OAuthRequest request = new OAuthRequest(Verb.GET, "https://api.twitter.com/1/account/verify_credentials.xml");
		service.signRequest(accessToken, request); // the access token from step 4
		Response response = request.send();
		System.out.println(response.getBody());
	}
	
	private static String readline() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        return br.readLine();        
	}
}
