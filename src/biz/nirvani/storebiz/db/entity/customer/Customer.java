package biz.nirvani.storebiz.db.entity.customer;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

import com.google.appengine.api.datastore.Email;
import com.google.appengine.api.datastore.Key;

@Model
public class Customer implements IStorebizSerializableEntity {
	
	public final static String CUSTOMER_TYPE_INTERNET="CUSTOMER_TYPE_INTERNET";
	public final static String CUSTOMER_TYPE_STORE_ONLY="CUSTOMER_TYPE_STORE_ONLY";
	
	@Attribute(primaryKey=true)
	private Key customerKey;
	private String customerId;
	private Email email;
	private String name;
		
	@Attribute(lob=true)
	private Password password;
	
	private List<Key> postalAddresses;
	
	@Attribute(lob=true)
	private EmailPreference emailPreference;
	@Attribute(lob=true)
	private EmailSubscription emailSubscription;
	
	@Attribute(listener=CreationDate.class)
	private Date customerRegistrationDate;
	private Date customerRegistrationExpiryDate;
	@Attribute(listener=ModificationDate.class)
	private Date customerLastModificationDate;
	
	@Attribute(listener=CreationDate.class)
	private Date creationDate;
	
	public Date getCustomerLastModificationDate() {
		return customerLastModificationDate;
	}
	public void setCustomerLastModificationDate(Date customerLastModificationDate) {
		this.customerLastModificationDate = customerLastModificationDate;
	}
	private String customerType;
	
	public Key getCustomerKey() {
		return customerKey;
	}
	public void setCustomerKey(Key customerKey) {
		this.customerKey = customerKey;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Password getPassword() {
		return password;
	}
	public void setPassword(Password password) {
		this.password = password;
	}
	public List<Key> getPostalAddresses() {
		return postalAddresses;
	}
	public void setPostalAddresses(List<Key> addresses) {
		this.postalAddresses = addresses;
	}
	public EmailPreference getEmailPreference() {
		return emailPreference;
	}
	public void setEmailPreference(EmailPreference emailPreference) {
		this.emailPreference = emailPreference;
	}
	public EmailSubscription getEmailSubscription() {
		return emailSubscription;
	}
	public void setEmailSubscription(EmailSubscription emailSubscription) {
		this.emailSubscription = emailSubscription;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public Date getCustomerRegistrationDate() {
		return customerRegistrationDate;
	}
	public void setCustomerRegistrationDate(Date customerRegistrationDate) {
		this.customerRegistrationDate = customerRegistrationDate;
	}
	public Date getCustomerRegistrationExpiryDate() {
		return customerRegistrationExpiryDate;
	}
	public void setCustomerRegistrationExpiryDate(
			Date customerRegistrationExpiryDate) {
		this.customerRegistrationExpiryDate = customerRegistrationExpiryDate;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	
	
	
}
 