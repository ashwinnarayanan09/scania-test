package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {

    @GetMapping("/")
    public String getEntity() {
        return "Greetings from Spring Boot!";
    }

    @PostMapping("/")
    public String postEntity(@RequestBody String data) {
        return data;
    }

}