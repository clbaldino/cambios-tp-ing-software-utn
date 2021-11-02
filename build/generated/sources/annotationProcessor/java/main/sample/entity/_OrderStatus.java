package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T18:20:53.077-0300")
public final class _OrderStatus extends org.seasar.doma.jdbc.entity.AbstractEntityType<sample.entity.OrderStatus> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _OrderStatus __singleton = new _OrderStatus();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.OrderStatus>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.OrderStatus, ?>> __embeddedPropertyTypeMap;

    private _OrderStatus() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "OrderStatus";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ORDERSTATUS";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __map = new java.util.LinkedHashMap<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.OrderStatus, ?>> __embeddedMap = new java.util.LinkedHashMap<>(4);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.OrderStatus, ?>> __embeddedMap) {
        __map.put("orderId", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.OrderStatus, java.lang.Integer, java.lang.Integer>(sample.entity.OrderStatus.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "orderId", "ORDERID", __namingType, false));
        __map.put("lineNumber", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.OrderStatus, java.lang.Integer, java.lang.Integer>(sample.entity.OrderStatus.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "lineNumber", "LINENUM", __namingType, false));
        __map.put("timestamp", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.OrderStatus, java.time.LocalDate, java.time.LocalDate>(sample.entity.OrderStatus.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateWrapper()), "timestamp", "TIMESTAMP", __namingType, true, true, false));
        __map.put("status", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.OrderStatus, java.lang.String, java.lang.String>(sample.entity.OrderStatus.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "status", "STATUS", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __idList) {
        __idList.add(__map.get("orderId"));
        __idList.add(__map.get("lineNumber"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> __list) {
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
    public void preInsert(sample.entity.OrderStatus entity, org.seasar.doma.jdbc.entity.PreInsertContext<sample.entity.OrderStatus> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(sample.entity.OrderStatus entity, org.seasar.doma.jdbc.entity.PreUpdateContext<sample.entity.OrderStatus> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(sample.entity.OrderStatus entity, org.seasar.doma.jdbc.entity.PreDeleteContext<sample.entity.OrderStatus> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(sample.entity.OrderStatus entity, org.seasar.doma.jdbc.entity.PostInsertContext<sample.entity.OrderStatus> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(sample.entity.OrderStatus entity, org.seasar.doma.jdbc.entity.PostUpdateContext<sample.entity.OrderStatus> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(sample.entity.OrderStatus entity, org.seasar.doma.jdbc.entity.PostDeleteContext<sample.entity.OrderStatus> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderStatus, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.OrderStatus, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.OrderStatus, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.OrderStatus, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.OrderStatus, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.OrderStatus, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.OrderStatus, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public sample.entity.OrderStatus newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<sample.entity.OrderStatus, ?>> __args) {
        sample.entity.OrderStatus entity = new sample.entity.OrderStatus();
        if (__args.get("orderId") != null) __args.get("orderId").save(entity);
        if (__args.get("lineNumber") != null) __args.get("lineNumber").save(entity);
        if (__args.get("timestamp") != null) __args.get("timestamp").save(entity);
        if (__args.get("status") != null) __args.get("status").save(entity);
        return entity;
    }

    @Override
    public Class<sample.entity.OrderStatus> getEntityClass() {
        return sample.entity.OrderStatus.class;
    }

    @Override
    public sample.entity.OrderStatus getOriginalStates(sample.entity.OrderStatus __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(sample.entity.OrderStatus __entity) {
    }

    /**
     * @return the singleton
     */
    public static _OrderStatus getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _OrderStatus newInstance() {
        return new _OrderStatus();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.OrderStatus> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
