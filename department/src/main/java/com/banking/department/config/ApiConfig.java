package com.banking.department.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8084/", value = "employee")
public interface ApiConfig {

    @GetMapping
    String greetings();
}
