package biz.nirvani.storebiz.db.entity.common;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

import com.google.appengine.api.datastore.Key;
import biz.nirvani.storebiz.db.entity.common.PhoneNumber;

@Model
public class Address implements IStorebizSerializableEntity {

	@Attribute(primaryKey = true)
	private Key addressKey;
	private Key addressownerKey;
	private String addressOwnerType;
	private String addressDisplayName;
	private String contactFullName;
	private List<String> addressLines;
	private String city;
	private String county;
	private String countyCode;
	private String country;
	private String countryCode;
	private String postCode;
	@Attribute(lob = true)
	private List<PhoneNumber> phoneNumbers;
	private String addressType;
	private boolean prefferedAddress;

	@Attribute(listener = CreationDate.class)
	private Date addressRegistrationDate;
	private Date addressRegistrationExpiryDate;

	@Attribute(listener = CreationDate.class)
	private Date creationDate;
	@Attribute(listener = ModificationDate.class)
	private Date lastModificationDate;

	public Key getAddressKey() {
		return addressKey;
	}

	public void setAddressKey(Key addressKey) {
		this.addressKey = addressKey;
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

	public List<String> getAddressLines() {
		return addressLines;
	}

	public void setAddressLines(List<String> addressLines) {
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

	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
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

	public Key getAddressownerKey() {
		return addressownerKey;
	}

	public void setAddressownerKey(Key addressownerKey) {
		this.addressownerKey = addressownerKey;
	}

	public String getAddressOwnerType() {
		return addressOwnerType;
	}

	public void setAddressOwnerType(String addressOwnerType) {
		this.addressOwnerType = addressOwnerType;
	}

	public Date getAddressRegistrationDate() {
		return addressRegistrationDate;
	}

	public void setAddressRegistrationDate(Date addressRegistrationDate) {
		this.addressRegistrationDate = addressRegistrationDate;
	}

	public Date getAddressRegistrationExpiryDate() {
		return addressRegistrationExpiryDate;
	}

	public void setAddressRegistrationExpiryDate(
			Date addressRegistrationExpiryDate) {
		this.addressRegistrationExpiryDate = addressRegistrationExpiryDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
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
}
