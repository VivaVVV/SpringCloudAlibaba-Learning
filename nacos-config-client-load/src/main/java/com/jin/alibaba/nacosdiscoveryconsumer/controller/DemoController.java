package com.jin.alibaba.nacosdiscoveryconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

    @Value("${test:空test}")
    public String test;

    @GetMapping("/test/config")
    public String getTest(){
        return test;
    }
}
