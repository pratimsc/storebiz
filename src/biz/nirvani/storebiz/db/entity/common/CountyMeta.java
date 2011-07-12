package biz.nirvani.storebiz.db.entity.common;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-12 23:04:51")
/** */
public final class CountyMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.common.County> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County> countryCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County>(this, "countryCode", "countryCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, com.google.appengine.api.datastore.Key> countryKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, com.google.appengine.api.datastore.Key>(this, "countryKey", "countryKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County> countyCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County>(this, "countyCode", "countyCode");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County> countyCodeType = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County>(this, "countyCodeType", "countyCodeType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, com.google.appengine.api.datastore.Key> countyKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, com.google.appengine.api.datastore.Key>(this, "__key__", "countyKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County> countyName = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County>(this, "countyName", "countyName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County> language = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.County>(this, "language", "language");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, java.util.Date> lastModificationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.County, java.util.Date>(this, "lastModificationDate", "lastModificationDate", java.util.Date.class);

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.ModificationDate slim3_lastModificationDateAttributeListener = new org.slim3.datastore.ModificationDate();

    private static final CountyMeta slim3_singleton = new CountyMeta();

    /**
     * @return the singleton
     */
    public static CountyMeta get() {
       return slim3_singleton;
    }

    /** */
    public CountyMeta() {
        super("County", biz.nirvani.storebiz.db.entity.common.County.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.common.County entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.common.County model = new biz.nirvani.storebiz.db.entity.common.County();
        model.setCountryCode((java.lang.String) entity.getProperty("countryCode"));
        model.setCountryKey((com.google.appengine.api.datastore.Key) entity.getProperty("countryKey"));
        model.setCountyCode((java.lang.String) entity.getProperty("countyCode"));
        model.setCountyCodeType((java.lang.String) entity.getProperty("countyCodeType"));
        model.setCountyKey(entity.getKey());
        model.setCountyName((java.lang.String) entity.getProperty("countyName"));
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setLanguage((java.lang.String) entity.getProperty("language"));
        model.setLastModificationDate((java.util.Date) entity.getProperty("lastModificationDate"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.common.County m = (biz.nirvani.storebiz.db.entity.common.County) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getCountyKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getCountyKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("countryCode", m.getCountryCode());
        entity.setProperty("countryKey", m.getCountryKey());
        entity.setProperty("countyCode", m.getCountyCode());
        entity.setProperty("countyCodeType", m.getCountyCodeType());
        entity.setProperty("countyName", m.getCountyName());
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("language", m.getLanguage());
        entity.setProperty("lastModificationDate", m.getLastModificationDate());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.common.County m = (biz.nirvani.storebiz.db.entity.common.County) model;
        return m.getCountyKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.common.County m = (biz.nirvani.storebiz.db.entity.common.County) model;
        m.setCountyKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.common.County) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.nirvani.storebiz.db.entity.common.County m = (biz.nirvani.storebiz.db.entity.common.County) model;
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
        biz.nirvani.storebiz.db.entity.common.County m = (biz.nirvani.storebiz.db.entity.common.County) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCountryCode() != null){
            writer.setNextPropertyName("countryCode");
            encoder0.encode(writer, m.getCountryCode());
        }
        if(m.getCountryKey() != null){
            writer.setNextPropertyName("countryKey");
            encoder0.encode(writer, m.getCountryKey());
        }
        if(m.getCountyCode() != null){
            writer.setNextPropertyName("countyCode");
            encoder0.encode(writer, m.getCountyCode());
        }
        if(m.getCountyCodeType() != null){
            writer.setNextPropertyName("countyCodeType");
            encoder0.encode(writer, m.getCountyCodeType());
        }
        if(m.getCountyKey() != null){
            writer.setNextPropertyName("countyKey");
            encoder0.encode(writer, m.getCountyKey());
        }
        if(m.getCountyName() != null){
            writer.setNextPropertyName("countyName");
            encoder0.encode(writer, m.getCountyName());
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
    protected biz.nirvani.storebiz.db.entity.common.County jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.common.County m = new biz.nirvani.storebiz.db.entity.common.County();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("countryCode");
        m.setCountryCode(decoder0.decode(reader, m.getCountryCode()));
        reader = rootReader.newObjectReader("countryKey");
        m.setCountryKey(decoder0.decode(reader, m.getCountryKey()));
        reader = rootReader.newObjectReader("countyCode");
        m.setCountyCode(decoder0.decode(reader, m.getCountyCode()));
        reader = rootReader.newObjectReader("countyCodeType");
        m.setCountyCodeType(decoder0.decode(reader, m.getCountyCodeType()));
        reader = rootReader.newObjectReader("countyKey");
        m.setCountyKey(decoder0.decode(reader, m.getCountyKey()));
        reader = rootReader.newObjectReader("countyName");
        m.setCountyName(decoder0.decode(reader, m.getCountyName()));
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("language");
        m.setLanguage(decoder0.decode(reader, m.getLanguage()));
        reader = rootReader.newObjectReader("lastModificationDate");
        m.setLastModificationDate(decoder0.decode(reader, m.getLastModificationDate()));
        return m;
    }
}