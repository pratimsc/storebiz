package biz.storebiz.db.entity.common;

import biz.storebiz.db.*;

public class PhoneNumber implements IStorebizSerializableEntity {
	private String phoneNumberType;
	private com.google.appengine.api.datastore.PhoneNumber phoneNumberValue;
	
	public PhoneNumber(String phoneNumberType, String phoneNumberValue){
		this.phoneNumberType = phoneNumberType;
		this.phoneNumberValue = new com.google.appengine.api.datastore.PhoneNumber(phoneNumberValue);
	}

	public String getPhoneNumberType() {
		return phoneNumberType;
	}

	public void setPhoneNumberType(String phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}

	public String getPhoneNumberValue() {
		return phoneNumberValue.getNumber();
	}

	public void setPhoneNumberValue(String phoneNumberValue) {
		this.phoneNumberValue = new com.google.appengine.api.datastore.PhoneNumber(phoneNumberValue);
	}
	
	
}
