twitter {
	primitive Integer
	primitive Boolean
	
	object Tweet {
		field retweets : Integer
		field favorits : Integer
		field hasImage : Boolean
		field hasURL : Boolean
		field user: User
	}
	
	object User {
		field followerCount : Integer
		field friendsCount : Integer
	}
}

searches {
	// search for Tweet with "VW", "abgasskandal" where retweets > 5 & hasURL
	// search for Tweet with "quake" in geo(37.781157,-122.398720,1mi) where hasImage
	// search for User with "Donald" before 23.06.2016 where followerCount > 10
}