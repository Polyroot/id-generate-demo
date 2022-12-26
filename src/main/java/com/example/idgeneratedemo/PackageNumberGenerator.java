package com.example.idgeneratedemo;

import lombok.NoArgsConstructor;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.tuple.ValueGenerator;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

import static com.example.idgeneratedemo.GenerationValueParam.PACKAGE_NUMBER;
import static java.lang.String.format;


@Component
@NoArgsConstructor
public class PackageNumberGenerator implements ValueGenerator<String> {

    @Override
    public String generateValue(Session session, Object o) {

        var nextVal = (BigInteger) session
                .createNativeQuery("select nextval('" + PACKAGE_NUMBER.getSeq() + "')")
                .setHibernateFlushMode(FlushMode.COMMIT)
                .getSingleResult();

        return format(PACKAGE_NUMBER.getMask(), nextVal);
    }

}