package com.ziniu.spring.demo.conditional;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 14:46
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
