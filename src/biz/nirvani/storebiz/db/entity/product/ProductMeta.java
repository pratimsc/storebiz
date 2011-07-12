package biz.nirvani.storebiz.db.entity.product;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-12 23:04:51")
/** */
public final class ProductMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.product.Product> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key> associatedPoductDepartmentKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key>(this, "associatedPoductDepartmentKey", "associatedPoductDepartmentKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> associatedProductDepartment = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "associatedProductDepartment", "associatedProductDepartment");

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> compositions = new org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "compositions", "compositions", java.util.List.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> curableDiseases = new org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "curableDiseases", "curableDiseases", java.util.List.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> discounted = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "discounted", "discounted", boolean.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> fullName = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "fullName", "fullName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date> lastModificationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date>(this, "lastModificationDate", "lastModificationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key> manufacturer = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key>(this, "manufacturer", "manufacturer", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> manufacturerId = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "manufacturerId", "manufacturerId");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> overriddenInStorePrice = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "overriddenInStorePrice", "overriddenInStorePrice", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> overriddenOnlinePrice = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "overriddenOnlinePrice", "overriddenOnlinePrice", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key> parentProductKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key>(this, "parentProductKey", "parentProductKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> prefferedSuppliers = new org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "prefferedSuppliers", "prefferedSuppliers", java.util.List.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key> productDescription = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key>(this, "productDescription", "productDescription", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> productDiscounts = new org.slim3.datastore.CollectionAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "productDiscounts", "productDiscounts", java.util.List.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> productGS1GlobalTradeItemNumber = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "productGS1GlobalTradeItemNumber", "productGS1GlobalTradeItemNumber");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key> productKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key>(this, "__key__", "productKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> productMerchantCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "productMerchantCode", "productMerchantCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productOverriddenPriceInMajorCurrencyInStore = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productOverriddenPriceInMajorCurrencyInStore", "productOverriddenPriceInMajorCurrencyInStore", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productOverriddenPriceInMinorCurrencyInStore = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productOverriddenPriceInMinorCurrencyInStore", "productOverriddenPriceInMinorCurrencyInStore", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productOverridenPriceInMajorCurrencyOnline = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productOverridenPriceInMajorCurrencyOnline", "productOverridenPriceInMajorCurrencyOnline", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productOverridenPriceInMinorCurrencyOnline = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productOverridenPriceInMinorCurrencyOnline", "productOverridenPriceInMinorCurrencyOnline", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productProposedPriceInMajorCurrencyInStore = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productProposedPriceInMajorCurrencyInStore", "productProposedPriceInMajorCurrencyInStore", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productProposedPriceInMajorCurrencyOnline = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productProposedPriceInMajorCurrencyOnline", "productProposedPriceInMajorCurrencyOnline", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productProposedPriceInMinorCurrencyInStore = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productProposedPriceInMinorCurrencyInStore", "productProposedPriceInMinorCurrencyInStore", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer> productProposedPriceInMinorCurrencyOnline = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Integer>(this, "productProposedPriceInMinorCurrencyOnline", "productProposedPriceInMinorCurrencyOnline", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Long> productQuantity = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Long>(this, "productQuantity", "productQuantity", long.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> productQuantityUnit = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "productQuantityUnit", "productQuantityUnit");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> productSaleCurrencyCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "productSaleCurrencyCode", "productSaleCurrencyCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key> productSaleCurrencyKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key>(this, "productSaleCurrencyKey", "productSaleCurrencyKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> purchaseRuleControlled = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "purchaseRuleControlled", "purchaseRuleControlled", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> readyForSaleOnline = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "readyForSaleOnline", "readyForSaleOnline", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> readyForSaleinStore = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "readyForSaleinStore", "readyForSaleinStore", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> saleRuleControlled = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "saleRuleControlled", "saleRuleControlled", boolean.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> shortName = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "shortName", "shortName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean> stockingRuleControlled = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.lang.Boolean>(this, "stockingRuleControlled", "stockingRuleControlled", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date> storeIntroductionDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date>(this, "storeIntroductionDate", "storeIntroductionDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date> storeWithdrawalDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, java.util.Date>(this, "storeWithdrawalDate", "storeWithdrawalDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key> warehouseLocation = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product, com.google.appengine.api.datastore.Key>(this, "warehouseLocation", "warehouseLocation", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product> warehouseLocationCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.Product>(this, "warehouseLocationCode", "warehouseLocationCode");

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.ModificationDate slim3_lastModificationDateAttributeListener = new org.slim3.datastore.ModificationDate();

    private static final org.slim3.datastore.CreationDate slim3_storeIntroductionDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final ProductMeta slim3_singleton = new ProductMeta();

    /**
     * @return the singleton
     */
    public static ProductMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProductMeta() {
        super("Product", biz.nirvani.storebiz.db.entity.product.Product.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.product.Product entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.product.Product model = new biz.nirvani.storebiz.db.entity.product.Product();
        model.setAssociatedPoductDepartmentKey((com.google.appengine.api.datastore.Key) entity.getProperty("associatedPoductDepartmentKey"));
        model.setAssociatedProductDepartment((java.lang.String) entity.getProperty("associatedProductDepartment"));
        model.setCompositions(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("compositions")));
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setCurableDiseases(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("curableDiseases")));
        model.setDiscounted(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("discounted")));
        model.setFullName((java.lang.String) entity.getProperty("fullName"));
        model.setLastModificationDate((java.util.Date) entity.getProperty("lastModificationDate"));
        model.setManufacturer((com.google.appengine.api.datastore.Key) entity.getProperty("manufacturer"));
        model.setManufacturerId((java.lang.String) entity.getProperty("manufacturerId"));
        model.setOverriddenInStorePrice(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("overriddenInStorePrice")));
        model.setOverriddenOnlinePrice(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("overriddenOnlinePrice")));
        model.setParentProductKey((com.google.appengine.api.datastore.Key) entity.getProperty("parentProductKey"));
        model.setPrefferedSuppliers(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("prefferedSuppliers")));
        model.setProductDescription((com.google.appengine.api.datastore.Key) entity.getProperty("productDescription"));
        model.setProductDiscounts(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("productDiscounts")));
        model.setProductGS1GlobalTradeItemNumber((java.lang.String) entity.getProperty("productGS1GlobalTradeItemNumber"));
        model.setProductKey(entity.getKey());
        model.setProductMerchantCode((java.lang.String) entity.getProperty("productMerchantCode"));
        model.setProductOverriddenPriceInMajorCurrencyInStore(longToPrimitiveInt((java.lang.Long) entity.getProperty("productOverriddenPriceInMajorCurrencyInStore")));
        model.setProductOverriddenPriceInMinorCurrencyInStore(longToPrimitiveInt((java.lang.Long) entity.getProperty("productOverriddenPriceInMinorCurrencyInStore")));
        model.setProductOverridenPriceInMajorCurrencyOnline(longToPrimitiveInt((java.lang.Long) entity.getProperty("productOverridenPriceInMajorCurrencyOnline")));
        model.setProductOverridenPriceInMinorCurrencyOnline(longToPrimitiveInt((java.lang.Long) entity.getProperty("productOverridenPriceInMinorCurrencyOnline")));
        model.setProductProposedPriceInMajorCurrencyInStore(longToPrimitiveInt((java.lang.Long) entity.getProperty("productProposedPriceInMajorCurrencyInStore")));
        model.setProductProposedPriceInMajorCurrencyOnline(longToPrimitiveInt((java.lang.Long) entity.getProperty("productProposedPriceInMajorCurrencyOnline")));
        model.setProductProposedPriceInMinorCurrencyInStore(longToPrimitiveInt((java.lang.Long) entity.getProperty("productProposedPriceInMinorCurrencyInStore")));
        model.setProductProposedPriceInMinorCurrencyOnline(longToPrimitiveInt((java.lang.Long) entity.getProperty("productProposedPriceInMinorCurrencyOnline")));
        model.setProductQuantity(longToPrimitiveLong((java.lang.Long) entity.getProperty("productQuantity")));
        model.setProductQuantityUnit((java.lang.String) entity.getProperty("productQuantityUnit"));
        model.setProductSaleCurrencyCode((java.lang.String) entity.getProperty("productSaleCurrencyCode"));
        model.setProductSaleCurrencyKey((com.google.appengine.api.datastore.Key) entity.getProperty("productSaleCurrencyKey"));
        model.setPurchaseRuleControlled(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("purchaseRuleControlled")));
        model.setReadyForSaleOnline(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("readyForSaleOnline")));
        model.setReadyForSaleinStore(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("readyForSaleinStore")));
        model.setSaleRuleControlled(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("saleRuleControlled")));
        model.setShortName((java.lang.String) entity.getProperty("shortName"));
        model.setStockingRuleControlled(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("stockingRuleControlled")));
        model.setStoreIntroductionDate((java.util.Date) entity.getProperty("storeIntroductionDate"));
        model.setStoreWithdrawalDate((java.util.Date) entity.getProperty("storeWithdrawalDate"));
        model.setWarehouseLocation((com.google.appengine.api.datastore.Key) entity.getProperty("warehouseLocation"));
        model.setWarehouseLocationCode((java.lang.String) entity.getProperty("warehouseLocationCode"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.product.Product m = (biz.nirvani.storebiz.db.entity.product.Product) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getProductKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getProductKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("associatedPoductDepartmentKey", m.getAssociatedPoductDepartmentKey());
        entity.setProperty("associatedProductDepartment", m.getAssociatedProductDepartment());
        entity.setProperty("compositions", m.getCompositions());
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("curableDiseases", m.getCurableDiseases());
        entity.setProperty("discounted", m.isDiscounted());
        entity.setProperty("fullName", m.getFullName());
        entity.setProperty("lastModificationDate", m.getLastModificationDate());
        entity.setProperty("manufacturer", m.getManufacturer());
        entity.setProperty("manufacturerId", m.getManufacturerId());
        entity.setProperty("overriddenInStorePrice", m.isOverriddenInStorePrice());
        entity.setProperty("overriddenOnlinePrice", m.isOverriddenOnlinePrice());
        entity.setProperty("parentProductKey", m.getParentProductKey());
        entity.setProperty("prefferedSuppliers", m.getPrefferedSuppliers());
        entity.setProperty("productDescription", m.getProductDescription());
        entity.setProperty("productDiscounts", m.getProductDiscounts());
        entity.setProperty("productGS1GlobalTradeItemNumber", m.getProductGS1GlobalTradeItemNumber());
        entity.setProperty("productMerchantCode", m.getProductMerchantCode());
        entity.setProperty("productOverriddenPriceInMajorCurrencyInStore", m.getProductOverriddenPriceInMajorCurrencyInStore());
        entity.setProperty("productOverriddenPriceInMinorCurrencyInStore", m.getProductOverriddenPriceInMinorCurrencyInStore());
        entity.setProperty("productOverridenPriceInMajorCurrencyOnline", m.getProductOverridenPriceInMajorCurrencyOnline());
        entity.setProperty("productOverridenPriceInMinorCurrencyOnline", m.getProductOverridenPriceInMinorCurrencyOnline());
        entity.setProperty("productProposedPriceInMajorCurrencyInStore", m.getProductProposedPriceInMajorCurrencyInStore());
        entity.setProperty("productProposedPriceInMajorCurrencyOnline", m.getProductProposedPriceInMajorCurrencyOnline());
        entity.setProperty("productProposedPriceInMinorCurrencyInStore", m.getProductProposedPriceInMinorCurrencyInStore());
        entity.setProperty("productProposedPriceInMinorCurrencyOnline", m.getProductProposedPriceInMinorCurrencyOnline());
        entity.setProperty("productQuantity", m.getProductQuantity());
        entity.setProperty("productQuantityUnit", m.getProductQuantityUnit());
        entity.setProperty("productSaleCurrencyCode", m.getProductSaleCurrencyCode());
        entity.setProperty("productSaleCurrencyKey", m.getProductSaleCurrencyKey());
        entity.setProperty("purchaseRuleControlled", m.isPurchaseRuleControlled());
        entity.setProperty("readyForSaleOnline", m.isReadyForSaleOnline());
        entity.setProperty("readyForSaleinStore", m.isReadyForSaleinStore());
        entity.setProperty("saleRuleControlled", m.isSaleRuleControlled());
        entity.setProperty("shortName", m.getShortName());
        entity.setProperty("stockingRuleControlled", m.isStockingRuleControlled());
        entity.setProperty("storeIntroductionDate", m.getStoreIntroductionDate());
        entity.setProperty("storeWithdrawalDate", m.getStoreWithdrawalDate());
        entity.setProperty("warehouseLocation", m.getWarehouseLocation());
        entity.setProperty("warehouseLocationCode", m.getWarehouseLocationCode());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.product.Product m = (biz.nirvani.storebiz.db.entity.product.Product) model;
        return m.getProductKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.product.Product m = (biz.nirvani.storebiz.db.entity.product.Product) model;
        m.setProductKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.product.Product) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.nirvani.storebiz.db.entity.product.Product m = (biz.nirvani.storebiz.db.entity.product.Product) model;
        m.setCreationDate(slim3_creationDateAttributeListener.prePut(m.getCreationDate()));
        m.setLastModificationDate(slim3_lastModificationDateAttributeListener.prePut(m.getLastModificationDate()));
        m.setStoreIntroductionDate(slim3_storeIntroductionDateAttributeListener.prePut(m.getStoreIntroductionDate()));
    }

    @Override
    public String getSchemaVersionName() {
        return "slim3.schemaVersion";
    }

    @Override
    public String getClassHierarchyListName() {
        return "slim3.classHierarchyList";
    }

    @Override
    protected boolean isCipherProperty(String propertyName) {
        return false;
    }

    @Override
    protected void modelToJson(org.slim3.datastore.json.JsonWriter writer, java.lang.Object model, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.product.Product m = (biz.nirvani.storebiz.db.entity.product.Product) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAssociatedPoductDepartmentKey() != null){
            writer.setNextPropertyName("associatedPoductDepartmentKey");
            encoder0.encode(writer, m.getAssociatedPoductDepartmentKey());
        }
        if(m.getAssociatedProductDepartment() != null){
            writer.setNextPropertyName("associatedProductDepartment");
            encoder0.encode(writer, m.getAssociatedProductDepartment());
        }
        if(m.getCompositions() != null){
            writer.setNextPropertyName("compositions");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getCompositions()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getCurableDiseases() != null){
            writer.setNextPropertyName("curableDiseases");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getCurableDiseases()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        writer.setNextPropertyName("discounted");
        encoder0.encode(writer, m.isDiscounted());
        if(m.getFullName() != null){
            writer.setNextPropertyName("fullName");
            encoder0.encode(writer, m.getFullName());
        }
        if(m.getLastModificationDate() != null){
            writer.setNextPropertyName("lastModificationDate");
            encoder0.encode(writer, m.getLastModificationDate());
        }
        if(m.getManufacturer() != null){
            writer.setNextPropertyName("manufacturer");
            encoder0.encode(writer, m.getManufacturer());
        }
        if(m.getManufacturerId() != null){
            writer.setNextPropertyName("manufacturerId");
            encoder0.encode(writer, m.getManufacturerId());
        }
        writer.setNextPropertyName("overriddenInStorePrice");
        encoder0.encode(writer, m.isOverriddenInStorePrice());
        writer.setNextPropertyName("overriddenOnlinePrice");
        encoder0.encode(writer, m.isOverriddenOnlinePrice());
        if(m.getParentProductKey() != null){
            writer.setNextPropertyName("parentProductKey");
            encoder0.encode(writer, m.getParentProductKey());
        }
        if(m.getPrefferedSuppliers() != null){
            writer.setNextPropertyName("prefferedSuppliers");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getPrefferedSuppliers()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getProductDescription() != null){
            writer.setNextPropertyName("productDescription");
            encoder0.encode(writer, m.getProductDescription());
        }
        if(m.getProductDiscounts() != null){
            writer.setNextPropertyName("productDiscounts");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getProductDiscounts()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getProductGS1GlobalTradeItemNumber() != null){
            writer.setNextPropertyName("productGS1GlobalTradeItemNumber");
            encoder0.encode(writer, m.getProductGS1GlobalTradeItemNumber());
        }
        if(m.getProductKey() != null){
            writer.setNextPropertyName("productKey");
            encoder0.encode(writer, m.getProductKey());
        }
        if(m.getProductMerchantCode() != null){
            writer.setNextPropertyName("productMerchantCode");
            encoder0.encode(writer, m.getProductMerchantCode());
        }
        writer.setNextPropertyName("productOverriddenPriceInMajorCurrencyInStore");
        encoder0.encode(writer, m.getProductOverriddenPriceInMajorCurrencyInStore());
        writer.setNextPropertyName("productOverriddenPriceInMinorCurrencyInStore");
        encoder0.encode(writer, m.getProductOverriddenPriceInMinorCurrencyInStore());
        writer.setNextPropertyName("productOverridenPriceInMajorCurrencyOnline");
        encoder0.encode(writer, m.getProductOverridenPriceInMajorCurrencyOnline());
        writer.setNextPropertyName("productOverridenPriceInMinorCurrencyOnline");
        encoder0.encode(writer, m.getProductOverridenPriceInMinorCurrencyOnline());
        writer.setNextPropertyName("productProposedPriceInMajorCurrencyInStore");
        encoder0.encode(writer, m.getProductProposedPriceInMajorCurrencyInStore());
        writer.setNextPropertyName("productProposedPriceInMajorCurrencyOnline");
        encoder0.encode(writer, m.getProductProposedPriceInMajorCurrencyOnline());
        writer.setNextPropertyName("productProposedPriceInMinorCurrencyInStore");
        encoder0.encode(writer, m.getProductProposedPriceInMinorCurrencyInStore());
        writer.setNextPropertyName("productProposedPriceInMinorCurrencyOnline");
        encoder0.encode(writer, m.getProductProposedPriceInMinorCurrencyOnline());
        writer.setNextPropertyName("productQuantity");
        encoder0.encode(writer, m.getProductQuantity());
        if(m.getProductQuantityUnit() != null){
            writer.setNextPropertyName("productQuantityUnit");
            encoder0.encode(writer, m.getProductQuantityUnit());
        }
        if(m.getProductSaleCurrencyCode() != null){
            writer.setNextPropertyName("productSaleCurrencyCode");
            encoder0.encode(writer, m.getProductSaleCurrencyCode());
        }
        if(m.getProductSaleCurrencyKey() != null){
            writer.setNextPropertyName("productSaleCurrencyKey");
            encoder0.encode(writer, m.getProductSaleCurrencyKey());
        }
        writer.setNextPropertyName("purchaseRuleControlled");
        encoder0.encode(writer, m.isPurchaseRuleControlled());
        writer.setNextPropertyName("readyForSaleOnline");
        encoder0.encode(writer, m.isReadyForSaleOnline());
        writer.setNextPropertyName("readyForSaleinStore");
        encoder0.encode(writer, m.isReadyForSaleinStore());
        writer.setNextPropertyName("saleRuleControlled");
        encoder0.encode(writer, m.isSaleRuleControlled());
        if(m.getShortName() != null){
            writer.setNextPropertyName("shortName");
            encoder0.encode(writer, m.getShortName());
        }
        writer.setNextPropertyName("stockingRuleControlled");
        encoder0.encode(writer, m.isStockingRuleControlled());
        if(m.getStoreIntroductionDate() != null){
            writer.setNextPropertyName("storeIntroductionDate");
            encoder0.encode(writer, m.getStoreIntroductionDate());
        }
        if(m.getStoreWithdrawalDate() != null){
            writer.setNextPropertyName("storeWithdrawalDate");
            encoder0.encode(writer, m.getStoreWithdrawalDate());
        }
        if(m.getWarehouseLocation() != null){
            writer.setNextPropertyName("warehouseLocation");
            encoder0.encode(writer, m.getWarehouseLocation());
        }
        if(m.getWarehouseLocationCode() != null){
            writer.setNextPropertyName("warehouseLocationCode");
            encoder0.encode(writer, m.getWarehouseLocationCode());
        }
        writer.endObject();
    }

    @Override
    protected biz.nirvani.storebiz.db.entity.product.Product jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.product.Product m = new biz.nirvani.storebiz.db.entity.product.Product();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("associatedPoductDepartmentKey");
        m.setAssociatedPoductDepartmentKey(decoder0.decode(reader, m.getAssociatedPoductDepartmentKey()));
        reader = rootReader.newObjectReader("associatedProductDepartment");
        m.setAssociatedProductDepartment(decoder0.decode(reader, m.getAssociatedProductDepartment()));
        reader = rootReader.newObjectReader("compositions");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("compositions");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setCompositions(elements);
            }
        }
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("curableDiseases");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("curableDiseases");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setCurableDiseases(elements);
            }
        }
        reader = rootReader.newObjectReader("discounted");
        m.setDiscounted(decoder0.decode(reader, m.isDiscounted()));
        reader = rootReader.newObjectReader("fullName");
        m.setFullName(decoder0.decode(reader, m.getFullName()));
        reader = rootReader.newObjectReader("lastModificationDate");
        m.setLastModificationDate(decoder0.decode(reader, m.getLastModificationDate()));
        reader = rootReader.newObjectReader("manufacturer");
        m.setManufacturer(decoder0.decode(reader, m.getManufacturer()));
        reader = rootReader.newObjectReader("manufacturerId");
        m.setManufacturerId(decoder0.decode(reader, m.getManufacturerId()));
        reader = rootReader.newObjectReader("overriddenInStorePrice");
        m.setOverriddenInStorePrice(decoder0.decode(reader, m.isOverriddenInStorePrice()));
        reader = rootReader.newObjectReader("overriddenOnlinePrice");
        m.setOverriddenOnlinePrice(decoder0.decode(reader, m.isOverriddenOnlinePrice()));
        reader = rootReader.newObjectReader("parentProductKey");
        m.setParentProductKey(decoder0.decode(reader, m.getParentProductKey()));
        reader = rootReader.newObjectReader("prefferedSuppliers");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("prefferedSuppliers");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setPrefferedSuppliers(elements);
            }
        }
        reader = rootReader.newObjectReader("productDescription");
        m.setProductDescription(decoder0.decode(reader, m.getProductDescription()));
        reader = rootReader.newObjectReader("productDiscounts");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("productDiscounts");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setProductDiscounts(elements);
            }
        }
        reader = rootReader.newObjectReader("productGS1GlobalTradeItemNumber");
        m.setProductGS1GlobalTradeItemNumber(decoder0.decode(reader, m.getProductGS1GlobalTradeItemNumber()));
        reader = rootReader.newObjectReader("productKey");
        m.setProductKey(decoder0.decode(reader, m.getProductKey()));
        reader = rootReader.newObjectReader("productMerchantCode");
        m.setProductMerchantCode(decoder0.decode(reader, m.getProductMerchantCode()));
        reader = rootReader.newObjectReader("productOverriddenPriceInMajorCurrencyInStore");
        m.setProductOverriddenPriceInMajorCurrencyInStore(decoder0.decode(reader, m.getProductOverriddenPriceInMajorCurrencyInStore()));
        reader = rootReader.newObjectReader("productOverriddenPriceInMinorCurrencyInStore");
        m.setProductOverriddenPriceInMinorCurrencyInStore(decoder0.decode(reader, m.getProductOverriddenPriceInMinorCurrencyInStore()));
        reader = rootReader.newObjectReader("productOverridenPriceInMajorCurrencyOnline");
        m.setProductOverridenPriceInMajorCurrencyOnline(decoder0.decode(reader, m.getProductOverridenPriceInMajorCurrencyOnline()));
        reader = rootReader.newObjectReader("productOverridenPriceInMinorCurrencyOnline");
        m.setProductOverridenPriceInMinorCurrencyOnline(decoder0.decode(reader, m.getProductOverridenPriceInMinorCurrencyOnline()));
        reader = rootReader.newObjectReader("productProposedPriceInMajorCurrencyInStore");
        m.setProductProposedPriceInMajorCurrencyInStore(decoder0.decode(reader, m.getProductProposedPriceInMajorCurrencyInStore()));
        reader = rootReader.newObjectReader("productProposedPriceInMajorCurrencyOnline");
        m.setProductProposedPriceInMajorCurrencyOnline(decoder0.decode(reader, m.getProductProposedPriceInMajorCurrencyOnline()));
        reader = rootReader.newObjectReader("productProposedPriceInMinorCurrencyInStore");
        m.setProductProposedPriceInMinorCurrencyInStore(decoder0.decode(reader, m.getProductProposedPriceInMinorCurrencyInStore()));
        reader = rootReader.newObjectReader("productProposedPriceInMinorCurrencyOnline");
        m.setProductProposedPriceInMinorCurrencyOnline(decoder0.decode(reader, m.getProductProposedPriceInMinorCurrencyOnline()));
        reader = rootReader.newObjectReader("productQuantity");
        m.setProductQuantity(decoder0.decode(reader, m.getProductQuantity()));
        reader = rootReader.newObjectReader("productQuantityUnit");
        m.setProductQuantityUnit(decoder0.decode(reader, m.getProductQuantityUnit()));
        reader = rootReader.newObjectReader("productSaleCurrencyCode");
        m.setProductSaleCurrencyCode(decoder0.decode(reader, m.getProductSaleCurrencyCode()));
        reader = rootReader.newObjectReader("productSaleCurrencyKey");
        m.setProductSaleCurrencyKey(decoder0.decode(reader, m.getProductSaleCurrencyKey()));
        reader = rootReader.newObjectReader("purchaseRuleControlled");
        m.setPurchaseRuleControlled(decoder0.decode(reader, m.isPurchaseRuleControlled()));
        reader = rootReader.newObjectReader("readyForSaleOnline");
        m.setReadyForSaleOnline(decoder0.decode(reader, m.isReadyForSaleOnline()));
        reader = rootReader.newObjectReader("readyForSaleinStore");
        m.setReadyForSaleinStore(decoder0.decode(reader, m.isReadyForSaleinStore()));
        reader = rootReader.newObjectReader("saleRuleControlled");
        m.setSaleRuleControlled(decoder0.decode(reader, m.isSaleRuleControlled()));
        reader = rootReader.newObjectReader("shortName");
        m.setShortName(decoder0.decode(reader, m.getShortName()));
        reader = rootReader.newObjectReader("stockingRuleControlled");
        m.setStockingRuleControlled(decoder0.decode(reader, m.isStockingRuleControlled()));
        reader = rootReader.newObjectReader("storeIntroductionDate");
        m.setStoreIntroductionDate(decoder0.decode(reader, m.getStoreIntroductionDate()));
        reader = rootReader.newObjectReader("storeWithdrawalDate");
        m.setStoreWithdrawalDate(decoder0.decode(reader, m.getStoreWithdrawalDate()));
        reader = rootReader.newObjectReader("warehouseLocation");
        m.setWarehouseLocation(decoder0.decode(reader, m.getWarehouseLocation()));
        reader = rootReader.newObjectReader("warehouseLocationCode");
        m.setWarehouseLocationCode(decoder0.decode(reader, m.getWarehouseLocationCode()));
        return m;
    }
}