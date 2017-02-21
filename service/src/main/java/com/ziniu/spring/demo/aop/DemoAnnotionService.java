package com.ziniu.spring.demo.aop;

import org.springframework.stereotype.Service;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 10:49
 */
@Service
public class DemoAnnotionService {
    @Action(name="注解式拦截的add操作")
    public void add(){
        System.out.println("DemoAnnotionService add()");
    }
}
