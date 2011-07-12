package biz.nirvani.storebiz.biz.common.constants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class CApplicationConstants {
	public final static String APPLICATION_DATE_FORMAT="yyyyMMdd";
	public final static SimpleDateFormat APP_SIMPLE_DATE_FORMAT_INSTANCE = new SimpleDateFormat(CApplicationConstants.APPLICATION_DATE_FORMAT);
	private static Date APP_ENTITY_DEFAULT_EXPIRATION_DATE;	
	public static Date getAApplicationEntityDefaultExpirationDate() {
		
		if(APP_ENTITY_DEFAULT_EXPIRATION_DATE==null){
			try {
				APP_ENTITY_DEFAULT_EXPIRATION_DATE = APP_SIMPLE_DATE_FORMAT_INSTANCE.parse("35001231");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return APP_ENTITY_DEFAULT_EXPIRATION_DATE;
	}
	
	public final static int APP_PAGINATION_NUMBER_OF_RECORDS_IN_A_PAGE=10;
	
}
