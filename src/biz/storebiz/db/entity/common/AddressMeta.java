package biz.storebiz.db.entity.common;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-16 12:03:28")
/** */
public final class AddressMeta extends org.slim3.datastore.ModelMeta<biz.storebiz.db.entity.common.Address> {

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> addressDisplayName = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "addressDisplayName", "addressDisplayName");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, com.google.appengine.api.datastore.Key> addressKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, com.google.appengine.api.datastore.Key>(this, "__key__", "addressKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringCollectionAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.List<java.lang.String>> addressLines = new org.slim3.datastore.StringCollectionAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.List<java.lang.String>>(this, "addressLines", "addressLines", java.util.List.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> addressOwnerType = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "addressOwnerType", "addressOwnerType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date> addressRegistrationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date>(this, "addressRegistrationDate", "addressRegistrationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date> addressRegistrationExpiryDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date>(this, "addressRegistrationExpiryDate", "addressRegistrationExpiryDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> addressType = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "addressType", "addressType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, com.google.appengine.api.datastore.Key> addressownerKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, com.google.appengine.api.datastore.Key>(this, "addressownerKey", "addressownerKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> city = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "city", "city");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> contactFullName = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "contactFullName", "contactFullName");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> country = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "country", "country");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> countryCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "countryCode", "countryCode");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> county = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "county", "county");

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> countyCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "countyCode", "countyCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date> lastModificationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.util.Date>(this, "lastModificationDate", "lastModificationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address> postCode = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.common.Address>(this, "postCode", "postCode");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.lang.Boolean> prefferedAddress = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.common.Address, java.lang.Boolean>(this, "prefferedAddress", "prefferedAddress", boolean.class);

    private static final org.slim3.datastore.CreationDate slim3_addressRegistrationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.ModificationDate slim3_lastModificationDateAttributeListener = new org.slim3.datastore.ModificationDate();

    private static final AddressMeta slim3_singleton = new AddressMeta();

    /**
     * @return the singleton
     */
    public static AddressMeta get() {
       return slim3_singleton;
    }

    /** */
    public AddressMeta() {
        super("Address", biz.storebiz.db.entity.common.Address.class);
    }

    @Override
    public biz.storebiz.db.entity.common.Address entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.storebiz.db.entity.common.Address model = new biz.storebiz.db.entity.common.Address();
        model.setAddressDisplayName((java.lang.String) entity.getProperty("addressDisplayName"));
        model.setAddressKey(entity.getKey());
        model.setAddressLines(toList(java.lang.String.class, entity.getProperty("addressLines")));
        model.setAddressOwnerType((java.lang.String) entity.getProperty("addressOwnerType"));
        model.setAddressRegistrationDate((java.util.Date) entity.getProperty("addressRegistrationDate"));
        model.setAddressRegistrationExpiryDate((java.util.Date) entity.getProperty("addressRegistrationExpiryDate"));
        model.setAddressType((java.lang.String) entity.getProperty("addressType"));
        model.setAddressownerKey((com.google.appengine.api.datastore.Key) entity.getProperty("addressownerKey"));
        model.setCity((java.lang.String) entity.getProperty("city"));
        model.setContactFullName((java.lang.String) entity.getProperty("contactFullName"));
        model.setCountry((java.lang.String) entity.getProperty("country"));
        model.setCountryCode((java.lang.String) entity.getProperty("countryCode"));
        model.setCounty((java.lang.String) entity.getProperty("county"));
        model.setCountyCode((java.lang.String) entity.getProperty("countyCode"));
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setLastModificationDate((java.util.Date) entity.getProperty("lastModificationDate"));
        java.util.List<biz.storebiz.db.entity.common.PhoneNumber> _phoneNumbers = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("phoneNumbers"));
        model.setPhoneNumbers(_phoneNumbers);
        model.setPostCode((java.lang.String) entity.getProperty("postCode"));
        model.setPrefferedAddress(booleanToPrimitiveBoolean((java.lang.Boolean) entity.getProperty("prefferedAddress")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.storebiz.db.entity.common.Address m = (biz.storebiz.db.entity.common.Address) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getAddressKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getAddressKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("addressDisplayName", m.getAddressDisplayName());
        entity.setProperty("addressLines", m.getAddressLines());
        entity.setProperty("addressOwnerType", m.getAddressOwnerType());
        entity.setProperty("addressRegistrationDate", m.getAddressRegistrationDate());
        entity.setProperty("addressRegistrationExpiryDate", m.getAddressRegistrationExpiryDate());
        entity.setProperty("addressType", m.getAddressType());
        entity.setProperty("addressownerKey", m.getAddressownerKey());
        entity.setProperty("city", m.getCity());
        entity.setProperty("contactFullName", m.getContactFullName());
        entity.setProperty("country", m.getCountry());
        entity.setProperty("countryCode", m.getCountryCode());
        entity.setProperty("county", m.getCounty());
        entity.setProperty("countyCode", m.getCountyCode());
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("lastModificationDate", m.getLastModificationDate());
        entity.setUnindexedProperty("phoneNumbers", serializableToBlob(m.getPhoneNumbers()));
        entity.setProperty("postCode", m.getPostCode());
        entity.setProperty("prefferedAddress", m.isPrefferedAddress());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.storebiz.db.entity.common.Address m = (biz.storebiz.db.entity.common.Address) model;
        return m.getAddressKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.storebiz.db.entity.common.Address m = (biz.storebiz.db.entity.common.Address) model;
        m.setAddressKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.storebiz.db.entity.common.Address) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.storebiz.db.entity.common.Address m = (biz.storebiz.db.entity.common.Address) model;
        m.setAddressRegistrationDate(slim3_addressRegistrationDateAttributeListener.prePut(m.getAddressRegistrationDate()));
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
        biz.storebiz.db.entity.common.Address m = (biz.storebiz.db.entity.common.Address) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getAddressDisplayName() != null){
            writer.setNextPropertyName("addressDisplayName");
            encoder0.encode(writer, m.getAddressDisplayName());
        }
        if(m.getAddressKey() != null){
            writer.setNextPropertyName("addressKey");
            encoder0.encode(writer, m.getAddressKey());
        }
        if(m.getAddressLines() != null){
            writer.setNextPropertyName("addressLines");
            writer.beginArray();
            for(java.lang.String v : m.getAddressLines()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        if(m.getAddressOwnerType() != null){
            writer.setNextPropertyName("addressOwnerType");
            encoder0.encode(writer, m.getAddressOwnerType());
        }
        if(m.getAddressRegistrationDate() != null){
            writer.setNextPropertyName("addressRegistrationDate");
            encoder0.encode(writer, m.getAddressRegistrationDate());
        }
        if(m.getAddressRegistrationExpiryDate() != null){
            writer.setNextPropertyName("addressRegistrationExpiryDate");
            encoder0.encode(writer, m.getAddressRegistrationExpiryDate());
        }
        if(m.getAddressType() != null){
            writer.setNextPropertyName("addressType");
            encoder0.encode(writer, m.getAddressType());
        }
        if(m.getAddressownerKey() != null){
            writer.setNextPropertyName("addressownerKey");
            encoder0.encode(writer, m.getAddressownerKey());
        }
        if(m.getCity() != null){
            writer.setNextPropertyName("city");
            encoder0.encode(writer, m.getCity());
        }
        if(m.getContactFullName() != null){
            writer.setNextPropertyName("contactFullName");
            encoder0.encode(writer, m.getContactFullName());
        }
        if(m.getCountry() != null){
            writer.setNextPropertyName("country");
            encoder0.encode(writer, m.getCountry());
        }
        if(m.getCountryCode() != null){
            writer.setNextPropertyName("countryCode");
            encoder0.encode(writer, m.getCountryCode());
        }
        if(m.getCounty() != null){
            writer.setNextPropertyName("county");
            encoder0.encode(writer, m.getCounty());
        }
        if(m.getCountyCode() != null){
            writer.setNextPropertyName("countyCode");
            encoder0.encode(writer, m.getCountyCode());
        }
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getLastModificationDate() != null){
            writer.setNextPropertyName("lastModificationDate");
            encoder0.encode(writer, m.getLastModificationDate());
        }
        if(m.getPhoneNumbers() != null){
            writer.setNextPropertyName("phoneNumbers");
            // biz.storebiz.db.entity.common.PhoneNumber is not supported.
        }
        if(m.getPostCode() != null){
            writer.setNextPropertyName("postCode");
            encoder0.encode(writer, m.getPostCode());
        }
        writer.setNextPropertyName("prefferedAddress");
        encoder0.encode(writer, m.isPrefferedAddress());
        writer.endObject();
    }

    @Override
    protected biz.storebiz.db.entity.common.Address jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.storebiz.db.entity.common.Address m = new biz.storebiz.db.entity.common.Address();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("addressDisplayName");
        m.setAddressDisplayName(decoder0.decode(reader, m.getAddressDisplayName()));
        reader = rootReader.newObjectReader("addressKey");
        m.setAddressKey(decoder0.decode(reader, m.getAddressKey()));
        reader = rootReader.newObjectReader("addressLines");
        {
            java.util.ArrayList<java.lang.String> elements = new java.util.ArrayList<java.lang.String>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("addressLines");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    java.lang.String v = decoder0.decode(reader, (java.lang.String)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setAddressLines(elements);
            }
        }
        reader = rootReader.newObjectReader("addressOwnerType");
        m.setAddressOwnerType(decoder0.decode(reader, m.getAddressOwnerType()));
        reader = rootReader.newObjectReader("addressRegistrationDate");
        m.setAddressRegistrationDate(decoder0.decode(reader, m.getAddressRegistrationDate()));
        reader = rootReader.newObjectReader("addressRegistrationExpiryDate");
        m.setAddressRegistrationExpiryDate(decoder0.decode(reader, m.getAddressRegistrationExpiryDate()));
        reader = rootReader.newObjectReader("addressType");
        m.setAddressType(decoder0.decode(reader, m.getAddressType()));
        reader = rootReader.newObjectReader("addressownerKey");
        m.setAddressownerKey(decoder0.decode(reader, m.getAddressownerKey()));
        reader = rootReader.newObjectReader("city");
        m.setCity(decoder0.decode(reader, m.getCity()));
        reader = rootReader.newObjectReader("contactFullName");
        m.setContactFullName(decoder0.decode(reader, m.getContactFullName()));
        reader = rootReader.newObjectReader("country");
        m.setCountry(decoder0.decode(reader, m.getCountry()));
        reader = rootReader.newObjectReader("countryCode");
        m.setCountryCode(decoder0.decode(reader, m.getCountryCode()));
        reader = rootReader.newObjectReader("county");
        m.setCounty(decoder0.decode(reader, m.getCounty()));
        reader = rootReader.newObjectReader("countyCode");
        m.setCountyCode(decoder0.decode(reader, m.getCountyCode()));
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("lastModificationDate");
        m.setLastModificationDate(decoder0.decode(reader, m.getLastModificationDate()));
        reader = rootReader.newObjectReader("phoneNumbers");
        reader = rootReader.newObjectReader("postCode");
        m.setPostCode(decoder0.decode(reader, m.getPostCode()));
        reader = rootReader.newObjectReader("prefferedAddress");
        m.setPrefferedAddress(decoder0.decode(reader, m.isPrefferedAddress()));
        return m;
    }
}