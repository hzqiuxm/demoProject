package com.ziniu.spring.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 21:06
 */
@Component
public class DemoListener2 implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {

        String msg = demoEvent.getMsg();
        System.out.println("监听者DemoListener2,接收到了bean-demoPublisher发布的消息:" + msg);

    }
}
