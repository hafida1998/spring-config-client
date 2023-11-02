package com.example.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PrincipleController {
    @Value("${message:message default }")
    private String service;

    @GetMapping("/service")
    String getService() {
        return this.service;
    }
}
