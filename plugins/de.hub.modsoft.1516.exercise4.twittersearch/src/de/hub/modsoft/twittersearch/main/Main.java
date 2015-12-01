package de.hub.modsoft.twittersearch.main;

import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.TwitterSearchFactory;

public class Main {
	
	public static String serialize(Search search) {
		return ""; // TODO
	}
	
	public static void main(String[] args) throws Exception {
		// search for tweets with “VW”, “abgasskandal” where tweet.retweets > 5 & tweet.hasURL
		Search example1 = TwitterSearchFactory.eINSTANCE.createSearch();
		// TODO
		
		// search for tweets with “quake” in geo(37.781157,-122.398720,1mi) before 12.11.2012 where tweet.hasImage
		// TODO
		
		// search for tweets with “@realDonaldTrump” where tweet.message.contains(“hairpiece”) sort user.followers
		// TODO
		
		System.out.println(serialize(example1));
		// TODO
	}
}
