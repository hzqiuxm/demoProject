package com.ziniu.spring.demo.combination;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 15:26
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);

        demoService.outputResult();

        context.close();
    }
}
