package biz.nirvani.storebiz.db.entity.supplier;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;
import biz.nirvani.storebiz.db.entity.common.Address;

import com.google.appengine.api.datastore.Key;

@Model
public class Supplier implements IStorebizSerializableEntity {
	@Attribute(primaryKey = true)
	private Key supplierKey;
	private String supplierId;
	private String supplierName;
	@Attribute(lob = true)
	private List<Address> postalAddresses;
	private String primaryAddressCountryCode;
	private String primaryAddressCountry;
	private String primaryAddressCountyCode;
	private String primaryAddressCounty;

	private String status;

	@Attribute(listener = CreationDate.class)
	private Date registrationDate;
	private Date registrationExpiryDate;

	@Attribute(listener = CreationDate.class)
	private Date creationDate;
	@Attribute(listener = ModificationDate.class)
	private Date lastModificationDate;

	@Override
	public String toString() {
		return "Supplier [supplierKey=" + supplierKey + ", supplierId="
				+ supplierId + ", supplierName=" + supplierName
				+ ", postalAddresses=" + postalAddresses
				+ ", primaryAddressCountryCode=" + primaryAddressCountryCode
				+ ", primaryAddressCountry=" + primaryAddressCountry
				+ ", primaryAddressCountyCode=" + primaryAddressCountyCode
				+ ", primaryAddressCounty=" + primaryAddressCounty
				+ ", status=" + status + ", registrationDate="
				+ registrationDate + ", registrationExpiryDate="
				+ registrationExpiryDate + ", creationDate=" + creationDate
				+ ", lastModificationDate=" + lastModificationDate + "]";
	}

	public Key getSupplierKey() {
		return supplierKey;
	}

	public void setSupplierKey(Key supplierKey) {
		this.supplierKey = supplierKey;
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

	public List<Address> getPostalAddresses() {
		return postalAddresses;
	}

	public void setPostalAddresses(List<Address> postalAddresses) {
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

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getRegistrationExpiryDate() {
		return registrationExpiryDate;
	}

	public void setRegistrationExpiryDate(Date registrationExpiryDate) {
		this.registrationExpiryDate = registrationExpiryDate;
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
