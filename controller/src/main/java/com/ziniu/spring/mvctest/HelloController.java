package com.ziniu.spring.mvctest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/25 0025 16:43
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "index";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "index.html";
    }
}
