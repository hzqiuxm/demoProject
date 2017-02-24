package com.ziniu.spring.demo.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 10:29
 */
@Service
public class AwareService  implements BeanNameAware,ResourceLoaderAware{

    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(String s) {
        this.beanName = s;

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader =resourceLoader;

    }

    public void outputResult(){
        System.out.println("Bean的名称为：" + beanName);

        Resource resource = resourceLoader.getResource("test");

        try {
            System.out.println("ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream(),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
