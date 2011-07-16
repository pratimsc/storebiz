package biz.storebiz.db.entity.manufacturer;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-16 12:03:29")
/** */
public final class ManufacturerMeta extends org.slim3.datastore.ModelMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date> lastModificationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date>(this, "lastModificationDate", "lastModificationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> manufacturerId = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer>(this, "manufacturerId", "manufacturerId");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, com.google.appengine.api.datastore.Key> manufacturerKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, com.google.appengine.api.datastore.Key>(this, "__key__", "manufacturerKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> manufacturerName = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer>(this, "manufacturerName", "manufacturerName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date> manufacturerRegistrationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date>(this, "manufacturerRegistrationDate", "manufacturerRegistrationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date> manufacturerRegistrationExpiryDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer, java.util.Date>(this, "manufacturerRegistrationExpiryDate", "manufacturerRegistrationExpiryDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> primaryAddressCountry = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer>(this, "primaryAddressCountry", "primaryAddressCountry");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> primaryAddressCountryCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer>(this, "primaryAddressCountryCode", "primaryAddressCountryCode");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> primaryAddressCounty = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer>(this, "primaryAddressCounty", "primaryAddressCounty");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> primaryAddressCountyCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer>(this, "primaryAddressCountyCode", "primaryAddressCountyCode");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer> status = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.manufacturer.Manufacturer>(this, "status", "status");

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.ModificationDate slim3_lastModificationDateAttributeListener = new org.slim3.datastore.ModificationDate();

    private static final org.slim3.datastore.CreationDate slim3_manufacturerRegistrationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final ManufacturerMeta slim3_singleton = new ManufacturerMeta();

    /**
     * @return the singleton
     */
    public static ManufacturerMeta get() {
       return slim3_singleton;
    }

    /** */
    public ManufacturerMeta() {
        super("Manufacturer", biz.storebiz.db.entity.manufacturer.Manufacturer.class);
    }

    @Override
    public biz.storebiz.db.entity.manufacturer.Manufacturer entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.storebiz.db.entity.manufacturer.Manufacturer model = new biz.storebiz.db.entity.manufacturer.Manufacturer();
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setLastModificationDate((java.util.Date) entity.getProperty("lastModificationDate"));
        model.setManufacturerId((java.lang.String) entity.getProperty("manufacturerId"));
        model.setManufacturerKey(entity.getKey());
        model.setManufacturerName((java.lang.String) entity.getProperty("manufacturerName"));
        model.setManufacturerRegistrationDate((java.util.Date) entity.getProperty("manufacturerRegistrationDate"));
        model.setManufacturerRegistrationExpiryDate((java.util.Date) entity.getProperty("manufacturerRegistrationExpiryDate"));
        java.util.List<biz.storebiz.db.entity.common.Address> _postalAddresses = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("postalAddresses"));
        model.setPostalAddresses(_postalAddresses);
        model.setPrimaryAddressCountry((java.lang.String) entity.getProperty("primaryAddressCountry"));
        model.setPrimaryAddressCountryCode((java.lang.String) entity.getProperty("primaryAddressCountryCode"));
        model.setPrimaryAddressCounty((java.lang.String) entity.getProperty("primaryAddressCounty"));
        model.setPrimaryAddressCountyCode((java.lang.String) entity.getProperty("primaryAddressCountyCode"));
        model.setStatus((java.lang.String) entity.getProperty("status"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.storebiz.db.entity.manufacturer.Manufacturer m = (biz.storebiz.db.entity.manufacturer.Manufacturer) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getManufacturerKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getManufacturerKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("lastModificationDate", m.getLastModificationDate());
        entity.setProperty("manufacturerId", m.getManufacturerId());
        entity.setProperty("manufacturerName", m.getManufacturerName());
        entity.setProperty("manufacturerRegistrationDate", m.getManufacturerRegistrationDate());
        entity.setProperty("manufacturerRegistrationExpiryDate", m.getManufacturerRegistrationExpiryDate());
        entity.setUnindexedProperty("postalAddresses", serializableToBlob(m.getPostalAddresses()));
        entity.setProperty("primaryAddressCountry", m.getPrimaryAddressCountry());
        entity.setProperty("primaryAddressCountryCode", m.getPrimaryAddressCountryCode());
        entity.setProperty("primaryAddressCounty", m.getPrimaryAddressCounty());
        entity.setProperty("primaryAddressCountyCode", m.getPrimaryAddressCountyCode());
        entity.setProperty("status", m.getStatus());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.storebiz.db.entity.manufacturer.Manufacturer m = (biz.storebiz.db.entity.manufacturer.Manufacturer) model;
        return m.getManufacturerKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.storebiz.db.entity.manufacturer.Manufacturer m = (biz.storebiz.db.entity.manufacturer.Manufacturer) model;
        m.setManufacturerKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.storebiz.db.entity.manufacturer.Manufacturer) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.storebiz.db.entity.manufacturer.Manufacturer m = (biz.storebiz.db.entity.manufacturer.Manufacturer) model;
        m.setCreationDate(slim3_creationDateAttributeListener.prePut(m.getCreationDate()));
        m.setLastModificationDate(slim3_lastModificationDateAttributeListener.prePut(m.getLastModificationDate()));
        m.setManufacturerRegistrationDate(slim3_manufacturerRegistrationDateAttributeListener.prePut(m.getManufacturerRegistrationDate()));
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
        biz.storebiz.db.entity.manufacturer.Manufacturer m = (biz.storebiz.db.entity.manufacturer.Manufacturer) model;
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
        if(m.getManufacturerId() != null){
            writer.setNextPropertyName("manufacturerId");
            encoder0.encode(writer, m.getManufacturerId());
        }
        if(m.getManufacturerKey() != null){
            writer.setNextPropertyName("manufacturerKey");
            encoder0.encode(writer, m.getManufacturerKey());
        }
        if(m.getManufacturerName() != null){
            writer.setNextPropertyName("manufacturerName");
            encoder0.encode(writer, m.getManufacturerName());
        }
        if(m.getManufacturerRegistrationDate() != null){
            writer.setNextPropertyName("manufacturerRegistrationDate");
            encoder0.encode(writer, m.getManufacturerRegistrationDate());
        }
        if(m.getManufacturerRegistrationExpiryDate() != null){
            writer.setNextPropertyName("manufacturerRegistrationExpiryDate");
            encoder0.encode(writer, m.getManufacturerRegistrationExpiryDate());
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
        if(m.getStatus() != null){
            writer.setNextPropertyName("status");
            encoder0.encode(writer, m.getStatus());
        }
        writer.endObject();
    }

    @Override
    protected biz.storebiz.db.entity.manufacturer.Manufacturer jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.storebiz.db.entity.manufacturer.Manufacturer m = new biz.storebiz.db.entity.manufacturer.Manufacturer();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("lastModificationDate");
        m.setLastModificationDate(decoder0.decode(reader, m.getLastModificationDate()));
        reader = rootReader.newObjectReader("manufacturerId");
        m.setManufacturerId(decoder0.decode(reader, m.getManufacturerId()));
        reader = rootReader.newObjectReader("manufacturerKey");
        m.setManufacturerKey(decoder0.decode(reader, m.getManufacturerKey()));
        reader = rootReader.newObjectReader("manufacturerName");
        m.setManufacturerName(decoder0.decode(reader, m.getManufacturerName()));
        reader = rootReader.newObjectReader("manufacturerRegistrationDate");
        m.setManufacturerRegistrationDate(decoder0.decode(reader, m.getManufacturerRegistrationDate()));
        reader = rootReader.newObjectReader("manufacturerRegistrationExpiryDate");
        m.setManufacturerRegistrationExpiryDate(decoder0.decode(reader, m.getManufacturerRegistrationExpiryDate()));
        reader = rootReader.newObjectReader("postalAddresses");
        reader = rootReader.newObjectReader("primaryAddressCountry");
        m.setPrimaryAddressCountry(decoder0.decode(reader, m.getPrimaryAddressCountry()));
        reader = rootReader.newObjectReader("primaryAddressCountryCode");
        m.setPrimaryAddressCountryCode(decoder0.decode(reader, m.getPrimaryAddressCountryCode()));
        reader = rootReader.newObjectReader("primaryAddressCounty");
        m.setPrimaryAddressCounty(decoder0.decode(reader, m.getPrimaryAddressCounty()));
        reader = rootReader.newObjectReader("primaryAddressCountyCode");
        m.setPrimaryAddressCountyCode(decoder0.decode(reader, m.getPrimaryAddressCountyCode()));
        reader = rootReader.newObjectReader("status");
        m.setStatus(decoder0.decode(reader, m.getStatus()));
        return m;
    }
}