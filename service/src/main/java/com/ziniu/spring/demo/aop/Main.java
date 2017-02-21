package com.ziniu.spring.demo.aop;

import com.ziniu.spring.config.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 11:02
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotionService demoAnnotionService = context.getBean(DemoAnnotionService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotionService.add();
        demoMethodService.add();

        context.close();
    }
}
