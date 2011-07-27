package biz.storebiz.db.entity.customer;

//@javax.annotation.Generated(value = { "slim3-gen", "@VERSION@" }, date = "2011-07-27 20:55:10")
/** */
public final class CustomerMeta extends org.slim3.datastore.ModelMeta<biz.storebiz.db.entity.customer.Customer> {

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date> creationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date>(this, "creationDate", "creationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.customer.Customer> customerId = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.customer.Customer>(this, "customerId", "customerId");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, com.google.appengine.api.datastore.Key> customerKey = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, com.google.appengine.api.datastore.Key>(this, "__key__", "customerKey", com.google.appengine.api.datastore.Key.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date> customerLastModificationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date>(this, "customerLastModificationDate", "customerLastModificationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date> customerRegistrationDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date>(this, "customerRegistrationDate", "customerRegistrationDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date> customerRegistrationExpiryDate = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.Date>(this, "customerRegistrationExpiryDate", "customerRegistrationExpiryDate", java.util.Date.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.customer.Customer> customerType = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.customer.Customer>(this, "customerType", "customerType");

    /** */
    public final org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, com.google.appengine.api.datastore.Email> email = new org.slim3.datastore.CoreAttributeMeta<biz.storebiz.db.entity.customer.Customer, com.google.appengine.api.datastore.Email>(this, "email", "email", com.google.appengine.api.datastore.Email.class);

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.customer.Customer, biz.storebiz.db.entity.customer.EmailPreference> emailPreference = new org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.customer.Customer, biz.storebiz.db.entity.customer.EmailPreference>(this, "emailPreference", "emailPreference", biz.storebiz.db.entity.customer.EmailPreference.class);

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.customer.Customer, biz.storebiz.db.entity.customer.EmailSubscription> emailSubscription = new org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.customer.Customer, biz.storebiz.db.entity.customer.EmailSubscription>(this, "emailSubscription", "emailSubscription", biz.storebiz.db.entity.customer.EmailSubscription.class);

    /** */
    public final org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.customer.Customer> name = new org.slim3.datastore.StringAttributeMeta<biz.storebiz.db.entity.customer.Customer>(this, "name", "name");

    /** */
    public final org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.customer.Customer, biz.storebiz.db.entity.customer.Password> password = new org.slim3.datastore.UnindexedAttributeMeta<biz.storebiz.db.entity.customer.Customer, biz.storebiz.db.entity.customer.Password>(this, "password", "password", biz.storebiz.db.entity.customer.Password.class);

    /** */
    public final org.slim3.datastore.CollectionAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key> postalAddresses = new org.slim3.datastore.CollectionAttributeMeta<biz.storebiz.db.entity.customer.Customer, java.util.List<com.google.appengine.api.datastore.Key>, com.google.appengine.api.datastore.Key>(this, "postalAddresses", "postalAddresses", java.util.List.class);

    private static final org.slim3.datastore.CreationDate slim3_creationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final org.slim3.datastore.ModificationDate slim3_customerLastModificationDateAttributeListener = new org.slim3.datastore.ModificationDate();

    private static final org.slim3.datastore.CreationDate slim3_customerRegistrationDateAttributeListener = new org.slim3.datastore.CreationDate();

    private static final CustomerMeta slim3_singleton = new CustomerMeta();

    /**
     * @return the singleton
     */
    public static CustomerMeta get() {
       return slim3_singleton;
    }

    /** */
    public CustomerMeta() {
        super("Customer", biz.storebiz.db.entity.customer.Customer.class);
    }

    @Override
    public biz.storebiz.db.entity.customer.Customer entityToModel(com.google.appengine.api.datastore.Entity entity) {
        biz.storebiz.db.entity.customer.Customer model = new biz.storebiz.db.entity.customer.Customer();
        model.setCreationDate((java.util.Date) entity.getProperty("creationDate"));
        model.setCustomerId((java.lang.String) entity.getProperty("customerId"));
        model.setCustomerKey(entity.getKey());
        model.setCustomerLastModificationDate((java.util.Date) entity.getProperty("customerLastModificationDate"));
        model.setCustomerRegistrationDate((java.util.Date) entity.getProperty("customerRegistrationDate"));
        model.setCustomerRegistrationExpiryDate((java.util.Date) entity.getProperty("customerRegistrationExpiryDate"));
        model.setCustomerType((java.lang.String) entity.getProperty("customerType"));
        model.setEmail((com.google.appengine.api.datastore.Email) entity.getProperty("email"));
        biz.storebiz.db.entity.customer.EmailPreference _emailPreference = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("emailPreference"));
        model.setEmailPreference(_emailPreference);
        biz.storebiz.db.entity.customer.EmailSubscription _emailSubscription = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("emailSubscription"));
        model.setEmailSubscription(_emailSubscription);
        model.setName((java.lang.String) entity.getProperty("name"));
        biz.storebiz.db.entity.customer.Password _password = blobToSerializable((com.google.appengine.api.datastore.Blob) entity.getProperty("password"));
        model.setPassword(_password);
        model.setPostalAddresses(toList(com.google.appengine.api.datastore.Key.class, entity.getProperty("postalAddresses")));
        return model;
    }

