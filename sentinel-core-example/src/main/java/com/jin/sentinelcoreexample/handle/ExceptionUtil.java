package com.jin.sentinelcoreexample.handle;

import com.alibaba.csp.sentinel.slots.block.BlockException;

public class ExceptionUtil {
    public static String exHandle(BlockException ex){
        return "错误的请求";
    }
}
