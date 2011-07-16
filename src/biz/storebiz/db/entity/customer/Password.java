package biz.storebiz.db.entity.customer;

import biz.storebiz.db.IStorebizSerializableEntity;

public class Password implements IStorebizSerializableEntity {
	private String encodedPassword;

	public String getEncodedPassword() {
		return encodedPassword;
	}

	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}
	
	
}
