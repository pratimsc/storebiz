package biz.nirvani.storebiz.db.entity.common;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

@Model
public class AppCurrency implements IStorebizSerializableEntity {
	@Attribute(primaryKey=true)
	private Key currencyKey;
	private String baseCurrencyCode;
	private long exchangeRateWithoutDecimalAdjustement;
	private long decimalPositionAdjuster;
	private String exchangeCurrencyCode;
	
	@Attribute(listener=CreationDate.class)
	private Date creationDate;
	
	public AppCurrency(){
		super();
	}
	
	public AppCurrency(Key currencyKey, String baseCurrencyCode, long exchangeRateWithoutDecimalAdjustement, long decimalPositionAdjuster, String exchangeCurrencyCode ){
		this.currencyKey = currencyKey;
		this.baseCurrencyCode = baseCurrencyCode;
		this.exchangeRateWithoutDecimalAdjustement = exchangeRateWithoutDecimalAdjustement;
		this.decimalPositionAdjuster = decimalPositionAdjuster;
		this.exchangeCurrencyCode = exchangeCurrencyCode;
	}

	public Key getCurrencyKey() {
		return currencyKey;
	}

	public void setCurrencyKey(Key currencyKey) {
		this.currencyKey = currencyKey;
	}

	public String getBaseCurrencyCode() {
		return baseCurrencyCode;
	}

	public void setBaseCurrencyCode(String baseCurrencyCode) {
		this.baseCurrencyCode = baseCurrencyCode;
	}

	public long getExchangeRateWithoutDecimalAdjustement() {
		return exchangeRateWithoutDecimalAdjustement;
	}

	public void setExchangeRateWithoutDecimalAdjustement(
			long exchangeRateWithoutDecimalAdjustement) {
		this.exchangeRateWithoutDecimalAdjustement = exchangeRateWithoutDecimalAdjustement;
	}

	public long getDecimalPositionAdjuster() {
		return decimalPositionAdjuster;
	}

	public void setDecimalPositionAdjuster(long decimalPositionAdjuster) {
		this.decimalPositionAdjuster = decimalPositionAdjuster;
	}

	public String getExchangeCurrencyCode() {
		return exchangeCurrencyCode;
	}

	public void setExchangeCurrencyCode(String exchangeCurrencyCode) {
		this.exchangeCurrencyCode = exchangeCurrencyCode;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}
	
	
}
