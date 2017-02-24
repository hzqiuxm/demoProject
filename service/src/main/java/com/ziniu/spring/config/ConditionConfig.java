package com.ziniu.spring.config;

import com.ziniu.spring.demo.conditional.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 14:47
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class) //符合条件才实例化Bean
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
            return new LinuxListService();
    }
}
