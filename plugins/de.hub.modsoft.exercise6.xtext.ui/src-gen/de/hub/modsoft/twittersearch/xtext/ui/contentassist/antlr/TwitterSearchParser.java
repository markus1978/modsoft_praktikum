/*
 * generated by Xtext
 */
package de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import de.hub.modsoft.twittersearch.xtext.services.TwitterSearchGrammarAccess;

public class TwitterSearchParser extends AbstractContentAssistParser {
	
	@Inject
	private TwitterSearchGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr.internal.InternalTwitterSearchParser createParser() {
		de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr.internal.InternalTwitterSearchParser result = new de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr.internal.InternalTwitterSearchParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTwitterTypeAccess().getAlternatives(), "rule__TwitterType__Alternatives");
					put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
					put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
					put(grammarAccess.getIntOperatorsAccess().getAlternatives(), "rule__IntOperators__Alternatives");
					put(grammarAccess.getDistanceUnitAccess().getAlternatives(), "rule__DistanceUnit__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getTwitterPrimitiveTypeAccess().getGroup(), "rule__TwitterPrimitiveType__Group__0");
					put(grammarAccess.getTwitterObjectTypeAccess().getGroup(), "rule__TwitterObjectType__Group__0");
					put(grammarAccess.getFieldDclrAccess().getGroup(), "rule__FieldDclr__Group__0");
					put(grammarAccess.getSearchAccess().getGroup(), "rule__Search__Group__0");
					put(grammarAccess.getSearchAccess().getGroup_5(), "rule__Search__Group_5__0");
					put(grammarAccess.getSearchAccess().getGroup_5_2(), "rule__Search__Group_5_2__0");
					put(grammarAccess.getKeywordsAccess().getGroup(), "rule__Keywords__Group__0");
					put(grammarAccess.getKeywordsAccess().getGroup_2(), "rule__Keywords__Group_2__0");
					put(grammarAccess.getLocationAccess().getGroup(), "rule__Location__Group__0");
					put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
					put(grammarAccess.getIntConditionAccess().getGroup(), "rule__IntCondition__Group__0");
					put(grammarAccess.getDOUBLEAccess().getGroup(), "rule__DOUBLE__Group__0");
					put(grammarAccess.getDOUBLEAccess().getGroup_2(), "rule__DOUBLE__Group_2__0");
					put(grammarAccess.getDATEAccess().getGroup(), "rule__DATE__Group__0");
					put(grammarAccess.getModelAccess().getTwitterTypesAssignment_3(), "rule__Model__TwitterTypesAssignment_3");
					put(grammarAccess.getModelAccess().getSearchesAssignment_7(), "rule__Model__SearchesAssignment_7");
					put(grammarAccess.getTwitterPrimitiveTypeAccess().getNameAssignment_1(), "rule__TwitterPrimitiveType__NameAssignment_1");
					put(grammarAccess.getTwitterObjectTypeAccess().getNameAssignment_1(), "rule__TwitterObjectType__NameAssignment_1");
					put(grammarAccess.getTwitterObjectTypeAccess().getFieldsAssignment_3(), "rule__TwitterObjectType__FieldsAssignment_3");
					put(grammarAccess.getFieldDclrAccess().getNameAssignment_1(), "rule__FieldDclr__NameAssignment_1");
					put(grammarAccess.getFieldDclrAccess().getTypeAssignment_3(), "rule__FieldDclr__TypeAssignment_3");
					put(grammarAccess.getSearchAccess().getSearchTypeAssignment_3(), "rule__Search__SearchTypeAssignment_3");
					put(grammarAccess.getSearchAccess().getOptionsAssignment_4(), "rule__Search__OptionsAssignment_4");
					put(grammarAccess.getSearchAccess().getConditionsAssignment_5_1(), "rule__Search__ConditionsAssignment_5_1");
					put(grammarAccess.getSearchAccess().getConditionsAssignment_5_2_1(), "rule__Search__ConditionsAssignment_5_2_1");
					put(grammarAccess.getKeywordsAccess().getKeywordsAssignment_1(), "rule__Keywords__KeywordsAssignment_1");
					put(grammarAccess.getKeywordsAccess().getKeywordsAssignment_2_1(), "rule__Keywords__KeywordsAssignment_2_1");
					put(grammarAccess.getLocationAccess().getLonAssignment_3(), "rule__Location__LonAssignment_3");
					put(grammarAccess.getLocationAccess().getLatAssignment_5(), "rule__Location__LatAssignment_5");
					put(grammarAccess.getLocationAccess().getRadiusAssignment_7(), "rule__Location__RadiusAssignment_7");
					put(grammarAccess.getLocationAccess().getRadiusUnitAssignment_8(), "rule__Location__RadiusUnitAssignment_8");
					put(grammarAccess.getTimeAccess().getBeforeAssignment_1(), "rule__Time__BeforeAssignment_1");
					put(grammarAccess.getIntConditionAccess().getFieldDeclarationAssignment_0(), "rule__IntCondition__FieldDeclarationAssignment_0");
					put(grammarAccess.getIntConditionAccess().getOperatorAssignment_1(), "rule__IntCondition__OperatorAssignment_1");
					put(grammarAccess.getIntConditionAccess().getOperandAssignment_2(), "rule__IntCondition__OperandAssignment_2");
					put(grammarAccess.getBooleanConditionAccess().getFieldDeclarationAssignment(), "rule__BooleanCondition__FieldDeclarationAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr.internal.InternalTwitterSearchParser typedParser = (de.hub.modsoft.twittersearch.xtext.ui.contentassist.antlr.internal.InternalTwitterSearchParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public TwitterSearchGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TwitterSearchGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
