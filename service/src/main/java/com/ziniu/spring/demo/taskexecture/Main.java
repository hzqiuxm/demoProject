package com.ziniu.spring.demo.taskexecture;

import com.ziniu.spring.config.TaskExectuorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 10:51
 */
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExectuorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

        for (int i = 0; i < 10; i++) {
            asyncTaskService.exectureAsyncTask(i);
            asyncTaskService.exectureAsyncTaskPlus(i);
        }

        context.close();
    }
}
