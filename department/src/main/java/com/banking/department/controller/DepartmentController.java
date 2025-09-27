package com.banking.department.controller;

import com.banking.department.config.RestTemplateConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DepartmentController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/emp")
    public String greetingsFromEmployee(){
        return restTemplate.getForObject("http://localhost:8084/", String.class);
    }

    @GetMapping
    public String greetings(){
        return "Greetings from Department service!!!";
    }
}
