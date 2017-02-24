package com.ziniu.spring.demo.combination;

import org.springframework.stereotype.Service;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 15:19
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置里获得bean!");
    }
}
