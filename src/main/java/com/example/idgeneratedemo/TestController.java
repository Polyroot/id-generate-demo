package com.example.idgeneratedemo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@AllArgsConstructor
public class TestController {

    private final TestRepository testRepository;

    @GetMapping
    public ResponseEntity<TestResponse> go() {

        TestEntity testEntity = testRepository.save(new TestEntity(LocalDateTime.now()));

        return ResponseEntity.ok()
                .body(new TestResponse(testEntity.getId(),
                        testEntity.getDateTime(),
                        testEntity.getPackageNumberOne(),
                        testEntity.getPackageNumberTwo(),
                        testEntity.getPackageNumberThree()));
    }

}