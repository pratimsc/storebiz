package biz.nirvani.storebiz.db.entity.common;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-13 18:56:28")
/** */
public final class CountryMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.common.Country> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country> countryCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country>(this, "countryCode", "countryCode");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country> countryCodeType = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country>(this, "countryCodeType", "countryCodeType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country, com.google.appengine.api.datastore.Key> countryKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country, com.google.appengine.api.datastore.Key>(this, "__key__", "countryKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country> countryName = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country>(this, "countryName", "countryName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country> language = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country>(this, "language", "language");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country, java.util.Date> lastModificationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.Country, java.util.Date>(this, "lastModificationDate", "lastModificationDate", java.util.Date.class);

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.ModificationDate slim3_lastModificationDateAttributeListener = new org.slim3.datastore.ModificationDate();

    private static final CountryMeta slim3_singleton = new CountryMeta();

    /**
     * @return the singleton
     */
    public static CountryMeta get() {
       return slim3_singleton;
    }

    /** */
    public CountryMeta() {
        super("Country", biz.nirvani.storebiz.db.entity.common.Country.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.common.Country entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.common.Country model = new biz.nirvani.storebiz.db.entity.common.Country();
        model.setCountryCode((java.lang.String) entity.getProperty("countryCode"));
        model.setCountryCodeType((java.lang.String) entity.getProperty("countryCodeType"));
        model.setCountryKey(entity.getKey());
        model.setCountryName((java.lang.String) entity.getProperty("countryName"));
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setLanguage((java.lang.String) entity.getProperty("language"));
        model.setLastModificationDate((java.util.Date) entity.getProperty("lastModificationDate"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.common.Country m = (biz.nirvani.storebiz.db.entity.common.Country) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getCountryKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getCountryKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("countryCode", m.getCountryCode());
        entity.setProperty("countryCodeType", m.getCountryCodeType());
        entity.setProperty("countryName", m.getCountryName());
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("language", m.getLanguage());
        entity.setProperty("lastModificationDate", m.getLastModificationDate());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.common.Country m = (biz.nirvani.storebiz.db.entity.common.Country) model;
        return m.getCountryKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.common.Country m = (biz.nirvani.storebiz.db.entity.common.Country) model;
        m.setCountryKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.common.Country) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.nirvani.storebiz.db.entity.common.Country m = (biz.nirvani.storebiz.db.entity.common.Country) model;
        m.setCreationDate(slim3_creationDateAttributeListener.prePut(m.getCreationDate()));
        m.setLastModificationDate(slim3_lastModificationDateAttributeListener.prePut(m.getLastModificationDate()));
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
        biz.nirvani.storebiz.db.entity.common.Country m = (biz.nirvani.storebiz.db.entity.common.Country) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCountryCode() != null){
            writer.setNextPropertyName("countryCode");
            encoder0.encode(writer, m.getCountryCode());
        }
        if(m.getCountryCodeType() != null){
            writer.setNextPropertyName("countryCodeType");
            encoder0.encode(writer, m.getCountryCodeType());
        }
        if(m.getCountryKey() != null){
            writer.setNextPropertyName("countryKey");
            encoder0.encode(writer, m.getCountryKey());
        }
        if(m.getCountryName() != null){
            writer.setNextPropertyName("countryName");
            encoder0.encode(writer, m.getCountryName());
        }
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getLanguage() != null){
            writer.setNextPropertyName("language");
            encoder0.encode(writer, m.getLanguage());
        }
        if(m.getLastModificationDate() != null){
            writer.setNextPropertyName("lastModificationDate");
            encoder0.encode(writer, m.getLastModificationDate());
        }
        writer.endObject();
    }

    @Override
    protected biz.nirvani.storebiz.db.entity.common.Country jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.common.Country m = new biz.nirvani.storebiz.db.entity.common.Country();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("countryCode");
        m.setCountryCode(decoder0.decode(reader, m.getCountryCode()));
        reader = rootReader.newObjectReader("countryCodeType");
        m.setCountryCodeType(decoder0.decode(reader, m.getCountryCodeType()));
        reader = rootReader.newObjectReader("countryKey");
        m.setCountryKey(decoder0.decode(reader, m.getCountryKey()));
        reader = rootReader.newObjectReader("countryName");
        m.setCountryName(decoder0.decode(reader, m.getCountryName()));
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("language");
        m.setLanguage(decoder0.decode(reader, m.getLanguage()));
        reader = rootReader.newObjectReader("lastModificationDate");
        m.setLastModificationDate(decoder0.decode(reader, m.getLastModificationDate()));
        return m;
    }
}