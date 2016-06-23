configuration:
	objecttype tweet {
		field retweets : INT
		field favorits : INT
		field hasImage : BOOLEAN
		field hasURL : BOOLEAN
	}
	
	objecttype user {
		field follower : INT
		field friends : INT
	}

searches:
	search for tweet with "VW", "abgasskandal" where retweets > 5 & hasURL;
	search for tweet with "quake" in geo(37.781157,-122.398720,1mi) where hasImage;
	search for user with "Donald" before 23.06.2016 where follower > 10;