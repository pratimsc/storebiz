package biz.nirvani.storebiz.db.entity.manufacturer;

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
public class Manufacturer implements IStorebizSerializableEntity {
	@Attribute(primaryKey = true)
	private Key manufacturerKey;
	private String manufacturerId;
	private String manufacturerName;
	@Attribute(lob=true)
	private List<Address> postalAddresses;
	private String primaryAddressCountryCode;
	private String primaryAddressCountry;
	private String primaryAddressCountyCode;
	private String primaryAddressCounty;
	
	private String status;

	@Attribute(listener = CreationDate.class)
	private Date manufacturerRegistrationDate;
	private Date manufacturerRegistrationExpiryDate;

	@Attribute(listener = CreationDate.class)
	private Date creationDate;
	@Attribute(listener = ModificationDate.class)
	private Date lastModificationDate;

	public Manufacturer() {
		super();
	}	
		
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !this.getClass().isInstance(obj)) return false;
		Manufacturer temp = (Manufacturer)obj;
		return(this.getManufacturerKey().equals(temp.getManufacturerKey()));
	}



	@Override
	public String toString() {
		return "Manufacturer [manufacturerKey=" + manufacturerKey
				+ ", manufacturerId=" + manufacturerId + ", manufacturerName="
				+ manufacturerName + ", postalAddresses=" + postalAddresses
				+ ", primaryAddressCountryCode=" + primaryAddressCountryCode
				+ ", primaryAddressCountry=" + primaryAddressCountry
				+ ", primaryAddressCountyCode=" + primaryAddressCountyCode
				+ ", primaryAddressCounty=" + primaryAddressCounty
				+ ", status=" + status + ", manufacturerRegistrationDate="
				+ manufacturerRegistrationDate
				+ ", manufacturerRegistrationExpiryDate="
				+ manufacturerRegistrationExpiryDate + ", creationDate="
				+ creationDate + ", lastModificationDate="
				+ lastModificationDate + ", getManufacturerKey()="
				+ getManufacturerKey() + ", getManufacturerId()="
				+ getManufacturerId() + ", getManufacturerName()="
				+ getManufacturerName() + ", getPostalAddresses()="
				+ getPostalAddresses() + ", getPrimaryAddressCountryCode()="
				+ getPrimaryAddressCountryCode()
				+ ", getPrimaryAddressCountry()=" + getPrimaryAddressCountry()
				+ ", getPrimaryAddressCounty()=" + getPrimaryAddressCounty()
				+ ", getPrimaryAddressCountyCode()="
				+ getPrimaryAddressCountyCode() + ", getStatus()="
				+ getStatus() + ", getManufacturerRegistrationDate()="
				+ getManufacturerRegistrationDate()
				+ ", getManufacturerRegistrationExpiryDate()="
				+ getManufacturerRegistrationExpiryDate()
				+ ", getCreationDate()=" + getCreationDate()
				+ ", getLastModificationDate()=" + getLastModificationDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public Key getManufacturerKey() {
		return manufacturerKey;
	}

	public void setManufacturerKey(Key manufacturerKey) {
		this.manufacturerKey = manufacturerKey;
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

	public String getPrimaryAddressCounty() {
		return primaryAddressCounty;
	}

	public void setPrimaryAddressCounty(String primaryAddressCounty) {
		this.primaryAddressCounty = primaryAddressCounty;
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

	public void setManufacturerRegistrationDate(Date manufacturerRegistrationDate) {
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

	
	
}
