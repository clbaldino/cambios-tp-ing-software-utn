package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T17:19:35.945+0000")
public final class Order_ implements org.seasar.doma.jdbc.criteria.metamodel.EntityMetamodel<sample.entity.Order> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private final String __qualifiedTableName;

    private final sample.entity._Order __entityType = sample.entity._Order.getSingletonInternal();

    private final java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __allPropertyMetamodels;

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.Integer> orderId = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.Integer>(java.lang.Integer.class, __entityType, "orderId");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> username = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "username");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.time.LocalDateTime> orderDate = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.time.LocalDateTime>(java.time.LocalDateTime.class, __entityType, "orderDate");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipAddress1 = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipAddress1");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipAddress2 = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipAddress2");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipCity = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipCity");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipState = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipState");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipZip = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipZip");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipCountry = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipCountry");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billAddress1 = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billAddress1");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billAddress2 = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billAddress2");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billCity = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billCity");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billState = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billState");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billZip = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billZip");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billCountry = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billCountry");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> courier = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "courier");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<sample.entity.Amount> totalPrice = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<sample.entity.Amount>(sample.entity.Amount.class, __entityType, "totalPrice");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billToFirstName = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billToFirstName");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> billToLastName = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "billToLastName");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipToFirstName = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipToFirstName");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> shipToLastName = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "shipToLastName");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> creditCard = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "creditCard");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> expiryDate = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "expiryDate");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> cardType = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "cardType");

    public final org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<java.lang.String> locale = new org.seasar.doma.jdbc.criteria.metamodel.DefaultPropertyMetamodel<java.lang.String>(java.lang.String.class, __entityType, "locale");

    public Order_() {
        this("");
    }

    public Order_(String qualifiedTableName) {
        this.__qualifiedTableName = java.util.Objects.requireNonNull(qualifiedTableName);
        java.util.ArrayList<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> __list = new java.util.ArrayList<>(25);
        __list.add(orderId);
        __list.add(username);
        __list.add(orderDate);
        __list.add(shipAddress1);
        __list.add(shipAddress2);
        __list.add(shipCity);
        __list.add(shipState);
        __list.add(shipZip);
        __list.add(shipCountry);
        __list.add(billAddress1);
        __list.add(billAddress2);
        __list.add(billCity);
        __list.add(billState);
        __list.add(billZip);
        __list.add(billCountry);
        __list.add(courier);
        __list.add(totalPrice);
        __list.add(billToFirstName);
        __list.add(billToLastName);
        __list.add(shipToFirstName);
        __list.add(shipToLastName);
        __list.add(creditCard);
        __list.add(expiryDate);
        __list.add(cardType);
        __list.add(locale);
        __allPropertyMetamodels = java.util.Collections.unmodifiableList(__list);
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityType<sample.entity.Order> asType() {
        return __qualifiedTableName.isEmpty() ? __entityType : new org.seasar.doma.jdbc.criteria.metamodel.EntityTypeProxy<>(__entityType, __qualifiedTableName);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.criteria.metamodel.PropertyMetamodel<?>> allPropertyMetamodels() {
        return __allPropertyMetamodels;
    }

}
