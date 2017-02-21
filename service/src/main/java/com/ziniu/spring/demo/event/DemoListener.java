package com.ziniu.spring.demo.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 20:06
 * 事件监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {

        String msg = demoEvent.getMsg();
        System.out.println("监听者DemoListener,接收到了bean-demoPublisher发布的消息:" + msg);

    }
}
