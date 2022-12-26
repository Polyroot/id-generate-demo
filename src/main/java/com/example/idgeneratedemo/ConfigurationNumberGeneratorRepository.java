package com.example.idgeneratedemo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface ConfigurationNumberGeneratorRepository extends CrudRepository<ConfigurationNumberGeneratorEntity, Long> {
    Optional<ConfigurationNumberGeneratorEntity> findByFieldName(String package_number);
}
