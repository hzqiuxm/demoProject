package com.ziniu.spring.demo.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 16:43
 */
@Service
@Scope("prototype") //每次建一个实例
public class DemoPrototypeService {

}
