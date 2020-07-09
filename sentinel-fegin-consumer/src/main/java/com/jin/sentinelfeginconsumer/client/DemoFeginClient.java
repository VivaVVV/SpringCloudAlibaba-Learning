package com.jin.sentinelfeginconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sentinel-fegin-provider",fallback = DemoFeginFallBack.class)
public interface DemoFeginClient {

    @GetMapping("/fegin")
    String fegin();
}
