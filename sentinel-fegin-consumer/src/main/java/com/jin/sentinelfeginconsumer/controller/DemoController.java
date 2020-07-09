package com.jin.sentinelfeginconsumer.controller;

import com.jin.sentinelfeginconsumer.client.DemoFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoFeginClient feginClient;

    @GetMapping("/fegin")
    public String fegin(){
        return feginClient.fegin();
    }
}
