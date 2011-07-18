package biz.storebiz.db.entity.common;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-17 21:03:14")
/** */
public final class WarehouseLocationMeta extends org.slim3.datastore.ModelMeta<biz.storebiz.db.entity.common.WarehouseLocation> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Key> associatedParentWarehouseLocation = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Key>(this, "associatedParentWarehouseLocation", "associatedParentWarehouseLocation", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Key> postalAddress = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Key>(this, "postalAddress", "postalAddress", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation> warehouseLocationCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation>(this, "warehouseLocationCode", "warehouseLocationCode");

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Text> warehouseLocationDetailDescription = new org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Text>(this, "warehouseLocationDetailDescription", "warehouseLocationDetailDescription", com.google.appengine.api.datastore.Text.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Key> warehouseLocationKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation, com.google.appengine.api.datastore.Key>(this, "__key__", "warehouseLocationKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation> warehouseLocationShortDescription = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.WarehouseLocation>(this, "warehouseLocationShortDescription", "warehouseLocationShortDescription");

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final WarehouseLocationMeta slim3_singleton = new WarehouseLocationMeta();

    /**
     * @return the singleton
     */
    public static WarehouseLocationMeta get() {
       return slim3_singleton;
    }

    /** */
    public WarehouseLocationMeta() {
        super("WarehouseLocation", biz.storebiz.db.entity.common.WarehouseLocation.class);
    }

    @Override
    public biz.storebiz.db.entity.common.WarehouseLocation entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.storebiz.db.entity.common.WarehouseLocation model = new biz.storebiz.db.entity.common.WarehouseLocation();
        model.setAssociatedParentWarehouseLocation((com.google.appengine.api.datastore.Key) entity.getProperty("associatedParentWarehouseLocation"));
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setPostalAddress((com.google.appengine.api.datastore.Key) entity.getProperty("postalAddress"));
        model.setWarehouseLocationCode((java.lang.String) entity.getProperty("warehouseLocationCode"));
        model.setWarehouseLocationDetailDescription((com.google.appengine.api.datastore.Text) entity.getProperty("warehouseLocationDetailDescription"));
        model.setWarehouseLocationKey(entity.getKey());
        model.setWarehouseLocationShortDescription((java.lang.String) entity.getProperty("warehouseLocationShortDescription"));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.storebiz.db.entity.common.WarehouseLocation m = (biz.storebiz.db.entity.common.WarehouseLocation) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getWarehouseLocationKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getWarehouseLocationKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("associatedParentWarehouseLocation", m.getAssociatedParentWarehouseLocation());
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("postalAddress", m.getPostalAddress());
        entity.setProperty("warehouseLocationCode", m.getWarehouseLocationCode());
        entity.setUnindexedProperty("warehouseLocationDetailDescription", m.getWarehouseLocationDetailDescription());
        entity.setProperty("warehouseLocationShortDescription", m.getWarehouseLocationShortDescription());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.storebiz.db.entity.common.WarehouseLocation m = (biz.storebiz.db.entity.common.WarehouseLocation) model;
        return m.getWarehouseLocationKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.storebiz.db.entity.common.WarehouseLocation m = (biz.storebiz.db.entity.common.WarehouseLocation) model;
        m.setWarehouseLocationKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.storebiz.db.entity.common.WarehouseLocation) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.storebiz.db.entity.common.WarehouseLocation m = (biz.storebiz.db.entity.common.WarehouseLocation) model;
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
        biz.storebiz.db.entity.common.WarehouseLocation m = (biz.storebiz.db.entity.common.WarehouseLocation) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAssociatedParentWarehouseLocation() != null){
            writer.setNextPropertyName("associatedParentWarehouseLocation");
            encoder0.encode(writer, m.getAssociatedParentWarehouseLocation());
        }
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getPostalAddress() != null){
            writer.setNextPropertyName("postalAddress");
            encoder0.encode(writer, m.getPostalAddress());
        }
        if(m.getWarehouseLocationCode() != null){
            writer.setNextPropertyName("warehouseLocationCode");
            encoder0.encode(writer, m.getWarehouseLocationCode());
        }
        if(m.getWarehouseLocationDetailDescription() != null && m.getWarehouseLocationDetailDescription().getValue() != null){
            writer.setNextPropertyName("warehouseLocationDetailDescription");
            encoder0.encode(writer, m.getWarehouseLocationDetailDescription());
        }
        if(m.getWarehouseLocationKey() != null){
            writer.setNextPropertyName("warehouseLocationKey");
            encoder0.encode(writer, m.getWarehouseLocationKey());
        }
        if(m.getWarehouseLocationShortDescription() != null){
            writer.setNextPropertyName("warehouseLocationShortDescription");
            encoder0.encode(writer, m.getWarehouseLocationShortDescription());
        }
        writer.endObject();
    }

    @Override
    protected biz.storebiz.db.entity.common.WarehouseLocation jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.storebiz.db.entity.common.WarehouseLocation m = new biz.storebiz.db.entity.common.WarehouseLocation();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("associatedParentWarehouseLocation");
        m.setAssociatedParentWarehouseLocation(decoder0.decode(reader, m.getAssociatedParentWarehouseLocation()));
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("postalAddress");
        m.setPostalAddress(decoder0.decode(reader, m.getPostalAddress()));
        reader = rootReader.newObjectReader("warehouseLocationCode");
        m.setWarehouseLocationCode(decoder0.decode(reader, m.getWarehouseLocationCode()));
        reader = rootReader.newObjectReader("warehouseLocationDetailDescription");
        m.setWarehouseLocationDetailDescription(decoder0.decode(reader, m.getWarehouseLocationDetailDescription()));
        reader = rootReader.newObjectReader("warehouseLocationKey");
        m.setWarehouseLocationKey(decoder0.decode(reader, m.getWarehouseLocationKey()));
        reader = rootReader.newObjectReader("warehouseLocationShortDescription");
        m.setWarehouseLocationShortDescription(decoder0.decode(reader, m.getWarehouseLocationShortDescription()));
        return m;
    }
}