package com.ziniu.spring.demo.event;

import org.springframework.context.ApplicationEvent;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 20:03
 * 自定义事件
 */
public class DemoEvent extends ApplicationEvent { //提供了Bean之间通讯的可能
    private static final long serialVerionUID = 1L;
    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
