package com.example.idgeneratedemo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Getter
@Setter
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
@NoArgsConstructor
@Table(name = "conf_generate_number")
public class ConfigValueGeneratorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "field_name")
    private String fieldName;

    @Column(name = "mask")
    private String mask;

    @Column(name = "sequence_name")
    private String sequenceName;

}
