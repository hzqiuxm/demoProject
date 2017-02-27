package com.ziniu.spring.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 17:02
 */
@Configuration
@ComponentScan("com.ziniu.spring.demo.springel")
@PropertySource("classpath:test2.properties")
public class ElConfig {

    @Value("I Love You!") //普通字符串的注入
    private String normal;

    @Value("#{systemProperties['os.name']}")//注入操作系统属性
    private String osName;

    @Value("#{T(java.lang.Math).random() * 100.0 }")//注入表达式结果
    private Double randomNumber;

    @Value("#{demoElService.another}")//注入其他Bean的属性
    private String fromAnother;

    @Value("classpath:test")//注入文件资源
    private Resource testFile;

    @Value("http://ziniuxiaozhu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;//注入配置文件

    @Autowired
    private Environment environment;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        try {
            System.out.println("normal = " + normal);
            System.out.println("osName = " + osName);
            System.out.println("randomNumber = " + randomNumber);
            System.out.println("fromAnother = " + fromAnother);
            System.out.println("testFile = " + IOUtils.toString(testFile.getInputStream(),"UTF-8"));
            System.out.println("testUrl = " + IOUtils.toString(testUrl.getInputStream(),"UTF-8"));
            System.out.println("bookName = " + bookName);
            System.out.println("environment = " + environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
