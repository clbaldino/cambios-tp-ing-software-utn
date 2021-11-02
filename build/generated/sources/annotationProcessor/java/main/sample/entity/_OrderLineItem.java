package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T14:40:27.922+0000")
public final class _OrderLineItem extends org.seasar.doma.jdbc.entity.AbstractEntityType<sample.entity.OrderLineItem> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _OrderLineItem __singleton = new _OrderLineItem();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.OrderLineItem>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.OrderLineItem, ?>> __embeddedPropertyTypeMap;

    private _OrderLineItem() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "OrderLineItem";
        __catalogName = "";
        __schemaName = "";
        __tableName = "LINEITEM";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __map = new java.util.LinkedHashMap<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.OrderLineItem, ?>> __embeddedMap = new java.util.LinkedHashMap<>(5);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.OrderLineItem, ?>> __embeddedMap) {
        __map.put("orderId", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.OrderLineItem, java.lang.Integer, java.lang.Integer>(sample.entity.OrderLineItem.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "orderId", "", __namingType, false));
        __map.put("lineNumber", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.OrderLineItem, java.lang.Integer, java.lang.Integer>(sample.entity.OrderLineItem.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.PrimitiveIntWrapper()), "lineNumber", "LINENUM", __namingType, false));
        __map.put("quantity", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.OrderLineItem, java.lang.Integer, java.lang.Integer>(sample.entity.OrderLineItem.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.PrimitiveIntWrapper()), "quantity", "", __namingType, true, true, false));
        __map.put("itemId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.OrderLineItem, java.lang.String, java.lang.String>(sample.entity.OrderLineItem.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "itemId", "", __namingType, true, true, false));
        __map.put("unitPrice", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.OrderLineItem, java.math.BigDecimal, sample.entity.Amount>(sample.entity.OrderLineItem.class, sample.entity._Amount.getSingletonInternal()::createScalar, "unitPrice", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __idList) {
        __idList.add(__map.get("orderId"));
        __idList.add(__map.get("lineNumber"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> __list) {
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
    public void preInsert(sample.entity.OrderLineItem entity, org.seasar.doma.jdbc.entity.PreInsertContext<sample.entity.OrderLineItem> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(sample.entity.OrderLineItem entity, org.seasar.doma.jdbc.entity.PreUpdateContext<sample.entity.OrderLineItem> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(sample.entity.OrderLineItem entity, org.seasar.doma.jdbc.entity.PreDeleteContext<sample.entity.OrderLineItem> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(sample.entity.OrderLineItem entity, org.seasar.doma.jdbc.entity.PostInsertContext<sample.entity.OrderLineItem> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(sample.entity.OrderLineItem entity, org.seasar.doma.jdbc.entity.PostUpdateContext<sample.entity.OrderLineItem> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(sample.entity.OrderLineItem entity, org.seasar.doma.jdbc.entity.PostDeleteContext<sample.entity.OrderLineItem> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.OrderLineItem, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.OrderLineItem, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.OrderLineItem, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.OrderLineItem, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.OrderLineItem, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.OrderLineItem, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.OrderLineItem, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public sample.entity.OrderLineItem newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<sample.entity.OrderLineItem, ?>> __args) {
        sample.entity.OrderLineItem entity = new sample.entity.OrderLineItem();
        if (__args.get("orderId") != null) __args.get("orderId").save(entity);
        if (__args.get("lineNumber") != null) __args.get("lineNumber").save(entity);
        if (__args.get("quantity") != null) __args.get("quantity").save(entity);
        if (__args.get("itemId") != null) __args.get("itemId").save(entity);
        if (__args.get("unitPrice") != null) __args.get("unitPrice").save(entity);
        return entity;
    }

    @Override
    public Class<sample.entity.OrderLineItem> getEntityClass() {
        return sample.entity.OrderLineItem.class;
    }

    @Override
    public sample.entity.OrderLineItem getOriginalStates(sample.entity.OrderLineItem __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(sample.entity.OrderLineItem __entity) {
    }

    /**
     * @return the singleton
     */
    public static _OrderLineItem getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _OrderLineItem newInstance() {
        return new _OrderLineItem();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.OrderLineItem> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
