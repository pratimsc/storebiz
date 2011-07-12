package biz.nirvani.storebiz.db.entity.discount.product;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

import com.google.appengine.api.datastore.Key;

@Model
public class ProductDiscount implements IStorebizSerializableEntity {
	@Attribute(primaryKey=true)
	private Key productDiscountKey;
	private List<Key> associatedPoductKeys;
	private String discountCode;
	private int discountValue;
	private String discountUnit;
	private boolean associatedWithProduct;
	private boolean associatedWithOrder;
	private boolean associatedWithCustomer;
	private boolean applicableForInStoreSale;
	private boolean applicanleForOnlineSale;
	private Date discoutStartDate;
	private Date discountEndDate;
	
	@Attribute(listener=CreationDate.class)
	private Date creationDate;

	public Key getProductDiscountKey() {
		return productDiscountKey;
	}

	public void setProductDiscountKey(Key productDiscountKey) {
		this.productDiscountKey = productDiscountKey;
	}

	public List<Key> getAssociatedPoductKeys() {
		return associatedPoductKeys;
	}

	public void setAssociatedPoductKeys(List<Key> associatedPoductKeys) {
		this.associatedPoductKeys = associatedPoductKeys;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}

	public String getDiscountUnit() {
		return discountUnit;
	}

	public void setDiscountUnit(String discountUnit) {
		this.discountUnit = discountUnit;
	}

	public boolean isAssociatedWithProduct() {
		return associatedWithProduct;
	}

	public void setAssociatedWithProduct(boolean associatedWithProduct) {
		this.associatedWithProduct = associatedWithProduct;
	}

	public boolean isAssociatedWithOrder() {
		return associatedWithOrder;
	}

	public void setAssociatedWithOrder(boolean associatedWithOrder) {
		this.associatedWithOrder = associatedWithOrder;
	}

	public boolean isAssociatedWithCustomer() {
		return associatedWithCustomer;
	}

	public void setAssociatedWithCustomer(boolean associatedWithCustomer) {
		this.associatedWithCustomer = associatedWithCustomer;
	}

	public Date getDiscoutStartDate() {
		return discoutStartDate;
	}

	public void setDiscoutStartDate(Date discoutStartDate) {
		this.discoutStartDate = discoutStartDate;
	}

	public Date getDiscountEndDate() {
		return discountEndDate;
	}

	public void setDiscountEndDate(Date discountEndDate) {
		this.discountEndDate = discountEndDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public boolean isApplicableForInStoreSale() {
		return applicableForInStoreSale;
	}

	public void setApplicableForInStoreSale(boolean applicableForInStoreSale) {
		this.applicableForInStoreSale = applicableForInStoreSale;
	}

	public boolean isApplicanleForOnlineSale() {
		return applicanleForOnlineSale;
	}

	public void setApplicanleForOnlineSale(boolean applicanleForOnlineSale) {
		this.applicanleForOnlineSale = applicanleForOnlineSale;
	}
	
	
	
}
