package com.example.idgeneratedemo;

import java.time.LocalDateTime;

public record TestResponse(Long id, LocalDateTime dateTime, String packageNumberOne, String packageNumberTwo) {
}
