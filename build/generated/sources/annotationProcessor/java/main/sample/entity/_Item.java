package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T17:19:35.755+0000")
public final class _Item extends org.seasar.doma.jdbc.entity.AbstractEntityType<sample.entity.Item> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _Item __singleton = new _Item();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Item>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Item, ?>> __embeddedPropertyTypeMap;

    private _Item() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Item";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __list = new java.util.ArrayList<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __map = new java.util.LinkedHashMap<>(11);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Item, ?>> __embeddedMap = new java.util.LinkedHashMap<>(11);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Item, ?>> __embeddedMap) {
        __map.put("itemId", new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "itemId", "", __namingType, false));
        __map.put("productId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "productId", "PRODUCTID", __namingType, true, true, false));
        __map.put("listPrice", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.math.BigDecimal, sample.entity.Amount>(sample.entity.Item.class, sample.entity._Amount.getSingletonInternal()::createScalar, "listPrice", "", __namingType, true, true, false));
        __map.put("unitCost", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.math.BigDecimal, java.math.BigDecimal>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.BigDecimalWrapper()), "unitCost", "", __namingType, true, true, false));
        __map.put("supplierId", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.Integer, java.lang.Integer>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.PrimitiveIntWrapper()), "supplierId", "SUPPLIER", __namingType, true, true, false));
        __map.put("status", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "status", "", __namingType, true, true, false));
        __map.put("attribute1", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "attribute1", "ATTR1", __namingType, true, true, false));
        __map.put("attribute2", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "attribute2", "ATTR2", __namingType, true, true, false));
        __map.put("attribute3", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "attribute3", "ATTR3", __namingType, true, true, false));
        __map.put("attribute4", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "attribute4", "ATTR4", __namingType, true, true, false));
        __map.put("attribute5", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Item, java.lang.String, java.lang.String>(sample.entity.Item.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "attribute5", "ATTR5", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __idList) {
        __idList.add(__map.get("itemId"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> __list) {
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
    public void preInsert(sample.entity.Item entity, org.seasar.doma.jdbc.entity.PreInsertContext<sample.entity.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(sample.entity.Item entity, org.seasar.doma.jdbc.entity.PreUpdateContext<sample.entity.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(sample.entity.Item entity, org.seasar.doma.jdbc.entity.PreDeleteContext<sample.entity.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(sample.entity.Item entity, org.seasar.doma.jdbc.entity.PostInsertContext<sample.entity.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(sample.entity.Item entity, org.seasar.doma.jdbc.entity.PostUpdateContext<sample.entity.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(sample.entity.Item entity, org.seasar.doma.jdbc.entity.PostDeleteContext<sample.entity.Item> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Item, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Item, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Item, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Item, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Item, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Item, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Item, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public sample.entity.Item newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<sample.entity.Item, ?>> __args) {
        sample.entity.Item entity = new sample.entity.Item();
        if (__args.get("itemId") != null) __args.get("itemId").save(entity);
        if (__args.get("productId") != null) __args.get("productId").save(entity);
        if (__args.get("listPrice") != null) __args.get("listPrice").save(entity);
        if (__args.get("unitCost") != null) __args.get("unitCost").save(entity);
        if (__args.get("supplierId") != null) __args.get("supplierId").save(entity);
        if (__args.get("status") != null) __args.get("status").save(entity);
        if (__args.get("attribute1") != null) __args.get("attribute1").save(entity);
        if (__args.get("attribute2") != null) __args.get("attribute2").save(entity);
        if (__args.get("attribute3") != null) __args.get("attribute3").save(entity);
        if (__args.get("attribute4") != null) __args.get("attribute4").save(entity);
        if (__args.get("attribute5") != null) __args.get("attribute5").save(entity);
        return entity;
    }

    @Override
    public Class<sample.entity.Item> getEntityClass() {
        return sample.entity.Item.class;
    }

    @Override
    public sample.entity.Item getOriginalStates(sample.entity.Item __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(sample.entity.Item __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Item getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Item newInstance() {
        return new _Item();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Item> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
