package com.jin.alibaba.nacosdiscoveryprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.net.URI;

@RestController
public class DemoController {

    @Value("${server.port}")
    public Integer port;

    @GetMapping("/demo/{name}")
    public String demo(@PathVariable(name = "name") String name){
        return "hello "+name+port;
    }
}
