package biz.nirvani.storebiz.app.view.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.annotations.Element;

import org.simpleframework.xml.Root;

import biz.nirvani.storebiz.app.common.panel.address.editable.AddressEditablePanelAddressLine;
import biz.nirvani.storebiz.app.common.panel.address.editable.AddressEditablePanelModel;
import biz.nirvani.storebiz.app.common.panel.address.editable.AddressEditablePanelPhoneNumberPanelModel;

import com.google.appengine.api.datastore.Key;

@Root
public class AddressViewModel extends WebViewModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5149058843306255036L;
	private Key gaeAddressKey;
	@Element
	private Key addressownerKey;
	@Element
	private String addressOwnerType;
	@Element
	private String addressDisplayName;
	@Element
	private String contactFullName;
	@Element
	private List<String> addressLines;
	@Element
	private String city;
	@Element
	private String county;
	@Element
	private String countyCode;
	@Element
	private String country;
	@Element
	private String countryCode;	
	@Element
	private String postCode;
	@Element	
	private List<PhoneNumberViewModel> phoneNumbers;
	@Element
	private String addressType;
	@Element
	private boolean prefferedAddress;
	@Element
	private Date addressRegistrationDate;
	@Element
	private Date addressRegistrationExpiryDate;

	@Element
	private Date creationDate;
	@Element
	private Date lastModificationDate;
	
	public AddressViewModel(){
		super();
	}
	
	public AddressViewModel(AddressEditablePanelModel address){
		if(address==null){
			return;
		}
		setAddressDisplayName(address.getAddressDisplayName());
		setContactFullName(address.getContactFullName());
		if(addressLines==null){
			addressLines = new ArrayList<String>();
		}
		for(AddressEditablePanelAddressLine addressline:address.getAddressLines()){
			getAddressLines().add(addressline.getAddressLineValue());
		}
		setAddressOwnerType(address.getAddressOwnerType());
		setAddressType(address.getAddressType());
		setCity(address.getCity());
		setCountry(address.getCountry());
		setCountryCode(address.getCountryCode());
		setCounty(address.getCounty());
		setCountyCode(address.getCountyCode());
		setPostCode(address.getPostCode());
		
		if (phoneNumbers == null){
			phoneNumbers = new ArrayList<PhoneNumberViewModel>();
		}
		
		for(AddressEditablePanelPhoneNumberPanelModel phoneNumberVM : address.getPhoneNumbers()){
			PhoneNumberViewModel phoneNumberViewModel = new PhoneNumberViewModel(phoneNumberVM);
			getPhoneNumbers().add(phoneNumberViewModel);
		}
	}
		
	public Key getGaeAddressKey() {
		return gaeAddressKey;
	}

	public void setGaeAddressKey(Key gaeAddressKey) {
		this.gaeAddressKey = gaeAddressKey;
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

	

	public List<PhoneNumberViewModel> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumberViewModel> phoneNumbers) {
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

	@Override
	public String toString() {
		return "AddressViewModel [gaeAddressKey=" + gaeAddressKey
				+ ", addressownerKey=" + addressownerKey
				+ ", addressOwnerType=" + addressOwnerType
				+ ", addressDisplayName=" + addressDisplayName
				+ ", contactFullName=" + contactFullName + ", addressLines="
				+ addressLines + ", city=" + city + ", county=" + county
				+ ", countyCode=" + countyCode + ", country=" + country
				+ ", countryCode=" + countryCode + ", postCode=" + postCode
				+ ", phoneNumbers=" + phoneNumbers + ", addressType="
				+ addressType + ", prefferedAddress=" + prefferedAddress
				+ ", addressRegistrationDate=" + addressRegistrationDate
				+ ", addressRegistrationExpiryDate="
				+ addressRegistrationExpiryDate + ", creationDate="
				+ creationDate + ", lastModificationDate="
				+ lastModificationDate + "]";
	}
	
	
	
}
