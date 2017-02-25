package com.ziniu.spring.mvctest;

import com.ziniu.spring.model2json.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/25 0025 19:18
 */
@Controller
public class AdviceController {

    @RequestMapping("/advice")
    public String getSome(@ModelAttribute  String msg, User user){
        System.out.println("---------getSome()---------");
        throw new IllegalArgumentException("非常抱歉，参数有误" + "来自@ModelAttrobute：" + msg);
    }
}
