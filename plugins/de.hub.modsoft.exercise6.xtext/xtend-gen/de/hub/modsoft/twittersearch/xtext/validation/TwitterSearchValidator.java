/**
 * generated by Xtext
 */
package de.hub.modsoft.twittersearch.xtext.validation;

import de.hub.modsoft.twittersearch.model.Condition;
import de.hub.modsoft.twittersearch.xtext.validation.AbstractTwitterSearchValidator;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

@SuppressWarnings("all")
public class TwitterSearchValidator extends AbstractTwitterSearchValidator {
  @Check(CheckType.FAST)
  public Object checkConditionFieldPartOfSearchType(final Condition condition) {
    return null;
  }
  
  @Check(CheckType.FAST)
  public Object checkConditionTypeMatchesFieldType(final Condition condition) {
    return null;
  }
}
