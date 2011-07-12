package biz.nirvani.storebiz.app.common.panel.address.editable;

import java.util.ArrayList;
import java.util.List;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

/**
 * @author pratimsc
 * 
 */
public class AddressEditablePanelModel implements IStorebizSerializableEntity {

	private String addressOwnerType;
	private String addressDisplayName;
	private String contactFullName;
	private List<AddressEditablePanelAddressLine> addressLines = new ArrayList<AddressEditablePanelAddressLine>();
	private String city;
	private String county;
	private String countyCode;
	private String country;
	private String countryCode;
	private String postCode;
	private List<AddressEditablePanelPhoneNumberPanelModel> phoneNumbers = new ArrayList<AddressEditablePanelPhoneNumberPanelModel>();
	private String addressType;
	private boolean prefferedAddress;

	public String getAddressOwnerType() {
		return addressOwnerType;
	}

	public void setAddressOwnerType(String addressOwnerType) {
		this.addressOwnerType = addressOwnerType;
	}

	public String getAddressDisplayName() {
		return addressDisplayName;
	}

	public void setAddressDisplayName(String addressDisplayName) {
		this.addressDisplayName = addressDisplayName;
	}

	public String getContactFullName() {
		return contactFullName;
	}

	public void setContactFullName(String contactFullName) {
		this.contactFullName = contactFullName;
	}

	public List<AddressEditablePanelAddressLine> getAddressLines() {
		return addressLines;
	}

	public void setAddressLines(List<AddressEditablePanelAddressLine> addressLines) {
		this.addressLines = addressLines;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public List<AddressEditablePanelPhoneNumberPanelModel> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<AddressEditablePanelPhoneNumberPanelModel> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public boolean isPrefferedAddress() {
		return prefferedAddress;
	}

	public void setPrefferedAddress(boolean prefferedAddress) {
		this.prefferedAddress = prefferedAddress;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "AddressPanelModel [addressOwnerType=" + addressOwnerType
				+ ", addressDisplayName=" + addressDisplayName
				+ ", contactFullName=" + contactFullName + ", addressLines="
				+ addressLines + ", city=" + city + ", county=" + county
				+ ", countyCode=" + countyCode + ", country=" + country
				+ ", countryCode=" + countryCode + ", postCode=" + postCode
				+ ", phoneNumbers=" + phoneNumbers + ", addressType="
				+ addressType + ", prefferedAddress=" + prefferedAddress
				+ ", getAddressOwnerType()=" + getAddressOwnerType()
				+ ", getAddressDisplayName()=" + getAddressDisplayName()
				+ ", getContactFullName()=" + getContactFullName()
				+ ", getAddressLines()=" + getAddressLines() + ", getCity()="
				+ getCity() + ", getCounty()=" + getCounty()
				+ ", getCountry()=" + getCountry() + ", getPostCode()="
				+ getPostCode() + ", getPhoneNumbers()=" + getPhoneNumbers()
				+ ", getAddressType()=" + getAddressType()
				+ ", isPrefferedAddress()=" + isPrefferedAddress()
				+ ", getCountyCode()=" + getCountyCode()
				+ ", getCountryCode()=" + getCountryCode() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
