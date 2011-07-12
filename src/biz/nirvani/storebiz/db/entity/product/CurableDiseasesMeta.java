package biz.nirvani.storebiz.db.entity.product;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-12 23:04:51")
/** */
public final class CurableDiseasesMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.product.CurableDiseases> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.CurableDiseases, com.google.appengine.api.datastore.Key> associatedProductKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.CurableDiseases, com.google.appengine.api.datastore.Key>(this, "associatedProductKey", "associatedProductKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.CurableDiseases, com.google.appengine.api.datastore.Key> curableDiseaseKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.CurableDiseases, com.google.appengine.api.datastore.Key>(this, "__key__", "curableDiseaseKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.CurableDiseases> curableDiseaseName = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.CurableDiseases>(this, "curableDiseaseName", "curableDiseaseName");

    private static final CurableDiseasesMeta slim3_singleton = new CurableDiseasesMeta();

    /**
     * @return the singleton
     */
    public static CurableDiseasesMeta get() {
       return slim3_singleton;
    }

    /** */
    public CurableDiseasesMeta() {
        super("CurableDiseases", biz.nirvani.storebiz.db.entity.product.CurableDiseases.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.product.CurableDiseases entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.product.CurableDiseases model = new biz.nirvani.storebiz.db.entity.product.CurableDiseases();
        model.setAssociatedProductKey((com.google.appengine.api.datastore.Key) entity.getProperty("associatedProductKey"));
        model.setCurableDiseaseKey(entity.getKey());
        model.setCurableDiseaseName((java.lang.String) entity.getProperty("curableDiseaseName"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.product.CurableDiseases m = (biz.nirvani.storebiz.db.entity.product.CurableDiseases) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getCurableDiseaseKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getCurableDiseaseKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("associatedProductKey", m.getAssociatedProductKey());
        entity.setProperty("curableDiseaseName", m.getCurableDiseaseName());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.product.CurableDiseases m = (biz.nirvani.storebiz.db.entity.product.CurableDiseases) model;
        return m.getCurableDiseaseKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.product.CurableDiseases m = (biz.nirvani.storebiz.db.entity.product.CurableDiseases) model;
        m.setCurableDiseaseKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.product.CurableDiseases) is not defined.");
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
        biz.nirvani.storebiz.db.entity.product.CurableDiseases m = (biz.nirvani.storebiz.db.entity.product.CurableDiseases) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAssociatedProductKey() != null){
            writer.setNextPropertyName("associatedProductKey");
            encoder0.encode(writer, m.getAssociatedProductKey());
        }
        if(m.getCurableDiseaseKey() != null){
            writer.setNextPropertyName("curableDiseaseKey");
            encoder0.encode(writer, m.getCurableDiseaseKey());
        }
        if(m.getCurableDiseaseName() != null){
            writer.setNextPropertyName("curableDiseaseName");
            encoder0.encode(writer, m.getCurableDiseaseName());
        }
        writer.endObject();
    }

    @Override
    protected biz.nirvani.storebiz.db.entity.product.CurableDiseases jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.product.CurableDiseases m = new biz.nirvani.storebiz.db.entity.product.CurableDiseases();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("associatedProductKey");
        m.setAssociatedProductKey(decoder0.decode(reader, m.getAssociatedProductKey()));
        reader = rootReader.newObjectReader("curableDiseaseKey");
        m.setCurableDiseaseKey(decoder0.decode(reader, m.getCurableDiseaseKey()));
        reader = rootReader.newObjectReader("curableDiseaseName");
        m.setCurableDiseaseName(decoder0.decode(reader, m.getCurableDiseaseName()));
        return m;
    }
}