package de.hub.modsoft.twittersearch.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import de.hub.modsoft.twittersearch.BooleanCondition;
import de.hub.modsoft.twittersearch.Condition;
import de.hub.modsoft.twittersearch.DistanceUnit;
import de.hub.modsoft.twittersearch.Fields;
import de.hub.modsoft.twittersearch.IntCondition;
import de.hub.modsoft.twittersearch.IntOperators;
import de.hub.modsoft.twittersearch.Keywords;
import de.hub.modsoft.twittersearch.Location;
import de.hub.modsoft.twittersearch.Search;
import de.hub.modsoft.twittersearch.SearchOption;
import de.hub.modsoft.twittersearch.TwitterObjectType;
import de.hub.modsoft.twittersearch.TwitterSearchFactory;

public class Main {
	
	public static String serialize(Search search) {
		StringBuffer stringBuffer = new StringBuffer("");
		stringBuffer.append("search for ");
		stringBuffer.append(search.getType().getLiteral() + "s");
		for(SearchOption option: search.getOptions()) {
			if (option instanceof Keywords) {
				stringBuffer.append(" with");
				boolean first = true;
				for (String keyword: ((Keywords)option).getKeywords()) {
					if (first) {
						first = false;
						stringBuffer.append(" ");
					} else {
						stringBuffer.append(", ");
					}
					stringBuffer.append("\"" + keyword + "\"");
				}
			} else if (option instanceof Location) {
				stringBuffer.append("in geo(");
				stringBuffer.append(new DecimalFormat("#.######").format(((Location)option).getLat()) + ", ");
				stringBuffer.append(new DecimalFormat("#.######").format(((Location)option).getLon()) + ", ");
				stringBuffer.append(new DecimalFormat("#").format(((Location)option).getRadius()));
				stringBuffer.append(((Location)option).getRadiusUnit().getLiteral() + ")");
			}
		}
		if (!search.getConditions().isEmpty()) {
			stringBuffer.append(" where");
		}
		boolean first = true;
		for (Condition condition: search.getConditions()) {
			if (first) {
				first = false;
			} else {
				stringBuffer.append(" &");
			}
			if (condition instanceof IntCondition) {
				stringBuffer.append(" " + condition.getField().getLiteral() + " ");
				stringBuffer.append(((IntCondition)condition).getOperator().getLiteral() + " ");
				stringBuffer.append(((IntCondition)condition).getOperand());
			} else if (condition instanceof BooleanCondition) {
				stringBuffer.append(" " + condition.getField());
			}
		}
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		TwitterSearchFactory factory = TwitterSearchFactory.eINSTANCE;
		
		// search for tweets with “VW”, “abgasskandal” where retweets > 5 and hasURL		
		Search example1 = factory.createSearch();
		{ 
			example1.setType(TwitterObjectType.TWEET);
			Keywords keywords = factory.createKeywords();		
			keywords.getKeywords().add("VW");
			keywords.getKeywords().add("abgasskandal");
			IntCondition intCondition = factory.createIntCondition();
			intCondition.setField(Fields.RETWEETS);
			intCondition.setOperand(5);
			intCondition.setOperator(IntOperators.GT);
			BooleanCondition booleanCondition = factory.createBooleanCondition();
			booleanCondition.setField(Fields.HAS_URL);
			example1.getOptions().add(keywords);
			example1.getConditions().add(intCondition);
			example1.getConditions().add(booleanCondition);
		}
		
		
		// search for tweets with “quake” in geo(37.781157,-122.398720,1mi) where hasImage
		Search example2 = factory.createSearch(); 
		{
			example2.setType(TwitterObjectType.TWEET);
			Keywords keywords = factory.createKeywords();
			keywords.getKeywords().add("quake");
			Location location = factory.createLocation();
			location.setLat(37.781157);
			location.setLon(-122.398720);
			location.setRadius(1);
			location.setRadiusUnit(DistanceUnit.MILES);
			BooleanCondition condition = factory.createBooleanCondition();
			condition.setField(Fields.HAS_IMAGE);
			example2.getOptions().add(keywords);
			example2.getOptions().add(location);
			example2.getConditions().add(condition);
		}
		
		// search for users with “Donald Trump” where followerCount > 1000
		Search example3 = factory.createSearch(); 
		{
			example3.setType(TwitterObjectType.USER);
			Keywords keywords = factory.createKeywords();
			keywords.getKeywords().add("Donald Trump");			
			IntCondition intCondition = factory.createIntCondition();
			intCondition.setField(Fields.FOLLOWER_COUNT);
			intCondition.setOperand(1000);
			intCondition.setOperator(IntOperators.GT);
			example3.getOptions().add(keywords);	
			example3.getConditions().add(intCondition);
		}
		
		System.out.println(serialize(example1));
		System.out.println(serialize(example2));
		System.out.println(serialize(example3));
	}
}
