package com.jin.sentinelcoreexample.config;

import com.alibaba.csp.sentinel.adapter.servlet.callback.WebCallbackManager;
import com.jin.sentinelcoreexample.handle.DemoUrlBlockHandle;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SentinelConfig {

    @PostConstruct
    public void init(){   //执行初始化
        WebCallbackManager.setUrlBlockHandler(new DemoUrlBlockHandle());
    }
}
