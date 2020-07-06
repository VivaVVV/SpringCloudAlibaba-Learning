package com.jin.alibaba.nacosdiscoveryconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("nacos-discovery-provider")
public interface FeignService {

    @GetMapping("/demo/{name}")
     String demo(@PathVariable(name = "name") String name);
}