    @Override
    public com.google.appengine.api.datastore.Entity modelToEntity(java.lang.Object model) {
        biz.storebiz.db.entity.customer.Customer m = (biz.storebiz.db.entity.customer.Customer) model;
        com.google.appengine.api.datastore.Entity entity = null;
        if (m.getCustomerKey() != null) {
            entity = new com.google.appengine.api.datastore.Entity(m.getCustomerKey());
        } else {
            entity = new com.google.appengine.api.datastore.Entity(kind);
        }
        entity.setProperty("creationDate", m.getCreationDate());
        entity.setProperty("customerId", m.getCustomerId());
        entity.setProperty("customerLastModificationDate", m.getCustomerLastModificationDate());
        entity.setProperty("customerRegistrationDate", m.getCustomerRegistrationDate());
        entity.setProperty("customerRegistrationExpiryDate", m.getCustomerRegistrationExpiryDate());
        entity.setProperty("customerType", m.getCustomerType());
        entity.setProperty("email", m.getEmail());
        entity.setUnindexedProperty("emailPreference", serializableToBlob(m.getEmailPreference()));
        entity.setUnindexedProperty("emailSubscription", serializableToBlob(m.getEmailSubscription()));
        entity.setProperty("name", m.getName());
        entity.setUnindexedProperty("password", serializableToBlob(m.getPassword()));
        entity.setProperty("postalAddresses", m.getPostalAddresses());
        return entity;
    }

    @Override
    protected com.google.appengine.api.datastore.Key getKey(Object model) {
        biz.storebiz.db.entity.customer.Customer m = (biz.storebiz.db.entity.customer.Customer) model;
        return m.getCustomerKey();
    }

    @Override
    protected void setKey(Object model, com.google.appengine.api.datastore.Key key) {
        validateKey(key);
        biz.storebiz.db.entity.customer.Customer m = (biz.storebiz.db.entity.customer.Customer) model;
        m.setCustomerKey(key);
    }

    @Override
    protected long getVersion(Object model) {
        throw new IllegalStateException("The version property of the model(biz.storebiz.db.entity.customer.Customer) is not defined.");
    }

    @Override
    protected void assignKeyToModelRefIfNecessary(com.google.appengine.api.datastore.AsyncDatastoreService ds, java.lang.Object model) {
    }

    @Override
    protected void incrementVersion(Object model) {
    }

    @Override
    protected void prePut(Object model) {
        biz.storebiz.db.entity.customer.Customer m = (biz.storebiz.db.entity.customer.Customer) model;
        m.setCreationDate(slim3_creationDateAttributeListener.prePut(m.getCreationDate()));
        m.setCustomerLastModificationDate(slim3_customerLastModificationDateAttributeListener.prePut(m.getCustomerLastModificationDate()));
        m.setCustomerRegistrationDate(slim3_customerRegistrationDateAttributeListener.prePut(m.getCustomerRegistrationDate()));
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
        biz.storebiz.db.entity.customer.Customer m = (biz.storebiz.db.entity.customer.Customer) model;
        writer.beginObject();
        org.slim3.datastore.json.Default encoder0 = new org.slim3.datastore.json.Default();
        if(m.getCreationDate() != null){
            writer.setNextPropertyName("creationDate");
            encoder0.encode(writer, m.getCreationDate());
        }
        if(m.getCustomerId() != null){
            writer.setNextPropertyName("customerId");
            encoder0.encode(writer, m.getCustomerId());
        }
        if(m.getCustomerKey() != null){
            writer.setNextPropertyName("customerKey");
            encoder0.encode(writer, m.getCustomerKey());
        }
        if(m.getCustomerLastModificationDate() != null){
            writer.setNextPropertyName("customerLastModificationDate");
            encoder0.encode(writer, m.getCustomerLastModificationDate());
        }
        if(m.getCustomerRegistrationDate() != null){
            writer.setNextPropertyName("customerRegistrationDate");
            encoder0.encode(writer, m.getCustomerRegistrationDate());
        }
        if(m.getCustomerRegistrationExpiryDate() != null){
            writer.setNextPropertyName("customerRegistrationExpiryDate");
            encoder0.encode(writer, m.getCustomerRegistrationExpiryDate());
        }
        if(m.getCustomerType() != null){
            writer.setNextPropertyName("customerType");
            encoder0.encode(writer, m.getCustomerType());
        }
        if(m.getEmail() != null){
            writer.setNextPropertyName("email");
            encoder0.encode(writer, m.getEmail());
        }
        if(m.getEmailPreference() != null){
            writer.setNextPropertyName("emailPreference");
            encoder0.encode(writer, m.getEmailPreference());
        }
        if(m.getEmailSubscription() != null){
            writer.setNextPropertyName("emailSubscription");
            encoder0.encode(writer, m.getEmailSubscription());
        }
        if(m.getName() != null){
            writer.setNextPropertyName("name");
            encoder0.encode(writer, m.getName());
        }
        if(m.getPassword() != null){
            writer.setNextPropertyName("password");
            encoder0.encode(writer, m.getPassword());
        }
        if(m.getPostalAddresses() != null){
            writer.setNextPropertyName("postalAddresses");
            writer.beginArray();
            for(com.google.appengine.api.datastore.Key v : m.getPostalAddresses()){
                encoder0.encode(writer, v);
            }
            writer.endArray();
        }
        writer.endObject();
    }

