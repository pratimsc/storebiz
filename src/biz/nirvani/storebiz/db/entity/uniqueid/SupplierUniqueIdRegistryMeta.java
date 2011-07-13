package biz.nirvani.storebiz.db.entity.uniqueid;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-13 18:56:25")
/** */
public final class SupplierUniqueIdRegistryMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry> idPrefix = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry>(this, "idPrefix", "idPrefix");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, java.lang.Long> idSequence = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, java.lang.Long>(this, "idSequence", "idSequence", long.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, java.lang.Integer> isSequenceLength = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, java.lang.Integer>(this, "isSequenceLength", "isSequenceLength", int.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, com.google.appengine.api.datastore.Key> key = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, com.google.appengine.api.datastore.Key>(this, "__key__", "key", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, java.lang.Long> totalRegistered = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry, java.lang.Long>(this, "totalRegistered", "totalRegistered", long.class);

    private static final SupplierUniqueIdRegistryMeta slim3_singleton = new SupplierUniqueIdRegistryMeta();

    /**
     * @return the singleton
     */
    public static SupplierUniqueIdRegistryMeta get() {
       return slim3_singleton;
    }

    /** */
    public SupplierUniqueIdRegistryMeta() {
        super("SupplierUniqueIdRegistry", biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry model = new biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry();
        model.setIdPrefix((java.lang.String) entity.getProperty("idPrefix"));
        model.setIdSequence(longToPrimitiveLong((java.lang.Long) entity.getProperty("idSequence")));
        model.setIsSequenceLength(longToPrimitiveInt((java.lang.Long) entity.getProperty("isSequenceLength")));
        model.setKey(entity.getKey());
        model.setTotalRegistered(longToPrimitiveLong((java.lang.Long) entity.getProperty("totalRegistered")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry m = (biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("idPrefix", m.getIdPrefix());
        entity.setProperty("idSequence", m.getIdSequence());
        entity.setProperty("isSequenceLength", m.getIsSequenceLength());
        entity.setProperty("totalRegistered", m.getTotalRegistered());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry m = (biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry) model;
        return m.getKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry m = (biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry) model;
        m.setKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry) is not defined.");
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
        biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry m = (biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getIdPrefix() != null){
            writer.setNextPropertyName("idPrefix");
            encoder0.encode(writer, m.getIdPrefix());
        }
        writer.setNextPropertyName("idSequence");
        encoder0.encode(writer, m.getIdSequence());
        writer.setNextPropertyName("isSequenceLength");
        encoder0.encode(writer, m.getIsSequenceLength());
        if(m.getKey() != null){
            writer.setNextPropertyName("key");
            encoder0.encode(writer, m.getKey());
        }
        writer.setNextPropertyName("totalRegistered");
        encoder0.encode(writer, m.getTotalRegistered());
        writer.endObject();
    }

    @Override
    protected biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry m = new biz.nirvani.storebiz.db.entity.uniqueid.SupplierUniqueIdRegistry();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("idPrefix");
        m.setIdPrefix(decoder0.decode(reader, m.getIdPrefix()));
        reader = rootReader.newObjectReader("idSequence");
        m.setIdSequence(decoder0.decode(reader, m.getIdSequence()));
        reader = rootReader.newObjectReader("isSequenceLength");
        m.setIsSequenceLength(decoder0.decode(reader, m.getIsSequenceLength()));
        reader = rootReader.newObjectReader("key");
        m.setKey(decoder0.decode(reader, m.getKey()));
        reader = rootReader.newObjectReader("totalRegistered");
        m.setTotalRegistered(decoder0.decode(reader, m.getTotalRegistered()));
        return m;
    }
}