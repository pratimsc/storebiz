package biz.storebiz.db.entity.discount.product;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-27 20:55:09")
/** */
public final class ProductDiscountMeta extends org.slim3.datastore.ModelMeta<biz.storebiz.db.entity.discount.product.ProductDiscount> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean> applicableForInStoreSale = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean>(this, "applicableForInStoreSale", "applicableForInStoreSale", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean> applicanleForOnlineSale = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean>(this, "applicanleForOnlineSale", "applicanleForOnlineSale", boolean.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> associatedPoductKeys = new org.slim3.datastore.CollectionAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "associatedPoductKeys", "associatedPoductKeys", java.util.List.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean> associatedWithCustomer = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean>(this, "associatedWithCustomer", "associatedWithCustomer", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean> associatedWithOrder = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean>(this, "associatedWithOrder", "associatedWithOrder", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean> associatedWithProduct = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Boolean>(this, "associatedWithProduct", "associatedWithProduct", boolean.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount> discountCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount>(this, "discountCode", "discountCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.Date> discountEndDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.Date>(this, "discountEndDate", "discountEndDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount> discountUnit = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount>(this, "discountUnit", "discountUnit");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Integer> discountValue = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.lang.Integer>(this, "discountValue", "discountValue", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.Date> discoutStartDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, java.util.Date>(this, "discoutStartDate", "discoutStartDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, com.google.appengine.api.datastore.Key> productDiscountKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.discount.product.ProductDiscount, com.google.appengine.api.datastore.Key>(this, "__key__", "productDiscountKey", com.google.appengine.api.datastore.Key.class);

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final ProductDiscountMeta slim3_singleton = new ProductDiscountMeta();

    /**
     * @return the singleton
     */
    public static ProductDiscountMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProductDiscountMeta() {
        super("ProductDiscount", biz.storebiz.db.entity.discount.product.ProductDiscount.class);
    }

    @Override
    public biz.storebiz.db.entity.discount.product.ProductDiscount entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.storebiz.db.entity.discount.product.ProductDiscount model = new biz.storebiz.db.entity.discount.product.ProductDiscount();
        model.setApplicableForInStoreSale(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("applicableForInStoreSale")));
        model.setApplicanleForOnlineSale(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("applicanleForOnlineSale")));
        model.setAssociatedPoductKeys(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("associatedPoductKeys")));
        model.setAssociatedWithCustomer(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("associatedWithCustomer")));
        model.setAssociatedWithOrder(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("associatedWithOrder")));
        model.setAssociatedWithProduct(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("associatedWithProduct")));
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setDiscountCode((java.lang.String) entity.getProperty("discountCode"));
        model.setDiscountEndDate((java.util.Date) entity.getProperty("discountEndDate"));
        model.setDiscountUnit((java.lang.String) entity.getProperty("discountUnit"));
        model.setDiscountValue(longToPrimitiveInt((java.lang.Long) entity.getProperty("discountValue")));
        model.setDiscoutStartDate((java.util.Date) entity.getProperty("discoutStartDate"));
        model.setProductDiscountKey(entity.getKey());
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.storebiz.db.entity.discount.product.ProductDiscount m = (biz.storebiz.db.entity.discount.product.ProductDiscount) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getProductDiscountKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getProductDiscountKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("applicableForInStoreSale", m.isApplicableForInStoreSale());
        entity.setProperty("applicanleForOnlineSale", m.isApplicanleForOnlineSale());
        entity.setProperty("associatedPoductKeys", m.getAssociatedPoductKeys());
        entity.setProperty("associatedWithCustomer", m.isAssociatedWithCustomer());
        entity.setProperty("associatedWithOrder", m.isAssociatedWithOrder());
        entity.setProperty("associatedWithProduct", m.isAssociatedWithProduct());
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("discountCode", m.getDiscountCode());
        entity.setProperty("discountEndDate", m.getDiscountEndDate());
        entity.setProperty("discountUnit", m.getDiscountUnit());
        entity.setProperty("discountValue", m.getDiscountValue());
        entity.setProperty("discoutStartDate", m.getDiscoutStartDate());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.storebiz.db.entity.discount.product.ProductDiscount m = (biz.storebiz.db.entity.discount.product.ProductDiscount) model;
        return m.getProductDiscountKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.storebiz.db.entity.discount.product.ProductDiscount m = (biz.storebiz.db.entity.discount.product.ProductDiscount) model;
        m.setProductDiscountKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.storebiz.db.entity.discount.product.ProductDiscount) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.storebiz.db.entity.discount.product.ProductDiscount m = (biz.storebiz.db.entity.discount.product.ProductDiscount) model;
        m.setCreationDate(slim3_creationDateAttributeListener.prePut(m.getCreationDate()));
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
        biz.storebiz.db.entity.discount.product.ProductDiscount m = (biz.storebiz.db.entity.discount.product.ProductDiscount) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        writer.setNextPropertyName("applicableForInStoreSale");
        encoder0.encode(writer, m.isApplicableForInStoreSale());
        writer.setNextPropertyName("applicanleForOnlineSale");
        encoder0.encode(writer, m.isApplicanleForOnlineSale());
        if(m.getAssociatedPoductKeys() != null){
            writer.setNextPropertyName("associatedPoductKeys");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getAssociatedPoductKeys()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        writer.setNextPropertyName("associatedWithCustomer");
        encoder0.encode(writer, m.isAssociatedWithCustomer());
        writer.setNextPropertyName("associatedWithOrder");
        encoder0.encode(writer, m.isAssociatedWithOrder());
        writer.setNextPropertyName("associatedWithProduct");
        encoder0.encode(writer, m.isAssociatedWithProduct());
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getDiscountCode() != null){
            writer.setNextPropertyName("discountCode");
            encoder0.encode(writer, m.getDiscountCode());
        }
        if(m.getDiscountEndDate() != null){
            writer.setNextPropertyName("discountEndDate");
            encoder0.encode(writer, m.getDiscountEndDate());
        }
        if(m.getDiscountUnit() != null){
            writer.setNextPropertyName("discountUnit");
            encoder0.encode(writer, m.getDiscountUnit());
        }
        writer.setNextPropertyName("discountValue");
        encoder0.encode(writer, m.getDiscountValue());
        if(m.getDiscoutStartDate() != null){
            writer.setNextPropertyName("discoutStartDate");
            encoder0.encode(writer, m.getDiscoutStartDate());
        }
        if(m.getProductDiscountKey() != null){
            writer.setNextPropertyName("productDiscountKey");
            encoder0.encode(writer, m.getProductDiscountKey());
        }
        writer.endObject();
    }

    @Override
    protected biz.storebiz.db.entity.discount.product.ProductDiscount jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.storebiz.db.entity.discount.product.ProductDiscount m = new biz.storebiz.db.entity.discount.product.ProductDiscount();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("applicableForInStoreSale");
        m.setApplicableForInStoreSale(decoder0.decode(reader, m.isApplicableForInStoreSale()));
        reader = rootReader.newObjectReader("applicanleForOnlineSale");
        m.setApplicanleForOnlineSale(decoder0.decode(reader, m.isApplicanleForOnlineSale()));
        reader = rootReader.newObjectReader("associatedPoductKeys");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("associatedPoductKeys");
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
                m.setAssociatedPoductKeys(elements);
            }
        }
        reader = rootReader.newObjectReader("associatedWithCustomer");
        m.setAssociatedWithCustomer(decoder0.decode(reader, m.isAssociatedWithCustomer()));
        reader = rootReader.newObjectReader("associatedWithOrder");
        m.setAssociatedWithOrder(decoder0.decode(reader, m.isAssociatedWithOrder()));
        reader = rootReader.newObjectReader("associatedWithProduct");
        m.setAssociatedWithProduct(decoder0.decode(reader, m.isAssociatedWithProduct()));
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("discountCode");
        m.setDiscountCode(decoder0.decode(reader, m.getDiscountCode()));
        reader = rootReader.newObjectReader("discountEndDate");
        m.setDiscountEndDate(decoder0.decode(reader, m.getDiscountEndDate()));
        reader = rootReader.newObjectReader("discountUnit");
        m.setDiscountUnit(decoder0.decode(reader, m.getDiscountUnit()));
        reader = rootReader.newObjectReader("discountValue");
        m.setDiscountValue(decoder0.decode(reader, m.getDiscountValue()));
        reader = rootReader.newObjectReader("discoutStartDate");
        m.setDiscoutStartDate(decoder0.decode(reader, m.getDiscoutStartDate()));
        reader = rootReader.newObjectReader("productDiscountKey");
        m.setProductDiscountKey(decoder0.decode(reader, m.getProductDiscountKey()));
        return m;
    }
}