package biz.storebiz.db.entity.product;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

import biz.storebiz.db.IStorebizSerializableEntity;

@Model
public class CurableDiseases implements IStorebizSerializableEntity {
	@Attribute(primaryKey=true)
	private Key curableDiseaseKey;
	private String curableDiseaseName;
	private Key associatedProductKey;
	
	public CurableDiseases(){
		super();
	}
	
	public CurableDiseases(Key curableDiseaseKey, Key associatedProductKey, String curableDiseaseName){
		this.curableDiseaseKey = curableDiseaseKey;
		this.associatedProductKey = associatedProductKey;
		this.curableDiseaseName = curableDiseaseName;
	}
	
	public Key getCurableDiseaseKey() {
		return curableDiseaseKey;
	}
	public void setCurableDiseaseKey(Key curableDiseaseKey) {
		this.curableDiseaseKey = curableDiseaseKey;
	}
	public String getCurableDiseaseName() {
		return curableDiseaseName;
	}
	public void setCurableDiseaseName(String curableDiseaseName) {
		this.curableDiseaseName = curableDiseaseName;
	}
	public Key getAssociatedProductKey() {
		return associatedProductKey;
	}
	public void setAssociatedProductKey(Key associatedProductKey) {
		this.associatedProductKey = associatedProductKey;
	}
	
	
}
