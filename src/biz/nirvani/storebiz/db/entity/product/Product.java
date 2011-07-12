package biz.nirvani.storebiz.db.entity.product;

import java.util.Date;
import java.util.List;

import org.slim3.datastore.Attribute;
import org.slim3.datastore.CreationDate;
import org.slim3.datastore.Model;
import org.slim3.datastore.ModificationDate;

import biz.nirvani.storebiz.db.IStorebizSerializableEntity;

import com.google.appengine.api.datastore.Key;

@Model
public class Product implements IStorebizSerializableEntity {
	@Attribute (primaryKey=true)
	private Key productKey;
	private String productGS1GlobalTradeItemNumber;
	private String productMerchantCode;
	private Key parentProductKey;
	private String shortName;
	private String fullName;
	private List<Key> compositions;
	private Key productDescription;
	private List<Key> curableDiseases;
	private long productQuantity;
	private String productQuantityUnit;
	private Key manufacturer;
	private String manufacturerId;
	private List<Key> prefferedSuppliers;
	
	private boolean readyForSaleinStore;
	private int productProposedPriceInMinorCurrencyInStore;
	private int productProposedPriceInMajorCurrencyInStore;
	private boolean overriddenInStorePrice;
	private int productOverriddenPriceInMinorCurrencyInStore;
	private int productOverriddenPriceInMajorCurrencyInStore;
	
	private boolean readyForSaleOnline;		
	private int productProposedPriceInMinorCurrencyOnline;
	private int productProposedPriceInMajorCurrencyOnline;
	private boolean overriddenOnlinePrice;
	private int productOverridenPriceInMinorCurrencyOnline;
	private int productOverridenPriceInMajorCurrencyOnline;
	
	private String productSaleCurrencyCode;
	private Key productSaleCurrencyKey;
	private boolean discounted;
	private List<Key> productDiscounts;
	
	private String associatedProductDepartment;
	private Key associatedPoductDepartmentKey;
	private String warehouseLocationCode;
	private Key warehouseLocation;
	
	private boolean purchaseRuleControlled;
	private boolean stockingRuleControlled;
	private boolean saleRuleControlled;
	
	@Attribute(listener=CreationDate.class)
	private Date storeIntroductionDate;
	private Date storeWithdrawalDate;
	
	@Attribute(listener=CreationDate.class)
	private Date creationDate;
	@Attribute(listener=ModificationDate.class)
	private Date lastModificationDate;
	

	public Key getProductKey() {
		return productKey;
	}

	public void setProductKey(Key productKey) {
		this.productKey = productKey;
	}

	public String getProductMerchantCode() {
		return productMerchantCode;
	}

	public void setProductMerchantCode(String productMerchantCode) {
		this.productMerchantCode = productMerchantCode;
	}

	public String getProductGS1GlobalTradeItemNumber() {
		return productGS1GlobalTradeItemNumber;
	}

	public void setProductGS1GlobalTradeItemNumber(
			String productGS1GlobalTradeItemNumber) {
		this.productGS1GlobalTradeItemNumber = productGS1GlobalTradeItemNumber;
	}

	public Key getParentProductKey() {
		return parentProductKey;
	}

