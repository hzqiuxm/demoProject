package com.ziniu.spring.demo.scheduledtask;

import com.ziniu.spring.config.TaskExectuorConfig;
import com.ziniu.spring.config.TaskSchedulerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 12:53
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

    }
}
