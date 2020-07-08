package com.jin.sentinelcoreexample.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jin.sentinelcoreexample.handle.ExceptionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test/{name}")
    public String test(@PathVariable(name = "name") String name){
        return "hello"+name;
    }

    @GetMapping("/hello")
    @SentinelResource(value = "hello",blockHandler = "exHandle",blockHandlerClass = {ExceptionUtil.class})
    public String hello(){
        return "hello hello";
    }

//    public String exHandle(BlockException ex){
//        return "错误的请求";
//    }

}
