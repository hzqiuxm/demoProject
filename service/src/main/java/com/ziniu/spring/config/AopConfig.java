package com.ziniu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 11:01
 */
@Configuration
@ComponentScan("com.ziniu.spring.demo.aop")
@EnableAspectJAutoProxy//开启切面功能
public class AopConfig {

}
