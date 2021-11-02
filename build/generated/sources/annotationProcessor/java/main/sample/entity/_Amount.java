package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.36.0-beta-1" }, date = "2021-11-02T14:40:27.631+0000")
public final class _Amount extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.math.BigDecimal, sample.entity.Amount> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.36.0-beta-1");
    }

    private static final _Amount singleton = new _Amount();

    private _Amount() {
        super(org.seasar.doma.wrapper.BigDecimalWrapper::new);
    }

    @Override
    protected sample.entity.Amount newDomain(java.math.BigDecimal value) {
        if (value == null) {
            return null;
        }
        return new sample.entity.Amount(value);
    }

    @Override
    protected java.math.BigDecimal getBasicValue(sample.entity.Amount domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.math.BigDecimal.class;
    }

    @Override
    public Class<sample.entity.Amount> getDomainClass() {
        return sample.entity.Amount.class;
    }

    /**
     * @return the singleton
     */
    public static _Amount getSingletonInternal() {
        return singleton;
    }

}
