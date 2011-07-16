package biz.storebiz.db.entity.common;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import com.google.appengine.api.datastore.Key;

import biz.storebiz.db.IStorebizSerializableEntity;

@Model
public class Country implements IStorebizSerializableEntity {
	@Attribute(primaryKey=true)
	private Key countryKey;
	private String countryCode;
	private String countryCodeType;
	private String countryName;
	private String language;
	
	@Attribute(listener=CreationDate.class)
	private Date creationDate;
	@Attribute(listener=ModificationDate.class)
	private Date lastModificationDate;
	public Key getCountryKey() {
		return countryKey;
	}
	public void setCountryKey(Key countryKey) {
		this.countryKey = countryKey;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryCodeType() {
		return countryCodeType;
	}
	public void setCountryCodeType(String countyCodeType) {
		this.countryCodeType = countyCodeType;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
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
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
