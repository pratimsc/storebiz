package biz.nirvani.storebiz.db.entity.product;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-12 23:04:50")
/** */
public final class ProductDepartmentMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date> departmentClosingDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date>(this, "departmentClosingDate", "departmentClosingDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date> departmentFormationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date>(this, "departmentFormationDate", "departmentFormationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date> departmentLastUpateDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.util.Date>(this, "departmentLastUpateDate", "departmentLastUpateDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.lang.Boolean> operational = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, java.lang.Boolean>(this, "operational", "operational", boolean.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment> productDepartmentCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment>(this, "productDepartmentCode", "productDepartmentCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, com.google.appengine.api.datastore.Key> productDepartmentKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, com.google.appengine.api.datastore.Key>(this, "__key__", "productDepartmentKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment> productDepartmentName = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment>(this, "productDepartmentName", "productDepartmentName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, com.google.appengine.api.datastore.Key> warehouseLocation = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment, com.google.appengine.api.datastore.Key>(this, "warehouseLocation", "warehouseLocation", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment> warehouseLocationCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductDepartment>(this, "warehouseLocationCode", "warehouseLocationCode");

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.CreationDate slim3_departmentFormationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final ProductDepartmentMeta slim3_singleton = new ProductDepartmentMeta();

    /**
     * @return the singleton
     */
    public static ProductDepartmentMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProductDepartmentMeta() {
        super("ProductDepartment", biz.nirvani.storebiz.db.entity.product.ProductDepartment.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.product.ProductDepartment entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.product.ProductDepartment model = new biz.nirvani.storebiz.db.entity.product.ProductDepartment();
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setDepartmentClosingDate((java.util.Date) entity.getProperty("departmentClosingDate"));
        model.setDepartmentFormationDate((java.util.Date) entity.getProperty("departmentFormationDate"));
        model.setDepartmentLastUpateDate((java.util.Date) entity.getProperty("departmentLastUpateDate"));
        model.setOperational(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("operational")));
        model.setProductDepartmentCode((java.lang.String) entity.getProperty("productDepartmentCode"));
        model.setProductDepartmentKey(entity.getKey());
        model.setProductDepartmentName((java.lang.String) entity.getProperty("productDepartmentName"));
        model.setWarehouseLocation((com.google.appengine.api.datastore.Key) entity.getProperty("warehouseLocation"));
        model.setWarehouseLocationCode((java.lang.String) entity.getProperty("warehouseLocationCode"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.product.ProductDepartment m = (biz.nirvani.storebiz.db.entity.product.ProductDepartment) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getProductDepartmentKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getProductDepartmentKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("departmentClosingDate", m.getDepartmentClosingDate());
        entity.setProperty("departmentFormationDate", m.getDepartmentFormationDate());
        entity.setProperty("departmentLastUpateDate", m.getDepartmentLastUpateDate());
        entity.setProperty("operational", m.isOperational());
        entity.setProperty("productDepartmentCode", m.getProductDepartmentCode());
        entity.setProperty("productDepartmentName", m.getProductDepartmentName());
        entity.setProperty("warehouseLocation", m.getWarehouseLocation());
        entity.setProperty("warehouseLocationCode", m.getWarehouseLocationCode());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.product.ProductDepartment m = (biz.nirvani.storebiz.db.entity.product.ProductDepartment) model;
        return m.getProductDepartmentKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.product.ProductDepartment m = (biz.nirvani.storebiz.db.entity.product.ProductDepartment) model;
        m.setProductDepartmentKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.product.ProductDepartment) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.nirvani.storebiz.db.entity.product.ProductDepartment m = (biz.nirvani.storebiz.db.entity.product.ProductDepartment) model;
        m.setCreationDate(slim3_creationDateAttributeListener.prePut(m.getCreationDate()));
        m.setDepartmentFormationDate(slim3_departmentFormationDateAttributeListener.prePut(m.getDepartmentFormationDate()));
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
        biz.nirvani.storebiz.db.entity.product.ProductDepartment m = (biz.nirvani.storebiz.db.entity.product.ProductDepartment) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getDepartmentClosingDate() != null){
            writer.setNextPropertyName("departmentClosingDate");
            encoder0.encode(writer, m.getDepartmentClosingDate());
        }
        if(m.getDepartmentFormationDate() != null){
            writer.setNextPropertyName("departmentFormationDate");
            encoder0.encode(writer, m.getDepartmentFormationDate());
        }
        if(m.getDepartmentLastUpateDate() != null){
            writer.setNextPropertyName("departmentLastUpateDate");
            encoder0.encode(writer, m.getDepartmentLastUpateDate());
        }
        writer.setNextPropertyName("operational");
        encoder0.encode(writer, m.isOperational());
        if(m.getProductDepartmentCode() != null){
            writer.setNextPropertyName("productDepartmentCode");
            encoder0.encode(writer, m.getProductDepartmentCode());
        }
        if(m.getProductDepartmentKey() != null){
            writer.setNextPropertyName("productDepartmentKey");
            encoder0.encode(writer, m.getProductDepartmentKey());
        }
        if(m.getProductDepartmentName() != null){
            writer.setNextPropertyName("productDepartmentName");
            encoder0.encode(writer, m.getProductDepartmentName());
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
    protected biz.nirvani.storebiz.db.entity.product.ProductDepartment jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.product.ProductDepartment m = new biz.nirvani.storebiz.db.entity.product.ProductDepartment();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("departmentClosingDate");
        m.setDepartmentClosingDate(decoder0.decode(reader, m.getDepartmentClosingDate()));
        reader = rootReader.newObjectReader("departmentFormationDate");
        m.setDepartmentFormationDate(decoder0.decode(reader, m.getDepartmentFormationDate()));
        reader = rootReader.newObjectReader("departmentLastUpateDate");
        m.setDepartmentLastUpateDate(decoder0.decode(reader, m.getDepartmentLastUpateDate()));
        reader = rootReader.newObjectReader("operational");
        m.setOperational(decoder0.decode(reader, m.isOperational()));
        reader = rootReader.newObjectReader("productDepartmentCode");
        m.setProductDepartmentCode(decoder0.decode(reader, m.getProductDepartmentCode()));
        reader = rootReader.newObjectReader("productDepartmentKey");
        m.setProductDepartmentKey(decoder0.decode(reader, m.getProductDepartmentKey()));
        reader = rootReader.newObjectReader("productDepartmentName");
        m.setProductDepartmentName(decoder0.decode(reader, m.getProductDepartmentName()));
        reader = rootReader.newObjectReader("warehouseLocation");
        m.setWarehouseLocation(decoder0.decode(reader, m.getWarehouseLocation()));
        reader = rootReader.newObjectReader("warehouseLocationCode");
        m.setWarehouseLocationCode(decoder0.decode(reader, m.getWarehouseLocationCode()));
        return m;
    }
}