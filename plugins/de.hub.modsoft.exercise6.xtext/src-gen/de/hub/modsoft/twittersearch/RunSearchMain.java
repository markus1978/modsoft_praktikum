package de.hub.modsoft.twittersearch;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

public class RunSearchMain {
	
	public static void main(String[] args) throws Exception {
		{						
			GetRequest request = Unirest.get("http://jupiter.informatik.hu-berlin.de:8080/1.1/search/tweets.json");
			request.queryString("count", "100");
			request.queryString("q", "VW");
			System.out.println(request.getUrl());
			
			HttpResponse<JsonNode> response = request.asJson();
			if (response.getStatus() != 200) {
				System.out.println("Something went wrong.");
			}
			
			JSONArray results = response.getBody().getObject().getJSONArray("statuses");
			
			int count = 0;
			for (int i = 0; i < results.length(); i++) {
				JSONObject result = results.getJSONObject(i);
				boolean fulfilsConditions = true;
				fulfilsConditions &= result.getInt("retweet_count") > 5;
				if (fulfilsConditions) {
					System.out.print(result.getJSONObject("user").getString("name") + ": ");
					System.out.println("\"" + result.getString("text") + "\"");				
					if (count++ >= 3) break;				
				}
			}
		}
		{						
			GetRequest request = Unirest.get("http://jupiter.informatik.hu-berlin.de:8080/1.1/search/tweets.json");
			request.queryString("count", "100");
			request.queryString("q", "quake");
			request.queryString("geocode", "37.781157,-122.398720,100mi");
			System.out.println(request.getUrl());
			
			HttpResponse<JsonNode> response = request.asJson();
			if (response.getStatus() != 200) {
				System.out.println("Something went wrong.");
			}
			
			JSONArray results = response.getBody().getObject().getJSONArray("statuses");
			
			int count = 0;
			for (int i = 0; i < results.length(); i++) {
				JSONObject result = results.getJSONObject(i);
				boolean fulfilsConditions = true;
				if (fulfilsConditions) {
					System.out.print(result.getJSONObject("user").getString("name") + ": ");
					System.out.println("\"" + result.getString("text") + "\"");				
					if (count++ >= 3) break;				
				}
			}
		}
		{						
			GetRequest request = Unirest.get("http://jupiter.informatik.hu-berlin.de:8080/1.1/users/search.json");
			request.queryString("count", "100");
			request.queryString("q", "Donald");
			request.queryString("before", "2016-07-193");
			System.out.println(request.getUrl());
			
			HttpResponse<JsonNode> response = request.asJson();
			if (response.getStatus() != 200) {
				System.out.println("Something went wrong.");
			}
			
			JSONArray results = response.getBody().getArray();
			
			int count = 0;
			for (int i = 0; i < results.length(); i++) {
				JSONObject result = results.getJSONObject(i);
				boolean fulfilsConditions = true;
				fulfilsConditions &= result.getInt("followers_count") > 10;
				if (fulfilsConditions) {
					System.out.print(result.getString("name") + ": ");
					System.out.println("\"" + result.getString("screen_name") + "\"");
					if (count++ >= 3) break;				
				}
			}
		}
	}
}
