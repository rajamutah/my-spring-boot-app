package com.banking.employee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping
    public String greeting(){
        return "Greetings from employee service!!!";
    }
}
