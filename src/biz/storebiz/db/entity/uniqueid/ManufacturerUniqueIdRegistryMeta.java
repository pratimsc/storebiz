package biz.storebiz.db.entity.uniqueid;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-27 20:55:07")
/** */
public final class ManufacturerUniqueIdRegistryMeta extends org.slim3.datastore.ModelMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry> manufacturerIdPrefix = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry>(this, "manufacturerIdPrefix", "manufacturerIdPrefix");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry, java.lang.Long> manufacturerIdSequence = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry, java.lang.Long>(this, "manufacturerIdSequence", "manufacturerIdSequence", long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry, com.google.appengine.api.datastore.Key> manufacturerUniqueIdKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry, com.google.appengine.api.datastore.Key>(this, "__key__", "manufacturerUniqueIdKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry, java.lang.Long> totalManufacturerRegistered = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry, java.lang.Long>(this, "totalManufacturerRegistered", "totalManufacturerRegistered", long.class);

    private static final ManufacturerUniqueIdRegistryMeta slim3_singleton = new ManufacturerUniqueIdRegistryMeta();

    /**
     * @return the singleton
     */
    public static ManufacturerUniqueIdRegistryMeta get() {
       return slim3_singleton;
    }

    /** */
    public ManufacturerUniqueIdRegistryMeta() {
        super("ManufacturerUniqueIdRegistry", biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry.class);
    }

    @Override
    public biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry model = new biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry();
        model.setManufacturerIdPrefix((java.lang.String) entity.getProperty("manufacturerIdPrefix"));
        model.setManufacturerIdSequence(longToPrimitiveLong((java.lang.Long) entity.getProperty("manufacturerIdSequence")));
        model.setManufacturerUniqueIdKey(entity.getKey());
        model.setTotalManufacturerRegistered(longToPrimitiveLong((java.lang.Long) entity.getProperty("totalManufacturerRegistered")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry m = (biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getManufacturerUniqueIdKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getManufacturerUniqueIdKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("manufacturerIdPrefix", m.getManufacturerIdPrefix());
        entity.setProperty("manufacturerIdSequence", m.getManufacturerIdSequence());
        entity.setProperty("totalManufacturerRegistered", m.getTotalManufacturerRegistered());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry m = (biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry) model;
        return m.getManufacturerUniqueIdKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry m = (biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry) model;
        m.setManufacturerUniqueIdKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
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
        biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry m = (biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getManufacturerIdPrefix() != null){
            writer.setNextPropertyName("manufacturerIdPrefix");
            encoder0.encode(writer, m.getManufacturerIdPrefix());
        }
        writer.setNextPropertyName("manufacturerIdSequence");
        encoder0.encode(writer, m.getManufacturerIdSequence());
        if(m.getManufacturerUniqueIdKey() != null){
            writer.setNextPropertyName("manufacturerUniqueIdKey");
            encoder0.encode(writer, m.getManufacturerUniqueIdKey());
        }
        writer.setNextPropertyName("totalManufacturerRegistered");
        encoder0.encode(writer, m.getTotalManufacturerRegistered());
        writer.endObject();
    }

    @Override
    protected biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry m = new biz.storebiz.db.entity.uniqueid.ManufacturerUniqueIdRegistry();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("manufacturerIdPrefix");
        m.setManufacturerIdPrefix(decoder0.decode(reader, m.getManufacturerIdPrefix()));
        reader = rootReader.newObjectReader("manufacturerIdSequence");
        m.setManufacturerIdSequence(decoder0.decode(reader, m.getManufacturerIdSequence()));
        reader = rootReader.newObjectReader("manufacturerUniqueIdKey");
        m.setManufacturerUniqueIdKey(decoder0.decode(reader, m.getManufacturerUniqueIdKey()));
        reader = rootReader.newObjectReader("totalManufacturerRegistered");
        m.setTotalManufacturerRegistered(decoder0.decode(reader, m.getTotalManufacturerRegistered()));
        return m;
    }
}