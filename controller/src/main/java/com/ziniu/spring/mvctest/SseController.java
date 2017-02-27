package com.ziniu.spring.mvctest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/27 0027 16:23
 */
@Controller
public class SseController {
    @RequestMapping(value = "/push",produces = "text/event-stream;charset=UTF-8")
    @ResponseBody
    public String push(){

        Random random = new Random();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "data:Testing 1,2,3 " + random.nextInt() + "\n\n";
    }
}
