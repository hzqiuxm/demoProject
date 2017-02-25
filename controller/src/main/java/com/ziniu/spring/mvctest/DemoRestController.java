package com.ziniu.spring.mvctest;

import com.ziniu.spring.model2json.Contact;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/25 0025 18:07
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson",produces = "text/json;charset=UTF-8")
    public Contact getjson(Contact contact){
        return new Contact(contact.getEmail()+"hzqiuxm@163.com",contact.getPhone()+"139");
    }


    @RequestMapping(value = "/getxml",produces = "text/xml;charset=UTF-8")
    public Contact getxml(Contact contact){
        return new Contact(contact.getEmail()+"hzqiuxm@163.com",contact.getPhone()+"139");
    }

}
