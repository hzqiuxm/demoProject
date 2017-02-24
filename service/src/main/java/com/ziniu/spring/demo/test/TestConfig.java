package com.ziniu.spring.demo.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 16:11
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from depelopment profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }
}
