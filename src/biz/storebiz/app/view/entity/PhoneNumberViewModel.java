package biz.storebiz.app.view.entity;

import biz.storebiz.app.common.panel.address.editable.*;
import biz.storebiz.db.IStorebizSerializableEntity;

public class PhoneNumberViewModel extends WebViewModel{
	private String phoneNumberType;
	private String phoneNumberValue;

	public PhoneNumberViewModel(String phoneNumberType, String phoneNumberValue) {
		this.phoneNumberType = phoneNumberType;
		this.phoneNumberValue = phoneNumberValue;
	}

	public PhoneNumberViewModel(AddressEditablePanelPhoneNumberPanelModel phoneNumberPanelModel) {
		phoneNumberType = phoneNumberPanelModel.getPhoneNumberType();
		phoneNumberValue = phoneNumberPanelModel.getPhoneNumberValue();
	}

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
