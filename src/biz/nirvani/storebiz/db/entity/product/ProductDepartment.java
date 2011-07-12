package biz.nirvani.storebiz.db.entity.product;

import java.util.Date;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;

import com.google.appengine.api.datastore.Key;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;
import biz.nirvani.storebiz.db.entity.common.WarehouseLocation;

@Model
public class ProductDepartment implements IStorebizSerializableEntity {
	@Attribute(primaryKey=true)
	private Key productDepartmentKey;
	private String productDepartmentCode;
	private String productDepartmentName;
	private boolean operational;
	private String warehouseLocationCode;
	private Key warehouseLocation;
	@Attribute(listener=CreationDate.class)
	private Date departmentFormationDate;
	private Date departmentClosingDate;
	private Date departmentLastUpateDate;
	
	@Attribute(listener=CreationDate.class)
	private Date creationDate;

	public Key getProductDepartmentKey() {
		return productDepartmentKey;
	}

	public void setProductDepartmentKey(Key productDepartmentKey) {
		this.productDepartmentKey = productDepartmentKey;
	}

	public String getProductDepartmentCode() {
		return productDepartmentCode;
	}

	public void setProductDepartmentCode(String productDepartmentCode) {
		this.productDepartmentCode = productDepartmentCode;
	}

	public String getProductDepartmentName() {
		return productDepartmentName;
	}

	public void setProductDepartmentName(String productDepartmentName) {
		this.productDepartmentName = productDepartmentName;
	}

	public boolean isOperational() {
		return operational;
	}

	public void setOperational(boolean operational) {
		this.operational = operational;
	}

	public String getWarehouseLocationCode() {
		return warehouseLocationCode;
	}

	public void setWarehouseLocationCode(String warehouseLocationCode) {
		this.warehouseLocationCode = warehouseLocationCode;
	}

	public Key getWarehouseLocation() {
		return warehouseLocation;
	}

	public void setWarehouseLocation(Key warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}

	public Date getDepartmentFormationDate() {
		return departmentFormationDate;
	}

	public void setDepartmentFormationDate(Date departmentFormationDate) {
		this.departmentFormationDate = departmentFormationDate;
	}

	public Date getDepartmentClosingDate() {
		return departmentClosingDate;
	}

	public void setDepartmentClosingDate(Date departmentClosingDate) {
		this.departmentClosingDate = departmentClosingDate;
	}

	public Date getDepartmentLastUpateDate() {
		return departmentLastUpateDate;
	}

	public void setDepartmentLastUpateDate(Date departmentLastUpateDate) {
		this.departmentLastUpateDate = departmentLastUpateDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	
}