    @Override
    protected biz.storebiz.db.entity.customer.Customer jsonToModel(org.slim3.datastore.json.JsonRootReader rootReader, int maxDepth, int currentDepth) {
        biz.storebiz.db.entity.customer.Customer m = new biz.storebiz.db.entity.customer.Customer();
        org.slim3.datastore.json.JsonReader reader = null;
        org.slim3.datastore.json.Default decoder0 = new org.slim3.datastore.json.Default();
        reader = rootReader.newObjectReader("creationDate");
        m.setCreationDate(decoder0.decode(reader, m.getCreationDate()));
        reader = rootReader.newObjectReader("customerId");
        m.setCustomerId(decoder0.decode(reader, m.getCustomerId()));
        reader = rootReader.newObjectReader("customerKey");
        m.setCustomerKey(decoder0.decode(reader, m.getCustomerKey()));
        reader = rootReader.newObjectReader("customerLastModificationDate");
        m.setCustomerLastModificationDate(decoder0.decode(reader, m.getCustomerLastModificationDate()));
        reader = rootReader.newObjectReader("customerRegistrationDate");
        m.setCustomerRegistrationDate(decoder0.decode(reader, m.getCustomerRegistrationDate()));
        reader = rootReader.newObjectReader("customerRegistrationExpiryDate");
        m.setCustomerRegistrationExpiryDate(decoder0.decode(reader, m.getCustomerRegistrationExpiryDate()));
        reader = rootReader.newObjectReader("customerType");
        m.setCustomerType(decoder0.decode(reader, m.getCustomerType()));
        reader = rootReader.newObjectReader("email");
        m.setEmail(decoder0.decode(reader, m.getEmail()));
        reader = rootReader.newObjectReader("emailPreference");
        m.setEmailPreference(decoder0.decode(reader, m.getEmailPreference(), biz.storebiz.db.entity.customer.EmailPreference.class));
        reader = rootReader.newObjectReader("emailSubscription");
        m.setEmailSubscription(decoder0.decode(reader, m.getEmailSubscription(), biz.storebiz.db.entity.customer.EmailSubscription.class));
        reader = rootReader.newObjectReader("name");
        m.setName(decoder0.decode(reader, m.getName()));
        reader = rootReader.newObjectReader("password");
        m.setPassword(decoder0.decode(reader, m.getPassword(), biz.storebiz.db.entity.customer.Password.class));
        reader = rootReader.newObjectReader("postalAddresses");
        {
            java.util.ArrayList<com.google.appengine.api.datastore.Key> elements = new java.util.ArrayList<com.google.appengine.api.datastore.Key>();
            org.slim3.datastore.json.JsonArrayReader r = rootReader.newArrayReader("postalAddresses");
            if(r != null){
                reader = r;
                int n = r.length();
                for(int i = 0; i < n; i++){
                    r.setIndex(i);
                    com.google.appengine.api.datastore.Key v = decoder0.decode(reader, (com.google.appengine.api.datastore.Key)null)                    ;
                    if(v != null){
                        elements.add(v);
                    }
                }
                m.setPostalAddresses(elements);
            }
        }
        return m;
    }
}