	public void setParentProductKey(Key parentProductKey) {
		this.parentProductKey = parentProductKey;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<Key> getCompositions() {
		return compositions;
	}

	public void setCompositions(List<Key> compositions) {
		this.compositions = compositions;
	}

	public Key getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(Key productDescription) {
		this.productDescription = productDescription;
	}

	public List<Key> getCurableDiseases() {
		return curableDiseases;
	}

	public void setCurableDiseases(List<Key> curableDiseases) {
		this.curableDiseases = curableDiseases;
	}

	public long getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(long productQuantity) {
		this.productQuantity = productQuantity;
	}

	public String getProductQuantityUnit() {
		return productQuantityUnit;
	}

	public void setProductQuantityUnit(String productQuantityUnit) {
		this.productQuantityUnit = productQuantityUnit;
	}

	public boolean isReadyForSaleinStore() {
		return readyForSaleinStore;
	}

	public void setReadyForSaleinStore(boolean readyForSaleinStore) {
		this.readyForSaleinStore = readyForSaleinStore;
	}

	public int getProductProposedPriceInMinorCurrencyInStore() {
		return productProposedPriceInMinorCurrencyInStore;
	}

	public void setProductProposedPriceInMinorCurrencyInStore(
			int productProposedPriceInMinorCurrencyInStore) {
		this.productProposedPriceInMinorCurrencyInStore = productProposedPriceInMinorCurrencyInStore;
	}

	public int getProductProposedPriceInMajorCurrencyInStore() {
		return productProposedPriceInMajorCurrencyInStore;
	}

	public void setProductProposedPriceInMajorCurrencyInStore(
			int productProposedPriceInMajorCurrencyInStore) {
		this.productProposedPriceInMajorCurrencyInStore = productProposedPriceInMajorCurrencyInStore;
	}

	public boolean isOverriddenInStorePrice() {
		return overriddenInStorePrice;
	}

	public void setOverriddenInStorePrice(boolean overriddenInStorePrice) {
		this.overriddenInStorePrice = overriddenInStorePrice;
	}

	public int getProductOverriddenPriceInMinorCurrencyInStore() {
		return productOverriddenPriceInMinorCurrencyInStore;
	}

	public void setProductOverriddenPriceInMinorCurrencyInStore(
			int productOverriddenPriceInMinorCurrencyInStore) {
		this.productOverriddenPriceInMinorCurrencyInStore = productOverriddenPriceInMinorCurrencyInStore;
	}

	public int getProductOverriddenPriceInMajorCurrencyInStore() {
		return productOverriddenPriceInMajorCurrencyInStore;
	}

	public void setProductOverriddenPriceInMajorCurrencyInStore(
			int productOverriddenPriceInMajorCurrencyInStore) {
		this.productOverriddenPriceInMajorCurrencyInStore = productOverriddenPriceInMajorCurrencyInStore;
	}

	public boolean isReadyForSaleOnline() {
		return readyForSaleOnline;
	}

	public void setReadyForSaleOnline(boolean readyForSaleOnline) {
		this.readyForSaleOnline = readyForSaleOnline;
	}

	public int getProductProposedPriceInMinorCurrencyOnline() {
		return productProposedPriceInMinorCurrencyOnline;
	}

	public void setProductProposedPriceInMinorCurrencyOnline(
			int productProposedPriceInMinorCurrencyOnline) {
		this.productProposedPriceInMinorCurrencyOnline = productProposedPriceInMinorCurrencyOnline;
	}

	public int getProductProposedPriceInMajorCurrencyOnline() {
		return productProposedPriceInMajorCurrencyOnline;
	}

	public void setProductProposedPriceInMajorCurrencyOnline(
			int productProposedPriceInMajorCurrencyOnline) {
		this.productProposedPriceInMajorCurrencyOnline = productProposedPriceInMajorCurrencyOnline;
	}

	public boolean isOverriddenOnlinePrice() {
		return overriddenOnlinePrice;
	}

	public void setOverriddenOnlinePrice(boolean overriddenOnlinePrice) {
		this.overriddenOnlinePrice = overriddenOnlinePrice;
	}

	public int getProductOverridenPriceInMinorCurrencyOnline() {
		return productOverridenPriceInMinorCurrencyOnline;
	}

	public void setProductOverridenPriceInMinorCurrencyOnline(
			int productOverridenPriceInMinorCurrencyOnline) {
		this.productOverridenPriceInMinorCurrencyOnline = productOverridenPriceInMinorCurrencyOnline;
	}

	public int getProductOverridenPriceInMajorCurrencyOnline() {
		return productOverridenPriceInMajorCurrencyOnline;
	}

	public void setProductOverridenPriceInMajorCurrencyOnline(
			int productOverridenPriceInMajorCurrencyOnline) {
		this.productOverridenPriceInMajorCurrencyOnline = productOverridenPriceInMajorCurrencyOnline;
	}

	public String getProductSaleCurrencyCode() {
		return productSaleCurrencyCode;
	}

	public void setProductSaleCurrencyCode(String productSaleCurrencyCode) {
		this.productSaleCurrencyCode = productSaleCurrencyCode;
	}

	public Key getProductSaleCurrencyKey() {
		return productSaleCurrencyKey;
	}

	public void setProductSaleCurrencyKey(Key productSaleCurrencyKey) {
		this.productSaleCurrencyKey = productSaleCurrencyKey;
	}

	public boolean isDiscounted() {
		return discounted;
	}

	public void setDiscounted(boolean discounted) {
		this.discounted = discounted;
	}

	public List<Key> getProductDiscounts() {
		return productDiscounts;
	}

	public void setProductDiscounts(List<Key> productDiscounts) {
		this.productDiscounts = productDiscounts;
	}

	public String getAssociatedProductDepartment() {
		return associatedProductDepartment;
	}

	public void setAssociatedProductDepartment(String associatedProductDepartment) {
		this.associatedProductDepartment = associatedProductDepartment;
	}

	public Key getAssociatedPoductDepartmentKey() {
		return associatedPoductDepartmentKey;
	}

	public void setAssociatedPoductDepartmentKey(
			Key associatedPoductDepartmentKey) {
		this.associatedPoductDepartmentKey = associatedPoductDepartmentKey;
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

	public boolean isPurchaseRuleControlled() {
		return purchaseRuleControlled;
	}

	public void setPurchaseRuleControlled(boolean purchaseRuleControlled) {
		this.purchaseRuleControlled = purchaseRuleControlled;
	}

	public boolean isStockingRuleControlled() {
		return stockingRuleControlled;
	}

	public void setStockingRuleControlled(boolean stockingRuleControlled) {
		this.stockingRuleControlled = stockingRuleControlled;
	}

	public boolean isSaleRuleControlled() {
		return saleRuleControlled;
	}

	public void setSaleRuleControlled(boolean saleRuleControlled) {
		this.saleRuleControlled = saleRuleControlled;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Key getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Key manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public List<Key> getPrefferedSuppliers() {
		return prefferedSuppliers;
	}

	public void setPrefferedSuppliers(List<Key> prefferedSuppliers) {
		this.prefferedSuppliers = prefferedSuppliers;
	}

	public Date getStoreIntroductionDate() {
		return storeIntroductionDate;
	}

	public void setStoreIntroductionDate(Date storeIntroductionDate) {
		this.storeIntroductionDate = storeIntroductionDate;
	}

	public Date getStoreWithdrawalDate() {
		return storeWithdrawalDate;
	}

	public void setStoreWithdrawalDate(Date storeWithdrawalDate) {
		this.storeWithdrawalDate = storeWithdrawalDate;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	
}
