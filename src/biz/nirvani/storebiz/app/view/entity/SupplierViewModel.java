package biz.nirvani.storebiz.app.view.entity;

import java.util.Date;
import java.util.List;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

import com.google.appengine.api.datastore.Key;

public class SupplierViewModel extends WebViewModel {

	private Key gaeSupplierKey;
	private String supplierId;
	private String supplierName;
	private List<AddressViewModel> postalAddresses;
	private String primaryAddressCountryCode;
	private String primaryAddressCountry;
	private String primaryAddressCountyCode;
	private String primaryAddressCounty;
	private String status;

	private Date supplierRegistrationDate;
	private Date supplierRegistrationExpiryDate;

	private Date creationDate;
	private Date lastModificationDate;
	@Override
	public String toString() {
		return "SupplierViewModel [gaeSupplierKey=" + gaeSupplierKey
				+ ", supplierId=" + supplierId + ", supplierName="
				+ supplierName + ", postalAddresses=" + postalAddresses
				+ ", primaryAddressCountryCode=" + primaryAddressCountryCode
				+ ", primaryAddressCountry=" + primaryAddressCountry
				+ ", primaryAddressCountyCode=" + primaryAddressCountyCode
				+ ", primaryAddressCounty=" + primaryAddressCounty
				+ ", status=" + status + ", supplierRegistrationDate="
				+ supplierRegistrationDate
				+ ", supplierRegistrationExpiryDate="
				+ supplierRegistrationExpiryDate + ", creationDate="
				+ creationDate + ", lastModificationDate="
				+ lastModificationDate + "]";
	}
	public Key getGaeSupplierKey() {
		return gaeSupplierKey;
	}
	public void setGaeSupplierKey(Key gaeSupplierKey) {
		this.gaeSupplierKey = gaeSupplierKey;
	}
	public String getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
	public String getPrimaryAddressCountry() {
		return primaryAddressCountry;
	}
	public void setPrimaryAddressCountry(String primaryAddressCountry) {
		this.primaryAddressCountry = primaryAddressCountry;
	}
	public String getPrimaryAddressCountyCode() {
		return primaryAddressCountyCode;
	}
	public void setPrimaryAddressCountyCode(String primaryAddressCountyCode) {
		this.primaryAddressCountyCode = primaryAddressCountyCode;
	}
	public String getPrimaryAddressCounty() {
		return primaryAddressCounty;
	}
	public void setPrimaryAddressCounty(String primaryAddressCounty) {
		this.primaryAddressCounty = primaryAddressCounty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getSupplierRegistrationDate() {
		return supplierRegistrationDate;
	}
	public void setSupplierRegistrationDate(Date supplierRegistrationDate) {
		this.supplierRegistrationDate = supplierRegistrationDate;
	}
	public Date getSupplierRegistrationExpiryDate() {
		return supplierRegistrationExpiryDate;
	}
	public void setSupplierRegistrationExpiryDate(
			Date supplierRegistrationExpiryDate) {
		this.supplierRegistrationExpiryDate = supplierRegistrationExpiryDate;
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
	
	
}
