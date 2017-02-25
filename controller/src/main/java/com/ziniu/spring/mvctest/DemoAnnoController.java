package com.ziniu.spring.mvctest;

import com.ziniu.spring.model2json.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/25 0025 17:51
 */
@Controller
@RequestMapping("/anno")
public class DemoAnnoController {


    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public String index(HttpServletRequest request){

        return "url: " + request.getRequestURI() + "can acess!";
    }

    //路径参数
    @RequestMapping(value = "/pathvar/{str}",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String demoPathVar(@PathVariable String str, HttpServletRequest request){
        return "url: " + request.getRequestURI() + "can access, str = " + str;
    }

    //传递参数
    @RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String passRequestParam(Long id,HttpServletRequest request){
        return "url: " + request.getRequestURI() + "can access, id = " + id;
    }

    //传递对象
    @RequestMapping(value = "/obj",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String PassObj(Contact contact,HttpServletRequest request){
        return "url: " + request.getRequestURI() + "can access, contact.Email = " + contact.getEmail();
    }

    //不同路径映射到同一方法上
    @RequestMapping(value = {"/name1","/name2"},produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String remove(HttpServletRequest request){
        return "url: " + request.getRequestURI() + " can access!";
    }

}
