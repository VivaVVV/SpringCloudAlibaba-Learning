package com.jin.sentinelfeginconsumer.client;

import org.springframework.stereotype.Component;

@Component
public class DemoFeginFallBack implements DemoFeginClient {
    @Override
    public String fegin() {
        return "错误的请求";
    }
}
