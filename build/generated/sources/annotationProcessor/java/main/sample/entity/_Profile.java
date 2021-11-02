package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T14:40:27.990+0000")
public final class _Profile extends org.seasar.doma.jdbc.entity.AbstractEntityType<sample.entity.Profile> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _Profile __singleton = new _Profile();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Profile>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Profile, ?>> __embeddedPropertyTypeMap;

    private _Profile() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Profile";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __map = new java.util.LinkedHashMap<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Profile, ?>> __embeddedMap = new java.util.LinkedHashMap<>(5);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Profile, ?>> __embeddedMap) {
        __map.put("username", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.Profile, java.lang.String, java.lang.String>(sample.entity.Profile.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "username", "USERID", __namingType, false));
        __map.put("favouriteCategoryId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Profile, java.lang.String, java.lang.String>(sample.entity.Profile.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "favouriteCategoryId", "FAVCATEGORY", __namingType, true, true, false));
        __map.put("languagePreference", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Profile, java.lang.String, java.lang.String>(sample.entity.Profile.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "languagePreference", "LANGPREF", __namingType, true, true, false));
        __map.put("listOption", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Profile, java.lang.Boolean, java.lang.Boolean>(sample.entity.Profile.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.PrimitiveBooleanWrapper()), "listOption", "MYLISTOPT", __namingType, true, true, false));
        __map.put("bannerOption", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Profile, java.lang.Boolean, java.lang.Boolean>(sample.entity.Profile.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.PrimitiveBooleanWrapper()), "bannerOption", "BANNEROPT", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __idList) {
        __idList.add(__map.get("username"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> __list) {
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
    public void preInsert(sample.entity.Profile entity, org.seasar.doma.jdbc.entity.PreInsertContext<sample.entity.Profile> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(sample.entity.Profile entity, org.seasar.doma.jdbc.entity.PreUpdateContext<sample.entity.Profile> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(sample.entity.Profile entity, org.seasar.doma.jdbc.entity.PreDeleteContext<sample.entity.Profile> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(sample.entity.Profile entity, org.seasar.doma.jdbc.entity.PostInsertContext<sample.entity.Profile> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(sample.entity.Profile entity, org.seasar.doma.jdbc.entity.PostUpdateContext<sample.entity.Profile> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(sample.entity.Profile entity, org.seasar.doma.jdbc.entity.PostDeleteContext<sample.entity.Profile> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Profile, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Profile, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Profile, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Profile, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Profile, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Profile, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Profile, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public sample.entity.Profile newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<sample.entity.Profile, ?>> __args) {
        sample.entity.Profile entity = new sample.entity.Profile();
        if (__args.get("username") != null) __args.get("username").save(entity);
        if (__args.get("favouriteCategoryId") != null) __args.get("favouriteCategoryId").save(entity);
        if (__args.get("languagePreference") != null) __args.get("languagePreference").save(entity);
        if (__args.get("listOption") != null) __args.get("listOption").save(entity);
        if (__args.get("bannerOption") != null) __args.get("bannerOption").save(entity);
        return entity;
    }

    @Override
    public Class<sample.entity.Profile> getEntityClass() {
        return sample.entity.Profile.class;
    }

    @Override
    public sample.entity.Profile getOriginalStates(sample.entity.Profile __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(sample.entity.Profile __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Profile getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Profile newInstance() {
        return new _Profile();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Profile> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
