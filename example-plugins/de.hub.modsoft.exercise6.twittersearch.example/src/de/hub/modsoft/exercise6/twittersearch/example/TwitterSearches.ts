configuration:

objecttype tweet {
	field retweet_count : INT
	field favorit_count : INT
	field hasURL : BOOLEAN
	field hasHashtag : BOOLEAN
	field hasUser_mention : BOOLEAN
	field text : STRING	
}

objecttype user {
	field follower : INT
	field friends : INT
	field name : STRING 
}

searches:
	search for tweet with "VW", "abgasskandal" where retweet_count > 5 & hasURL;
	search for tweet with "piraten" in geo(52.520007,13.404953,100mi) before 12.11.2012;
       search for tweet with "@realDonaldTrump" where text.contains("conservative");