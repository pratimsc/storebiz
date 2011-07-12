package biz.nirvani.storebiz.db.entity.common;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import com.google.appengine.api.datastore.Key;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

@Model
public class County implements IStorebizSerializableEntity {
	@Attribute(primaryKey = true)
	private Key countyKey;
	private String countyCode;
	private String countyCodeType;
	private String countyName;
	private String language;
	private Key countryKey;
	private String countryCode;

	@Attribute(listener = CreationDate.class)
	private Date creationDate;
	@Attribute(listener = ModificationDate.class)
	private Date lastModificationDate;

	public Key getCountyKey() {
		return countyKey;
	}

	public void setCountyKey(Key countyKey) {
		this.countyKey = countyKey;
	}

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}

	public String getCountyCodeType() {
		return countyCodeType;
	}

	public void setCountyCodeType(String countyCodeType) {
		this.countyCodeType = countyCodeType;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Key getCountryKey() {
		return countryKey;
	}

	public void setCountryKey(Key countryKey) {
		this.countryKey = countryKey;
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

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
