package com.ziniu.spring.mvctest;

import com.ziniu.spring.model2json.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/27 0027 15:50
 */
@Controller
public class ConverterController {

    @RequestMapping(value = "/convert",produces = {"application/x-wisely"})
    @ResponseBody
    public DemoObj convert(@RequestBody DemoObj demoObj){

        return demoObj;
    }
}
