package de.hub.modsoft.twittersearch.xtext;

import java.util.Date;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.nodemodel.INode;

public class TwitterValueConverterService extends AbstractDeclarativeValueConverterService {
	@ValueConverter(rule = "DATE")
	public IValueConverter<Date> getDateValueConverter() {
	  return new IValueConverter<Date>() {
		@Override
		public Date toValue(String string, INode node) throws ValueConverterException {
			// TODO
			throw new ValueConverterException("Not implemented", node, null);
		}

		@Override
		public String toString(Date value) throws ValueConverterException {
			// TODO
			throw new ValueConverterException("Not implemented", null, null);
		}		  
	  };
	}
}