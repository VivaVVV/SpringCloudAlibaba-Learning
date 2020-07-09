package com.jin.sentinelfeginconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class SentinelFeginConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelFeginConsumerApplication.class, args);
    }

}
