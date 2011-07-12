package biz.nirvani.storebiz.db.entity.customer;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

public class Password implements IStorebizSerializableEntity {
	private String encodedPassword;

	public String getEncodedPassword() {
		return encodedPassword;
	}

	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}
	
	
}
