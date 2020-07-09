package com.jin.sentinelfeginprovider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/fegin")
    public String fegin(){
        return "hello sentinel fegin";
    }
}
