package biz.nirvani.storebiz.db.entity.common;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-12 23:04:52")
/** */
public final class AppCurrencyMeta extends org.slim3.datastore.ModelMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency> baseCurrencyCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency>(this, "baseCurrencyCode", "baseCurrencyCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, com.google.appengine.api.datastore.Key> currencyKey = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, com.google.appengine.api.datastore.Key>(this, "__key__", "currencyKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, java.lang.Long> decimalPositionAdjuster = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, java.lang.Long>(this, "decimalPositionAdjuster", "decimalPositionAdjuster", long.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency> exchangeCurrencyCode = new org.slim3.datastore.StringAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency>(this, "exchangeCurrencyCode", "exchangeCurrencyCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, java.lang.Long> exchangeRateWithoutDecimalAdjustement = new org.slim3.datastore.CoreAttributeMeta<biz.nirvani.storebiz.db.entity.common.AppCurrency, java.lang.Long>(this, "exchangeRateWithoutDecimalAdjustement", "exchangeRateWithoutDecimalAdjustement", long.class);

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final AppCurrencyMeta slim3_singleton = new AppCurrencyMeta();

    /**
     * @return the singleton
     */
    public static AppCurrencyMeta get() {
       return slim3_singleton;
    }

    /** */
    public AppCurrencyMeta() {
        super("AppCurrency", biz.nirvani.storebiz.db.entity.common.AppCurrency.class);
    }

    @Override
    public biz.nirvani.storebiz.db.entity.common.AppCurrency entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.nirvani.storebiz.db.entity.common.AppCurrency model = new biz.nirvani.storebiz.db.entity.common.AppCurrency();
        model.setBaseCurrencyCode((java.lang.String) entity.getProperty("baseCurrencyCode"));
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setCurrencyKey(entity.getKey());
        model.setDecimalPositionAdjuster(longToPrimitiveLong((java.lang.Long) entity.getProperty("decimalPositionAdjuster")));
        model.setExchangeCurrencyCode((java.lang.String) entity.getProperty("exchangeCurrencyCode"));
        model.setExchangeRateWithoutDecimalAdjustement(longToPrimitiveLong((java.lang.Long) entity.getProperty("exchangeRateWithoutDecimalAdjustement")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.nirvani.storebiz.db.entity.common.AppCurrency m = (biz.nirvani.storebiz.db.entity.common.AppCurrency) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getCurrencyKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getCurrencyKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("baseCurrencyCode", m.getBaseCurrencyCode());
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("decimalPositionAdjuster", m.getDecimalPositionAdjuster());
        entity.setProperty("exchangeCurrencyCode", m.getExchangeCurrencyCode());
        entity.setProperty("exchangeRateWithoutDecimalAdjustement", m.getExchangeRateWithoutDecimalAdjustement());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.nirvani.storebiz.db.entity.common.AppCurrency m = (biz.nirvani.storebiz.db.entity.common.AppCurrency) model;
        return m.getCurrencyKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.nirvani.storebiz.db.entity.common.AppCurrency m = (biz.nirvani.storebiz.db.entity.common.AppCurrency) model;
        m.setCurrencyKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.nirvani.storebiz.db.entity.common.AppCurrency) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.nirvani.storebiz.db.entity.common.AppCurrency m = (biz.nirvani.storebiz.db.entity.common.AppCurrency) model;
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
        biz.nirvani.storebiz.db.entity.common.AppCurrency m = (biz.nirvani.storebiz.db.entity.common.AppCurrency) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getBaseCurrencyCode() != null){
            writer.setNextPropertyName("baseCurrencyCode");
            encoder0.encode(writer, m.getBaseCurrencyCode());
        }
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getCurrencyKey() != null){
            writer.setNextPropertyName("currencyKey");
            encoder0.encode(writer, m.getCurrencyKey());
        }
        writer.setNextPropertyName("decimalPositionAdjuster");
        encoder0.encode(writer, m.getDecimalPositionAdjuster());
        if(m.getExchangeCurrencyCode() != null){
            writer.setNextPropertyName("exchangeCurrencyCode");
            encoder0.encode(writer, m.getExchangeCurrencyCode());
        }
        writer.setNextPropertyName("exchangeRateWithoutDecimalAdjustement");
        encoder0.encode(writer, m.getExchangeRateWithoutDecimalAdjustement());
        writer.endObject();
    }

    @Override
    protected biz.nirvani.storebiz.db.entity.common.AppCurrency jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.nirvani.storebiz.db.entity.common.AppCurrency m = new biz.nirvani.storebiz.db.entity.common.AppCurrency();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("baseCurrencyCode");
        m.setBaseCurrencyCode(decoder0.decode(reader, m.getBaseCurrencyCode()));
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("currencyKey");
        m.setCurrencyKey(decoder0.decode(reader, m.getCurrencyKey()));
        reader = rootReader.newObjectReader("decimalPositionAdjuster");
        m.setDecimalPositionAdjuster(decoder0.decode(reader, m.getDecimalPositionAdjuster()));
        reader = rootReader.newObjectReader("exchangeCurrencyCode");
        m.setExchangeCurrencyCode(decoder0.decode(reader, m.getExchangeCurrencyCode()));
        reader = rootReader.newObjectReader("exchangeRateWithoutDecimalAdjustement");
        m.setExchangeRateWithoutDecimalAdjustement(decoder0.decode(reader, m.getExchangeRateWithoutDecimalAdjustement()));
        return m;
    }
}