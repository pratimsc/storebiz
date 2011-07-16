package biz.storebiz.db.entity.uniqueid;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

import biz.storebiz.db.IStorebizSerializableEntity;

@Model
public class ManufacturerUniqueIdRegistry implements
		IStorebizSerializableEntity {
	@Attribute (primaryKey=true)
	public Key manufacturerUniqueIdKey;
	public long totalManufacturerRegistered;
	public long manufacturerIdSequence;
	public String manufacturerIdPrefix;
	
	public Key getManufacturerUniqueIdKey() {
		return manufacturerUniqueIdKey;
	}
	public void setManufacturerUniqueIdKey(Key manufacturerUniqueIdKey) {
		this.manufacturerUniqueIdKey = manufacturerUniqueIdKey;
	}
	public long getTotalManufacturerRegistered() {
		return totalManufacturerRegistered;
	}
	public void setTotalManufacturerRegistered(long totalManufacturerRegistered) {
		this.totalManufacturerRegistered = totalManufacturerRegistered;
	}
	public long getManufacturerIdSequence() {
		return manufacturerIdSequence;
	}
	public void setManufacturerIdSequence(long manufacturerIdSequence) {
		this.manufacturerIdSequence = manufacturerIdSequence;
	}
	public String getManufacturerIdPrefix() {
		return manufacturerIdPrefix;
	}
	public void setManufacturerIdPrefix(String manufacturerIdPrefix) {
		this.manufacturerIdPrefix = manufacturerIdPrefix;
	}	
	
}
