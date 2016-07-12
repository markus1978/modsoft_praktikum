twitter {
	primitive Integer
	primitive Boolean

	object Tweet {
		field retweet_count : Integer
		field hasImage : Boolean
		field hasURL : Boolean
	}

	object User {
		field favourites_count : Integer
		field followers_count : Integer
		field friends_count : Integer
	}
}

searches {
	search for Tweet with "VW" where retweet_count > 5 & hasURL
	search for Tweet with "quake" in geo(37.781157,-122.398720,100mi) where hasImage
	search for User with "Donald" before 11.07.2016 where followers_count > 10
}
