configuration:

	objecttype tweet {
		field retweets : INT
		field favorits : INT
		field hasImage : BOOLEAN
		field hasURL : BOOLEAN
		field content : STRING	
	}
	
	objecttype user {
		field follower : INT
		field followes : INT
		field name : STRING 
	}

searches:
	search for tweet with "VW", "abgasskandal" where tweet.retweets > 5 & tweet.hasURL