package com.example.idgeneratedemo;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;

import static java.lang.String.format;


public abstract class BaseValueGenerator implements ValueGenerator<String> {

    @Override
    public String generateValue(Session session, Object o) {

        ConfigValueGeneratorEntity conf = getConfigValueGenerator(session);
        var nextSequenceValue = generateNextSequenceValue(session, conf);

        return format(conf.getMask(), nextSequenceValue);
    }

    public abstract String getFieldNameToGenerateValue();

    private Object generateNextSequenceValue(Session session, ConfigValueGeneratorEntity conf) {
        return session.createNativeQuery("select nextval('" + conf.getSequenceName() + "')")
                .setHibernateFlushMode(FlushMode.COMMIT)
                .getSingleResult();
    }

    private ConfigValueGeneratorEntity getConfigValueGenerator(Session session) {
        return (ConfigValueGeneratorEntity) session
                .createQuery("from ConfigValueGeneratorEntity с where с.fieldName = :fieldName")
                .setParameter("fieldName", getFieldNameToGenerateValue())
                .setHibernateFlushMode(FlushMode.COMMIT)
                .setHint("org.hibernate.cacheable", true)
                .getSingleResult();
    }
}