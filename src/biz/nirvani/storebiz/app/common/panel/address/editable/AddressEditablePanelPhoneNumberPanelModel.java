package biz.nirvani.storebiz.app.common.panel.address.editable;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

public class AddressEditablePanelPhoneNumberPanelModel implements IStorebizSerializableEntity {
	private String phoneNumberType;
	private String phoneNumberValue;
	public String getPhoneNumberType() {
		return phoneNumberType;
	}
	public void setPhoneNumberType(String phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}
	public String getPhoneNumberValue() {
		return phoneNumberValue;
	}
	public void setPhoneNumberValue(String phoneNumberValue) {
		this.phoneNumberValue = phoneNumberValue;
	}
	
}
