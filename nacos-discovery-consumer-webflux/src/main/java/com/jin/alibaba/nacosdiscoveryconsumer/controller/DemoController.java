package com.jin.alibaba.nacosdiscoveryconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class DemoController {

    @Autowired
    private WebClient.Builder webClient;

    @GetMapping("/test/{name}")
    public Mono<String> test(@PathVariable(name = "name") String name){
        return webClient.build()
                .get()
                .uri("http://nacos-discovery-provider/demo/"+name)
                .retrieve()
                .bodyToMono(String.class);
    }
}
