package de.hub.modsoft.twittersearch;

public class RunSearchMain {
	
	public static void main(String[] args) throws Exception {
		{						
			GetRequest request = Unirest.get("http://localhost:8080/1.1/search/tweets.json");
			request.queryString("count", "100");
			request.queryString("q", "VW abgasskandal");
			println(request.getUrl());
			
			HttpResponse<JsonNode> response = request.asJson();
			if (response.getStatus() != 200) {
				println("Something went wrong.");
			}
			
			JSONArray results = response.getBody().getObject().getJSONArray("statuses");
			int count = 0;
			for (int i = 0; i < results.length(); i++) {
				JSONObject result = results.getJSONObject(i);
				boolean fulfilsConditions = true;
				fulfilsConditions &= result.getInt("retweets") > 5;
				fulfilsConditions &= result.getJSONObject("entities").getJSONArray("urls").length() > 0;
				if (fulfilsConditions) {
					System.out.print(result.getJSONObject("user").getString("name") + ": ");
					System.out.println("\"" + result.getString("text") + "\"");
					if (count++ >= 3) break;
				}
			}
		}
		{						
			GetRequest request = Unirest.get("http://localhost:8080/1.1/search/tweets.json");
			request.queryString("count", "100");
			request.queryString("q", "quake");
			request.queryString("geocode", "37.781157,-122.398720,1mi");
			println(request.getUrl());
			
			HttpResponse<JsonNode> response = request.asJson();
			if (response.getStatus() != 200) {
				println("Something went wrong.");
			}
			
			JSONArray results = response.getBody().getObject().getJSONArray("statuses");
			int count = 0;
			for (int i = 0; i < results.length(); i++) {
				JSONObject result = results.getJSONObject(i);
				boolean fulfilsConditions = true;
				fulfilsConditions &= result.getJSONObject("entities").getJSONArray("images").length() > 0;
				if (fulfilsConditions) {
					System.out.print(result.getJSONObject("user").getString("name") + ": ");
					System.out.println("\"" + result.getString("text") + "\"");
					if (count++ >= 3) break;
				}
			}
		}
		{						
			GetRequest request = Unirest.get("http://localhost:8080/1.1/tweets/users.json");
			request.queryString("count", "100");
			request.queryString("q", "Donald");
			request.queryString("before", "2016-06-175");
			println(request.getUrl());
			
			HttpResponse<JsonNode> response = request.asJson();
			if (response.getStatus() != 200) {
				println("Something went wrong.");
			}
			
			JSONArray results = response.getBody().getObject().getJSONArray("users");
			int count = 0;
			for (int i = 0; i < results.length(); i++) {
				JSONObject result = results.getJSONObject(i);
				boolean fulfilsConditions = true;
				fulfilsConditions &= result.getInt("follower") > 10;
				if (fulfilsConditions) {
					System.out.print(result.getJSONObject("user").getString("name") + ": ");
					System.out.println("\"" + result.getString("text") + "\"");
					if (count++ >= 3) break;
				}
			}
		}
	}
}
