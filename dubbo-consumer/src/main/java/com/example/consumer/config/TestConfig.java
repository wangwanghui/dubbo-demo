package com.example.consumer.config;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class TestConfig implements InitializingBean {
    @Value("${server.port}")
    private Integer port;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(port);
    }
}
