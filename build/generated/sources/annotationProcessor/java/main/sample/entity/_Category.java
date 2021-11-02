package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T17:19:35.792+0000")
public final class _Category extends org.seasar.doma.jdbc.entity.AbstractEntityType<sample.entity.Category> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _Category __singleton = new _Category();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Category>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Category, ?>> __embeddedPropertyTypeMap;

    private _Category() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Category";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __list = new java.util.ArrayList<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __map = new java.util.LinkedHashMap<>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Category, ?>> __embeddedMap = new java.util.LinkedHashMap<>(3);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Category, ?>> __embeddedMap) {
        __map.put("categoryId", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.Category, java.lang.String, java.lang.String>(sample.entity.Category.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "categoryId", "CATID", __namingType, false));
        __map.put("name", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Category, java.lang.String, java.lang.String>(sample.entity.Category.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "name", "", __namingType, true, true, false));
        __map.put("description", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Category, java.lang.String, java.lang.String>(sample.entity.Category.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "description", "DESCN", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __idList) {
        __idList.add(__map.get("categoryId"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> __list) {
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
    public void preInsert(sample.entity.Category entity, org.seasar.doma.jdbc.entity.PreInsertContext<sample.entity.Category> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(sample.entity.Category entity, org.seasar.doma.jdbc.entity.PreUpdateContext<sample.entity.Category> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(sample.entity.Category entity, org.seasar.doma.jdbc.entity.PreDeleteContext<sample.entity.Category> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(sample.entity.Category entity, org.seasar.doma.jdbc.entity.PostInsertContext<sample.entity.Category> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(sample.entity.Category entity, org.seasar.doma.jdbc.entity.PostUpdateContext<sample.entity.Category> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(sample.entity.Category entity, org.seasar.doma.jdbc.entity.PostDeleteContext<sample.entity.Category> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Category, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Category, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Category, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Category, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Category, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Category, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Category, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public sample.entity.Category newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<sample.entity.Category, ?>> __args) {
        sample.entity.Category entity = new sample.entity.Category();
        if (__args.get("categoryId") != null) __args.get("categoryId").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("description") != null) __args.get("description").save(entity);
        return entity;
    }

    @Override
    public Class<sample.entity.Category> getEntityClass() {
        return sample.entity.Category.class;
    }

    @Override
    public sample.entity.Category getOriginalStates(sample.entity.Category __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(sample.entity.Category __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Category getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Category newInstance() {
        return new _Category();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Category> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
