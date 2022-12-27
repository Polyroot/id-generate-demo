package com.example.idgeneratedemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ValueGenerated {

    PACKAGE_NUMBER_ONE("package_number_one"),
    PACKAGE_NUMBER_THREE("package_number_three");

    private final String fieldNameToGenerateValue;

}
