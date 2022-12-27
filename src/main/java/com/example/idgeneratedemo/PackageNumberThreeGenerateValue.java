package com.example.idgeneratedemo;

import static com.example.idgeneratedemo.ValueGenerated.PACKAGE_NUMBER_THREE;

public class PackageNumberThreeGenerateValue extends BaseValueGenerator {

    @Override
    public String getFieldNameToGenerateValue() {
        return PACKAGE_NUMBER_THREE.getFieldNameToGenerateValue();
    }
}
