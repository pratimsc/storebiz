package biz.storebiz.db.entity.supplier;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-17 21:03:12")
/** */
public final class SupplierMeta extends org.slim3.datastore.ModelMeta<biz.storebiz.db.entity.supplier.Supplier> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date> lastModificationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date>(this, "lastModificationDate", "lastModificationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier> primaryAddressCountry = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier>(this, "primaryAddressCountry", "primaryAddressCountry");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier> primaryAddressCountryCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier>(this, "primaryAddressCountryCode", "primaryAddressCountryCode");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier> primaryAddressCounty = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier>(this, "primaryAddressCounty", "primaryAddressCounty");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier> primaryAddressCountyCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier>(this, "primaryAddressCountyCode", "primaryAddressCountyCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date> registrationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date>(this, "registrationDate", "registrationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date> registrationExpiryDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, java.util.Date>(this, "registrationExpiryDate", "registrationExpiryDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier> status = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier>(this, "status", "status");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier> supplierId = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier>(this, "supplierId", "supplierId");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, com.google.appengine.api.datastore.Key> supplierKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.supplier.Supplier, com.google.appengine.api.datastore.Key>(this, "__key__", "supplierKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier> supplierName = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.supplier.Supplier>(this, "supplierName", "supplierName");

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.ModificationDate slim3_lastModificationDateAttributeListener = new org.slim3.datastore.ModificationDate();

    private static final org.slim3.datastore.CreationDate slim3_registrationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final SupplierMeta slim3_singleton = new SupplierMeta();

    /**
     * @return the singleton
     */
    public static SupplierMeta get() {
       return slim3_singleton;
    }

    /** */
    public SupplierMeta() {
        super("Supplier", biz.storebiz.db.entity.supplier.Supplier.class);
    }

    @Override
    public biz.storebiz.db.entity.supplier.Supplier entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.storebiz.db.entity.supplier.Supplier model = new biz.storebiz.db.entity.supplier.Supplier();
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setLastModificationDate((java.util.Date) entity.getProperty("lastModificationDate"));
        java.util.List<biz.storebiz.db.entity.common.Address> _postalAddresses = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("postalAddresses"));
        model.setPostalAddresses(_postalAddresses);
        model.setPrimaryAddressCountry((java.lang.String) entity.getProperty("primaryAddressCountry"));
        model.setPrimaryAddressCountryCode((java.lang.String) entity.getProperty("primaryAddressCountryCode"));
        model.setPrimaryAddressCounty((java.lang.String) entity.getProperty("primaryAddressCounty"));
        model.setPrimaryAddressCountyCode((java.lang.String) entity.getProperty("primaryAddressCountyCode"));
        model.setRegistrationDate((java.util.Date) entity.getProperty("registrationDate"));
        model.setRegistrationExpiryDate((java.util.Date) entity.getProperty("registrationExpiryDate"));
        model.setStatus((java.lang.String) entity.getProperty("status"));
        model.setSupplierId((java.lang.String) entity.getProperty("supplierId"));
        model.setSupplierKey(entity.getKey());
        model.setSupplierName((java.lang.String) entity.getProperty("supplierName"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.storebiz.db.entity.supplier.Supplier m = (biz.storebiz.db.entity.supplier.Supplier) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getSupplierKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getSupplierKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("lastModificationDate", m.getLastModificationDate());
        entity.setUnindexedProperty("postalAddresses", serializableToBlob(m.getPostalAddresses()));
        entity.setProperty("primaryAddressCountry", m.getPrimaryAddressCountry());
        entity.setProperty("primaryAddressCountryCode", m.getPrimaryAddressCountryCode());
        entity.setProperty("primaryAddressCounty", m.getPrimaryAddressCounty());
        entity.setProperty("primaryAddressCountyCode", m.getPrimaryAddressCountyCode());
        entity.setProperty("registrationDate", m.getRegistrationDate());
        entity.setProperty("registrationExpiryDate", m.getRegistrationExpiryDate());
        entity.setProperty("status", m.getStatus());
        entity.setProperty("supplierId", m.getSupplierId());
        entity.setProperty("supplierName", m.getSupplierName());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.storebiz.db.entity.supplier.Supplier m = (biz.storebiz.db.entity.supplier.Supplier) model;
        return m.getSupplierKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.storebiz.db.entity.supplier.Supplier m = (biz.storebiz.db.entity.supplier.Supplier) model;
        m.setSupplierKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.storebiz.db.entity.supplier.Supplier) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.storebiz.db.entity.supplier.Supplier m = (biz.storebiz.db.entity.supplier.Supplier) model;
        m.setCreationDate(slim3_creationDateAttributeListener.prePut(m.getCreationDate()));
        m.setLastModificationDate(slim3_lastModificationDateAttributeListener.prePut(m.getLastModificationDate()));
        m.setRegistrationDate(slim3_registrationDateAttributeListener.prePut(m.getRegistrationDate()));
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
        biz.storebiz.db.entity.supplier.Supplier m = (biz.storebiz.db.entity.supplier.Supplier) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getLastModificationDate() != null){
            writer.setNextPropertyName("lastModificationDate");
            encoder0.encode(writer, m.getLastModificationDate());
        }
        if(m.getPostalAddresses() != null){
            writer.setNextPropertyName("postalAddresses");
            // biz.storebiz.db.entity.common.Address is not supported.
        }
        if(m.getPrimaryAddressCountry() != null){
            writer.setNextPropertyName("primaryAddressCountry");
            encoder0.encode(writer, m.getPrimaryAddressCountry());
        }
        if(m.getPrimaryAddressCountryCode() != null){
            writer.setNextPropertyName("primaryAddressCountryCode");
            encoder0.encode(writer, m.getPrimaryAddressCountryCode());
        }
        if(m.getPrimaryAddressCounty() != null){
            writer.setNextPropertyName("primaryAddressCounty");
            encoder0.encode(writer, m.getPrimaryAddressCounty());
        }
        if(m.getPrimaryAddressCountyCode() != null){
            writer.setNextPropertyName("primaryAddressCountyCode");
            encoder0.encode(writer, m.getPrimaryAddressCountyCode());
        }
        if(m.getRegistrationDate() != null){
            writer.setNextPropertyName("registrationDate");
            encoder0.encode(writer, m.getRegistrationDate());
        }
        if(m.getRegistrationExpiryDate() != null){
            writer.setNextPropertyName("registrationExpiryDate");
            encoder0.encode(writer, m.getRegistrationExpiryDate());
        }
        if(m.getStatus() != null){
            writer.setNextPropertyName("status");
            encoder0.encode(writer, m.getStatus());
        }
        if(m.getSupplierId() != null){
            writer.setNextPropertyName("supplierId");
            encoder0.encode(writer, m.getSupplierId());
        }
        if(m.getSupplierKey() != null){
            writer.setNextPropertyName("supplierKey");
            encoder0.encode(writer, m.getSupplierKey());
        }
        if(m.getSupplierName() != null){
            writer.setNextPropertyName("supplierName");
            encoder0.encode(writer, m.getSupplierName());
        }
        writer.endObject();
    }

    @Override
    protected biz.storebiz.db.entity.supplier.Supplier jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.storebiz.db.entity.supplier.Supplier m = new biz.storebiz.db.entity.supplier.Supplier();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("lastModificationDate");
        m.setLastModificationDate(decoder0.decode(reader, m.getLastModificationDate()));
        reader = rootReader.newObjectReader("postalAddresses");
        reader = rootReader.newObjectReader("primaryAddressCountry");
        m.setPrimaryAddressCountry(decoder0.decode(reader, m.getPrimaryAddressCountry()));
        reader = rootReader.newObjectReader("primaryAddressCountryCode");
        m.setPrimaryAddressCountryCode(decoder0.decode(reader, m.getPrimaryAddressCountryCode()));
        reader = rootReader.newObjectReader("primaryAddressCounty");
        m.setPrimaryAddressCounty(decoder0.decode(reader, m.getPrimaryAddressCounty()));
        reader = rootReader.newObjectReader("primaryAddressCountyCode");
        m.setPrimaryAddressCountyCode(decoder0.decode(reader, m.getPrimaryAddressCountyCode()));
        reader = rootReader.newObjectReader("registrationDate");
        m.setRegistrationDate(decoder0.decode(reader, m.getRegistrationDate()));
        reader = rootReader.newObjectReader("registrationExpiryDate");
        m.setRegistrationExpiryDate(decoder0.decode(reader, m.getRegistrationExpiryDate()));
        reader = rootReader.newObjectReader("status");
        m.setStatus(decoder0.decode(reader, m.getStatus()));
        reader = rootReader.newObjectReader("supplierId");
        m.setSupplierId(decoder0.decode(reader, m.getSupplierId()));
        reader = rootReader.newObjectReader("supplierKey");
        m.setSupplierKey(decoder0.decode(reader, m.getSupplierKey()));
        reader = rootReader.newObjectReader("supplierName");
        m.setSupplierName(decoder0.decode(reader, m.getSupplierName()));
        return m;
    }
}