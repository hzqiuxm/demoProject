package com.ziniu.spring.demo.aop;

import org.springframework.stereotype.Service;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 10:51
 */
@Service
public class DemoMethodService {

    public void add(){
        System.out.println("DemoMethodService.add()");
    }
}
