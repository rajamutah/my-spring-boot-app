package com.banking.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class DepartmentController {

    @Autowired
    WebClient webClient;

    @GetMapping("/emp")
    public String greetingsFromEmployee(){
        return webClient.get().uri("http://localhost:8084/").retrieve().bodyToMono(String.class).block();
    }

    @GetMapping
    public String greetings(){
        return "Greetings from Department service!!!";
    }
}
