package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T18:20:53.184-0300")
public final class _Account extends org.seasar.doma.jdbc.entity.AbstractEntityType<sample.entity.Account> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _Account __singleton = new _Account();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Account>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Account, ?>> __embeddedPropertyTypeMap;

    private _Account() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Account";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __list = new java.util.ArrayList<>(12);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __map = new java.util.LinkedHashMap<>(12);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Account, ?>> __embeddedMap = new java.util.LinkedHashMap<>(12);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Account, ?>> __embeddedMap) {
        __map.put("username", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "username", "USERID", __namingType, false));
        __map.put("email", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "email", "", __namingType, true, true, false));
        __map.put("firstName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "firstName", "", __namingType, true, true, false));
        __map.put("lastName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "lastName", "", __namingType, true, true, false));
        __map.put("status", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "status", "", __namingType, true, true, false));
        __map.put("address1", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "address1", "ADDR1", __namingType, true, true, false));
        __map.put("address2", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "address2", "ADDR2", __namingType, true, true, false));
        __map.put("city", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "city", "", __namingType, true, true, false));
        __map.put("state", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "state", "", __namingType, true, true, false));
        __map.put("zip", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "zip", "", __namingType, true, true, false));
        __map.put("country", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "country", "", __namingType, true, true, false));
        __map.put("phone", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Account, java.lang.String, java.lang.String>(sample.entity.Account.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "phone", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __idList) {
        __idList.add(__map.get("username"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> __list) {
        __list.addAll(__map.values());
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(sample.entity.Account entity, org.seasar.doma.jdbc.entity.PreInsertContext<sample.entity.Account> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(sample.entity.Account entity, org.seasar.doma.jdbc.entity.PreUpdateContext<sample.entity.Account> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(sample.entity.Account entity, org.seasar.doma.jdbc.entity.PreDeleteContext<sample.entity.Account> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(sample.entity.Account entity, org.seasar.doma.jdbc.entity.PostInsertContext<sample.entity.Account> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(sample.entity.Account entity, org.seasar.doma.jdbc.entity.PostUpdateContext<sample.entity.Account> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(sample.entity.Account entity, org.seasar.doma.jdbc.entity.PostDeleteContext<sample.entity.Account> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Account, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Account, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Account, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Account, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Account, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Account, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Account, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public sample.entity.Account newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<sample.entity.Account, ?>> __args) {
        sample.entity.Account entity = new sample.entity.Account();
        if (__args.get("username") != null) __args.get("username").save(entity);
        if (__args.get("email") != null) __args.get("email").save(entity);
        if (__args.get("firstName") != null) __args.get("firstName").save(entity);
        if (__args.get("lastName") != null) __args.get("lastName").save(entity);
        if (__args.get("status") != null) __args.get("status").save(entity);
        if (__args.get("address1") != null) __args.get("address1").save(entity);
        if (__args.get("address2") != null) __args.get("address2").save(entity);
        if (__args.get("city") != null) __args.get("city").save(entity);
        if (__args.get("state") != null) __args.get("state").save(entity);
        if (__args.get("zip") != null) __args.get("zip").save(entity);
        if (__args.get("country") != null) __args.get("country").save(entity);
        if (__args.get("phone") != null) __args.get("phone").save(entity);
        return entity;
    }

    @Override
    public Class<sample.entity.Account> getEntityClass() {
        return sample.entity.Account.class;
    }

    @Override
    public sample.entity.Account getOriginalStates(sample.entity.Account __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(sample.entity.Account __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Account getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Account newInstance() {
        return new _Account();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Account> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
