package de.hub.modsoft.twittersearch.codegen;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

public class TwitterRestExample {
	public static void main(String[] args) throws Exception {
		GetRequest request = Unirest.get("http://jupiter.informatik.hu-berlin.de:8080/1.1/search/tweets.json");
		request.queryString("q", "abgasskandal");
		
		HttpResponse<JsonNode> response = request.asJson();
		if (response.getStatus() != 200) {
			System.err.println("Something went wrong: ");
			System.err.println(request.asJson().toString());
		}
		
		JSONArray tweets = response.getBody().getObject().getJSONArray("statuses");
		for (int i = 0; i < tweets.length(); i++) {
			JSONObject tweet = tweets.getJSONObject(i);
			System.out.print(tweet.getJSONObject("user").getString("name") + ": ");
			System.out.println("\"" + tweet.getString("text") + "\"");
		}
	}
}
