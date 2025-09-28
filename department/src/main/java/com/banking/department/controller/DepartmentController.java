package com.banking.department.controller;

import com.banking.department.config.ApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    ApiConfig apiConfig;

    @GetMapping("/emp")
    public String greetingsFromEmployee(){
        return apiConfig.greetings();
    }

    @GetMapping
    public String greetings(){
        return "Greetings from Department service!!!";
    }
}
