package com.ma.itemservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${spring.datasource.url}")
    private String datasourceUri;

    @GetMapping("/call")
    public String testCall() {
        return "item test";
    }

    @GetMapping("/data")
    public String data(){
        return datasourceUri;
    }
}
