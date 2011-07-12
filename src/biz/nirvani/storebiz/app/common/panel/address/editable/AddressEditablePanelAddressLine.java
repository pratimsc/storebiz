package biz.nirvani.storebiz.app.common.panel.address.editable;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

public class AddressEditablePanelAddressLine implements IStorebizSerializableEntity {

	private String addressLineValue;

	public AddressEditablePanelAddressLine(String addressLineValue) {
		this.addressLineValue = addressLineValue;
	}

	public AddressEditablePanelAddressLine() {

	}

	public String getAddressLineValue() {
		return addressLineValue;
	}

	public void setAddressLineValue(String addressLineValue) {
		this.addressLineValue = addressLineValue;
	}

}
