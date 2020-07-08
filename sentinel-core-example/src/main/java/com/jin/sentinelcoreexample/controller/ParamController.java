package com.jin.sentinelcoreexample.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jin.sentinelcoreexample.handle.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {

    @GetMapping("/param")
    @SentinelResource(value = "param",blockHandler = "exHandle")
    public String param(String type){
        return "hello param";
    }

    public  String exHandle(String type,BlockException ex){
        return "频繁的请求";
    }

}
