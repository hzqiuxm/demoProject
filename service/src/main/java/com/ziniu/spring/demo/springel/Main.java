package com.ziniu.spring.demo.springel;

import com.ziniu.spring.config.ElConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 19:23
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig  resource = context.getBean(ElConfig.class);

        resource.outputResource();

        context.close();

    }
}
