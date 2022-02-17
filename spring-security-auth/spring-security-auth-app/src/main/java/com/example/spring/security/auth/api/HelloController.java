package com.example.spring.security.auth.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public ResponseEntity getHello() {
        return ResponseEntity.ok("Hello Security");
    }
}
