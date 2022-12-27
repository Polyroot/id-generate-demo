package com.example.idgeneratedemo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @GeneratorType(type = PackageNumberOneGenerateValue.class, when = GenerationTime.INSERT)
    @Column(name = "package_number_one")
    private String packageNumberOne;

    @Generated(value = GenerationTime.INSERT)
    @Column(name = "package_number_two", insertable = false, updatable = false)
    private String packageNumberTwo;

    @GeneratorType(type = PackageNumberThreeGenerateValue.class, when = GenerationTime.INSERT)
    @Column(name = "package_number_three")
    private String packageNumberThree;

    public TestEntity(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}