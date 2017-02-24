package com.ziniu.spring.demo.conditional;

import com.ziniu.spring.config.ConditionConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 14:49
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);

        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为：" + listService.showListCmd()) ;

        context.close();
    }
}
