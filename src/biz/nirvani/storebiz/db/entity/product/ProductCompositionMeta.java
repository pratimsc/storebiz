package biz.nirvani.storebiz.db.entity.product;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-12 23:04:50")
/** */
public final class ProductCompositionMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition, com.google.appengine.api.datastore.Key> associatedProductKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition, com.google.appengine.api.datastore.Key>(this, "associatedProductKey", "associatedProductKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition> compositionName = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition>(this, "compositionName", "compositionName");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition> compositionValue = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition>(this, "compositionValue", "compositionValue");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition, com.google.appengine.api.datastore.Key> productCompositionKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.product.ProductComposition, com.google.appengine.api.datastore.Key>(this, "__key__", "productCompositionKey", com.google.appengine.api.datastore.Key.class);

    private static final ProductCompositionMeta slim3_singleton = new ProductCompositionMeta();

    /**
     * @return the singleton
     */
    public static ProductCompositionMeta get() {
       return slim3_singleton;
    }

    /** */
    public ProductCompositionMeta() {
        super("ProductComposition", biz.nirvani.storebiz.db.entity.product.ProductComposition.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.product.ProductComposition entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.product.ProductComposition model = new biz.nirvani.storebiz.db.entity.product.ProductComposition();
        model.setAssociatedProductKey((com.google.appengine.api.datastore.Key) entity.getProperty("associatedProductKey"));
        model.setCompositionName((java.lang.String) entity.getProperty("compositionName"));
        model.setCompositionValue((java.lang.String) entity.getProperty("compositionValue"));
        model.setProductCompositionKey(entity.getKey());
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.product.ProductComposition m = (biz.nirvani.storebiz.db.entity.product.ProductComposition) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getProductCompositionKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getProductCompositionKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("associatedProductKey", m.getAssociatedProductKey());
        entity.setProperty("compositionName", m.getCompositionName());
        entity.setProperty("compositionValue", m.getCompositionValue());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.product.ProductComposition m = (biz.nirvani.storebiz.db.entity.product.ProductComposition) model;
        return m.getProductCompositionKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.product.ProductComposition m = (biz.nirvani.storebiz.db.entity.product.ProductComposition) model;
        m.setProductCompositionKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.product.ProductComposition) is not defined.");
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
        biz.nirvani.storebiz.db.entity.product.ProductComposition m = (biz.nirvani.storebiz.db.entity.product.ProductComposition) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAssociatedProductKey() != null){
            writer.setNextPropertyName("associatedProductKey");
            encoder0.encode(writer, m.getAssociatedProductKey());
        }
        if(m.getCompositionName() != null){
            writer.setNextPropertyName("compositionName");
            encoder0.encode(writer, m.getCompositionName());
        }
        if(m.getCompositionValue() != null){
            writer.setNextPropertyName("compositionValue");
            encoder0.encode(writer, m.getCompositionValue());
        }
        if(m.getProductCompositionKey() != null){
            writer.setNextPropertyName("productCompositionKey");
            encoder0.encode(writer, m.getProductCompositionKey());
        }
        writer.endObject();
    }

    @Override
    protected biz.nirvani.storebiz.db.entity.product.ProductComposition jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.product.ProductComposition m = new biz.nirvani.storebiz.db.entity.product.ProductComposition();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("associatedProductKey");
        m.setAssociatedProductKey(decoder0.decode(reader, m.getAssociatedProductKey()));
        reader = rootReader.newObjectReader("compositionName");
        m.setCompositionName(decoder0.decode(reader, m.getCompositionName()));
        reader = rootReader.newObjectReader("compositionValue");
        m.setCompositionValue(decoder0.decode(reader, m.getCompositionValue()));
        reader = rootReader.newObjectReader("productCompositionKey");
        m.setProductCompositionKey(decoder0.decode(reader, m.getProductCompositionKey()));
        return m;
    }
}