package de.hub.modsoft.twittersearch.xtext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		private SimpleDateFormat dataFormat = new SimpleDateFormat("dd.MM.yyyy");

		@Override
		public Date toValue(String string, INode node) throws ValueConverterException {
			try {
				return dataFormat.parse(string);
			} catch (ParseException e) {
				throw new ValueConverterException("Could not parse the data " + string, node, e);
			}		
		}

		@Override
		public String toString(Date value) throws ValueConverterException {
			return dataFormat.format(value);
		}		  
	  };
	}
}