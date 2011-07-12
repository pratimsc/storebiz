package biz.nirvani.storebiz.app.view.entity;

import java.util.Date;

import com.google.appengine.api.datastore.Key;

public class CountyViewModel extends WebViewModel{
	private Key gaeCountyKey;
	private String countyCode;
	private String countyCodeType;
	private String countyName;
	private String language;
	private Key countryKey;
	private String countryCode;
	private Date creationDate;
	private Date lastModificationDate;
	public Key getGaeCountyKey() {
		return gaeCountyKey;
	}
	public void setGaeCountyKey(Key gaeCountyKey) {
		this.gaeCountyKey = gaeCountyKey;
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
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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
