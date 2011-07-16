package biz.storebiz.db.entity.uniqueid;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import biz.storebiz.db.IStorebizSerializableEntity;

import com.google.appengine.api.datastore.Key;

@Model
public class SupplierUniqueIdRegistry implements
		IStorebizSerializableEntity {
	@Attribute (primaryKey=true)
	public Key key;
	public long totalRegistered;
	public long idSequence;
	public int isSequenceLength;
	public String idPrefix;
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public long getTotalRegistered() {
		return totalRegistered;
	}
	public void setTotalRegistered(long totalRegistered) {
		this.totalRegistered = totalRegistered;
	}
	public long getIdSequence() {
		return idSequence;
	}
	public void setIdSequence(long idSequence) {
		this.idSequence = idSequence;
	}
	public int getIsSequenceLength() {
		return isSequenceLength;
	}
	public void setIsSequenceLength(int isSequenceLength) {
		this.isSequenceLength = isSequenceLength;
	}
	public String getIdPrefix() {
		return idPrefix;
	}
	public void setIdPrefix(String idPrefix) {
		this.idPrefix = idPrefix;
	}	
	
}
