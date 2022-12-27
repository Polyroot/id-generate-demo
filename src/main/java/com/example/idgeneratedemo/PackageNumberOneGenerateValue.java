package com.example.idgeneratedemo;

import static com.example.idgeneratedemo.ValueGenerated.*;

public class PackageNumberOneGenerateValue extends BaseValueGenerator {

    @Override
    public String getFieldNameToGenerateValue() {
        return PACKAGE_NUMBER_ONE.getFieldNameToGenerateValue();
    }
}
