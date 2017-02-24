package com.ziniu.spring.demo.taskexecture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 10:43
 */
@Service
public class AsyncTaskService {
    @Async //注解异步方法
    public void exectureAsyncTask(Integer i){
        System.out.println("执行异步任务:"+ i);
    }

    @Async
    public void exectureAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务加1："+ (i+1));
    }
}
