package com.jin.alibaba.nacosdiscoveryconsumer.controller;

import com.jin.alibaba.nacosdiscoveryconsumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class DemoController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/test/{name}")
    public String test(@PathVariable(name = "name") String name){
        return feignService.demo(name);
    }


}
