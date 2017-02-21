package com.ziniu.spring.demo.di;

import org.springframework.stereotype.Service;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 10:20
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello "+ word +"!";
    }
}
