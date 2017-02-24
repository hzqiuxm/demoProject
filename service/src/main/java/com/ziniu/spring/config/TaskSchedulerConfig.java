package com.ziniu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 12:49
 */
@Configuration
@ComponentScan("com.ziniu.spring.demo.scheduledtask")
@EnableScheduling
public class TaskSchedulerConfig {

}
