package biz.nirvani.storebiz.db.entity.common;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

@Model
public class WarehouseLocation implements IStorebizSerializableEntity {
	@Attribute(primaryKey=true)
	private Key warehouseLocationKey;
	private String warehouseLocationCode;
	private String warehouseLocationShortDescription;
	private Text warehouseLocationDetailDescription;
	private Key associatedParentWarehouseLocation;
	private Key postalAddress;

	@Attribute(listener=CreationDate.class)
	private Date creationDate;

	public Key getWarehouseLocationKey() {
		return warehouseLocationKey;
	}

	public void setWarehouseLocationKey(Key warehouseLocationKey) {
		this.warehouseLocationKey = warehouseLocationKey;
	}

	public String getWarehouseLocationCode() {
		return warehouseLocationCode;
	}

	public void setWarehouseLocationCode(String warehouseLocationCode) {
		this.warehouseLocationCode = warehouseLocationCode;
	}

	public String getWarehouseLocationShortDescription() {
		return warehouseLocationShortDescription;
	}

	public void setWarehouseLocationShortDescription(
			String warehouseLocationShortDescription) {
		this.warehouseLocationShortDescription = warehouseLocationShortDescription;
	}

	public Text getWarehouseLocationDetailDescription() {
		return warehouseLocationDetailDescription;
	}

	public void setWarehouseLocationDetailDescription(
			Text warehouseLocationDetailDescription) {
		this.warehouseLocationDetailDescription = warehouseLocationDetailDescription;
	}

	public Key getAssociatedParentWarehouseLocation() {
		return associatedParentWarehouseLocation;
	}

	public void setAssociatedParentWarehouseLocation(
			Key associatedParentWarehouseLocation) {
		this.associatedParentWarehouseLocation = associatedParentWarehouseLocation;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Key getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(Key postalAddress) {
		this.postalAddress = postalAddress;
	}
	
	
	
}
