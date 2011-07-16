package biz.storebiz.db.entity.customer;

import biz.storebiz.db.IStorebizSerializableEntity;

public class EmailPreference implements IStorebizSerializableEntity{
	public static String FORMAT_HTML="FORMAT_HTML";
	public static String FORMAT_TEXT="FORMAT_TEXT";
	
	private String emailFormat;
	private boolean acceptEmailCommunication;
	private boolean acceptEmailCommunicationFromThirdParty;
	public String getEmailFormat() {
		return emailFormat;
	}
	public void setEmailFormat(String emailFormat) {
		this.emailFormat = emailFormat;
	}
	public boolean isAcceptEmailCommunication() {
		return acceptEmailCommunication;
	}
	public void setAcceptEmailCommunication(boolean acceptEmailCommunication) {
		this.acceptEmailCommunication = acceptEmailCommunication;
	}
	public boolean isAcceptEmailCommunicationFromThirdParty() {
		return acceptEmailCommunicationFromThirdParty;
	}
	public void setAcceptEmailCommunicationFromThirdParty(
			boolean acceptEmailCommunicationFromThirdParty) {
		this.acceptEmailCommunicationFromThirdParty = acceptEmailCommunicationFromThirdParty;
	}
	
	
}
