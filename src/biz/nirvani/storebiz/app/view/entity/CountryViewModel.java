package biz.nirvani.storebiz.app.view.entity;

import java.util.Date;

import com.google.appengine.api.datastore.Key;

public class CountryViewModel extends WebViewModel {
	private Key gaeCountryKey;
	private String countryCode;
	private String countryCodeType;
	private String countryName;
	private String language;
	private Date creationDate;
	private Date lastModificationDate;
	
	public Key getGaeCountryKey() {
		return gaeCountryKey;
	}

	public void setGaeCountryKey(Key gaeCountryKey) {
		this.gaeCountryKey = gaeCountryKey;
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

	public void setCountryCodeType(String countryCodeType) {
		this.countryCodeType = countryCodeType;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
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

	@Override
	public String toString() {
		return "CountryViewModel [gaeCountryKey=" + gaeCountryKey
				+ ", countryCode=" + countryCode + ", countryCodeType="
				+ countryCodeType + ", countryName=" + countryName
				+ ", language=" + language + ", creationDate=" + creationDate
				+ ", lastModificationDate=" + lastModificationDate + "]";
	}
	
	
}
