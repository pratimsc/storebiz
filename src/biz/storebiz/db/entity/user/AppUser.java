package biz.storebiz.db.entity.user;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.users.User;

import biz.storebiz.db.IStorebizSerializableEntity;
@Model
public class AppUser implements IStorebizSerializableEntity {
	/**
	 * 
	 */ 
	private static final long serialVersionUID = -9066596454848465831L;
	
	@Attribute(primaryKey=true)
	private Key userKey;
	private User googleUser;
	private String userId;
	private String userName;
	private List<String> roles;
	private String status;
	
	@Attribute(listener = CreationDate.class)
	private Date registrationDate;
	private Date registrationExpiryDate;

	@Attribute(listener = CreationDate.class)
	private Date creationDate;
	@Attribute(listener = ModificationDate.class)
	private Date lastModificationDate;
	public Key getUserKey() {
		return userKey;
	}
	public void setUserKey(Key userKey) {
		this.userKey = userKey;
	}
	public User getGoogleUser() {
		return googleUser;
	}
	public void setGoogleUser(User googleUser) {
		this.googleUser = googleUser;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
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
	@Override
	public String toString() {
		return String
				.format("AppUser [userKey=%s, googleUser=%s, userId=%s, userName=%s, roles=%s, status=%s, registrationDate=%s, registrationExpiryDate=%s, creationDate=%s, lastModificationDate=%s]",
						userKey, googleUser, userId, userName, roles, status,
						registrationDate, registrationExpiryDate, creationDate,
						lastModificationDate);
	}
		
}
