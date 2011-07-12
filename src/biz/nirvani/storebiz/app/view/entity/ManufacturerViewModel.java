package biz.nirvani.storebiz.app.view.entity;

import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.Key;

public class ManufacturerViewModel extends WebViewModel {

	private Key gaeManufacturerKey;
	private String manufacturerId;
	private String manufacturerName;
	private List<AddressViewModel> postalAddresses;
	private String primaryAddressCountryCode;
	private String primaryAddressCountry;
	private String primaryAddressCountyCode;
	private String primaryAddressCounty;
	private String status;

	private Date manufacturerRegistrationDate;
	private Date manufacturerRegistrationExpiryDate;

	private Date creationDate;
	private Date lastModificationDate;

	public Key getGaeManufacturerKey() {
		return gaeManufacturerKey;
	}

	public void setGaeManufacturerKey(Key gaeManufacturerKey) {
		this.gaeManufacturerKey = gaeManufacturerKey;
	}

	public String getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public List<AddressViewModel> getPostalAddresses() {
		return postalAddresses;
	}

	public void setPostalAddresses(List<AddressViewModel> postalAddresses) {
		this.postalAddresses = postalAddresses;
	}

	public String getPrimaryAddressCountryCode() {
		return primaryAddressCountryCode;
	}

	public void setPrimaryAddressCountryCode(String primaryAddressCountryCode) {
		this.primaryAddressCountryCode = primaryAddressCountryCode;
	}

	public String getPrimaryAddressCountyCode() {
		return primaryAddressCountyCode;
	}

	public void setPrimaryAddressCountyCode(String primaryAddressCountyCode) {
		this.primaryAddressCountyCode = primaryAddressCountyCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getManufacturerRegistrationDate() {
		return manufacturerRegistrationDate;
	}

	public void setManufacturerRegistrationDate(
			Date manufacturerRegistrationDate) {
		this.manufacturerRegistrationDate = manufacturerRegistrationDate;
	}

	public Date getManufacturerRegistrationExpiryDate() {
		return manufacturerRegistrationExpiryDate;
	}

	public void setManufacturerRegistrationExpiryDate(
			Date manufacturerRegistrationExpiryDate) {
		this.manufacturerRegistrationExpiryDate = manufacturerRegistrationExpiryDate;
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

	public String getPrimaryAddressCountry() {
		return primaryAddressCountry;
	}

	public void setPrimaryAddressCountry(String primaryAddressCountry) {
		this.primaryAddressCountry = primaryAddressCountry;
	}

	public String getPrimaryAddressCounty() {
		return primaryAddressCounty;
	}

	public void setPrimaryAddressCounty(String primaryAddressCounty) {
		this.primaryAddressCounty = primaryAddressCounty;
	}

	@Override
	public String toString() {
		return "ManufacturerViewModel [gaeManufacturerKey="
				+ gaeManufacturerKey + ", manufacturerId=" + manufacturerId
				+ ", manufacturerName=" + manufacturerName + ", postalAddress="
				+ postalAddresses + ", primaryAddressCountryCode="
				+ primaryAddressCountryCode + ", primaryAddressCountry="
				+ primaryAddressCountry + ", primaryAddressCountyCode="
				+ primaryAddressCountyCode + ", primaryAddressCounty="
				+ primaryAddressCounty + ", status=" + status
				+ ", manufacturerRegistrationDate="
				+ manufacturerRegistrationDate
				+ ", manufacturerRegistrationExpiryDate="
				+ manufacturerRegistrationExpiryDate + ", creationDate="
				+ creationDate + ", lastModificationDate="
				+ lastModificationDate + "]";
	}

}
