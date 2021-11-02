package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T17:19:35.930+0000")
public final class _Order extends org.seasar.doma.jdbc.entity.AbstractEntityType<sample.entity.Order> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _Order __singleton = new _Order();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("ORDERS_SEQ");
        __idGenerator.setInitialValue(1001);
        __idGenerator.setAllocationSize(10);
        __idGenerator.initialize();
    }

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Order>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __entityPropertyTypeMap;

    @SuppressWarnings("unused")
    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Order, ?>> __embeddedPropertyTypeMap;

    private _Order() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Order";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ORDERS";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __list = new java.util.ArrayList<>(25);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __map = new java.util.LinkedHashMap<>(25);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Order, ?>> __embeddedMap = new java.util.LinkedHashMap<>(25);
        initializeMaps(__map, __embeddedMap);
        initializeIdList(__map, __idList);
        initializeList(__map, __list);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
        __embeddedPropertyTypeMap = java.util.Collections.unmodifiableMap(__embeddedMap);
    }

    private void initializeMaps(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __map, java.util.Map<String, org.seasar.doma.jdbc.entity.EmbeddedPropertyType<sample.entity.Order, ?>> __embeddedMap) {
        __map.put("orderId", new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Order, java.lang.Integer, java.lang.Integer>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.IntegerWrapper()), "orderId", "", __namingType, false, __idGenerator));
        __map.put("username", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "username", "USERID", __namingType, true, true, false));
        __map.put("orderDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.time.LocalDateTime, java.time.LocalDateTime>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.LocalDateTimeWrapper()), "orderDate", "", __namingType, true, true, false));
        __map.put("shipAddress1", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipAddress1", "SHIPADDR1", __namingType, true, true, false));
        __map.put("shipAddress2", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipAddress2", "SHIPADDR2", __namingType, true, true, false));
        __map.put("shipCity", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipCity", "", __namingType, true, true, false));
        __map.put("shipState", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipState", "", __namingType, true, true, false));
        __map.put("shipZip", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipZip", "", __namingType, true, true, false));
        __map.put("shipCountry", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipCountry", "", __namingType, true, true, false));
        __map.put("billAddress1", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billAddress1", "BILLADDR1", __namingType, true, true, false));
        __map.put("billAddress2", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billAddress2", "BILLADDR2", __namingType, true, true, false));
        __map.put("billCity", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billCity", "", __namingType, true, true, false));
        __map.put("billState", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billState", "", __namingType, true, true, false));
        __map.put("billZip", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billZip", "", __namingType, true, true, false));
        __map.put("billCountry", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billCountry", "", __namingType, true, true, false));
        __map.put("courier", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "courier", "", __namingType, true, true, false));
        __map.put("totalPrice", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.math.BigDecimal, sample.entity.Amount>(sample.entity.Order.class, sample.entity._Amount.getSingletonInternal()::createScalar, "totalPrice", "", __namingType, true, true, false));
        __map.put("billToFirstName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billToFirstName", "", __namingType, true, true, false));
        __map.put("billToLastName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "billToLastName", "", __namingType, true, true, false));
        __map.put("shipToFirstName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipToFirstName", "", __namingType, true, true, false));
        __map.put("shipToLastName", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "shipToLastName", "", __namingType, true, true, false));
        __map.put("creditCard", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "creditCard", "", __namingType, true, true, false));
        __map.put("expiryDate", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "expiryDate", "EXPRDATE", __namingType, true, true, false));
        __map.put("cardType", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "cardType", "", __namingType, true, true, false));
        __map.put("locale", new org.seasar.doma.jdbc.entity.DefaultPropertyType<sample.entity.Order, java.lang.String, java.lang.String>(sample.entity.Order.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(new org.seasar.doma.wrapper.StringWrapper()), "locale", "", __namingType, true, true, false));
    }

    private void initializeIdList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __idList) {
        __idList.add(__map.get("orderId"));
    }

    private void initializeList(java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __map, java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> __list) {
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
    public void preInsert(sample.entity.Order entity, org.seasar.doma.jdbc.entity.PreInsertContext<sample.entity.Order> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(sample.entity.Order entity, org.seasar.doma.jdbc.entity.PreUpdateContext<sample.entity.Order> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(sample.entity.Order entity, org.seasar.doma.jdbc.entity.PreDeleteContext<sample.entity.Order> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(sample.entity.Order entity, org.seasar.doma.jdbc.entity.PostInsertContext<sample.entity.Order> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(sample.entity.Order entity, org.seasar.doma.jdbc.entity.PostUpdateContext<sample.entity.Order> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(sample.entity.Order entity, org.seasar.doma.jdbc.entity.PostDeleteContext<sample.entity.Order> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<sample.entity.Order, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Order, ?, ?> getGeneratedIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<sample.entity.Order, ?, ?>)__entityPropertyTypeMap.get("orderId");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Order, ?, ?> getVersionPropertyType() {
        return (org.seasar.doma.jdbc.entity.VersionPropertyType<sample.entity.Order, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @SuppressWarnings("unchecked")
    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Order, ?, ?> getTenantIdPropertyType() {
        return (org.seasar.doma.jdbc.entity.TenantIdPropertyType<sample.entity.Order, ?, ?>)__entityPropertyTypeMap.get("null");
    }

    @Override
    public sample.entity.Order newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<sample.entity.Order, ?>> __args) {
        sample.entity.Order entity = new sample.entity.Order();
        if (__args.get("orderId") != null) __args.get("orderId").save(entity);
        if (__args.get("username") != null) __args.get("username").save(entity);
        if (__args.get("orderDate") != null) __args.get("orderDate").save(entity);
        if (__args.get("shipAddress1") != null) __args.get("shipAddress1").save(entity);
        if (__args.get("shipAddress2") != null) __args.get("shipAddress2").save(entity);
        if (__args.get("shipCity") != null) __args.get("shipCity").save(entity);
        if (__args.get("shipState") != null) __args.get("shipState").save(entity);
        if (__args.get("shipZip") != null) __args.get("shipZip").save(entity);
        if (__args.get("shipCountry") != null) __args.get("shipCountry").save(entity);
        if (__args.get("billAddress1") != null) __args.get("billAddress1").save(entity);
        if (__args.get("billAddress2") != null) __args.get("billAddress2").save(entity);
        if (__args.get("billCity") != null) __args.get("billCity").save(entity);
        if (__args.get("billState") != null) __args.get("billState").save(entity);
        if (__args.get("billZip") != null) __args.get("billZip").save(entity);
        if (__args.get("billCountry") != null) __args.get("billCountry").save(entity);
        if (__args.get("courier") != null) __args.get("courier").save(entity);
        if (__args.get("totalPrice") != null) __args.get("totalPrice").save(entity);
        if (__args.get("billToFirstName") != null) __args.get("billToFirstName").save(entity);
        if (__args.get("billToLastName") != null) __args.get("billToLastName").save(entity);
        if (__args.get("shipToFirstName") != null) __args.get("shipToFirstName").save(entity);
        if (__args.get("shipToLastName") != null) __args.get("shipToLastName").save(entity);
        if (__args.get("creditCard") != null) __args.get("creditCard").save(entity);
        if (__args.get("expiryDate") != null) __args.get("expiryDate").save(entity);
        if (__args.get("cardType") != null) __args.get("cardType").save(entity);
        if (__args.get("locale") != null) __args.get("locale").save(entity);
        return entity;
    }

    @Override
    public Class<sample.entity.Order> getEntityClass() {
        return sample.entity.Order.class;
    }

    @Override
    public sample.entity.Order getOriginalStates(sample.entity.Order __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(sample.entity.Order __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Order getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Order newInstance() {
        return new _Order();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<sample.entity.Order> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
