package com.ziniu.spring.demo.aware;

import com.ziniu.spring.config.AwareConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 10:38
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();

        context.close();
    }
}
