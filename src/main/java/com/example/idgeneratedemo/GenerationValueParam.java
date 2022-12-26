package com.example.idgeneratedemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenerationValueParam {

    PACKAGE_NUMBER("package_number_one_seq", "CH%06d");

    private final String seq;
    private final String mask;
}