package com.jin.alibaba.nacosdiscoveryconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class DemoController {
/*    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/test/{name}")
    public String test(@PathVariable(name = "name") String name){
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        URI uri = serviceInstance.getUri();
        String url=uri+"/demo/"+name;
        String url2= "http://nacos-discovery-provider/demo/"+name;
        return restTemplate.getForObject(url, String.class);
    }*/
}
