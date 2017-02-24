package com.ziniu.spring.demo.scheduledtask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 12:38
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔5秒执行一次: "+dataFormat.format(new Date()));
    }

    @Scheduled(cron = "0 59 12 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间执行:" + dataFormat.format(new Date())+"执行");
    }

}
