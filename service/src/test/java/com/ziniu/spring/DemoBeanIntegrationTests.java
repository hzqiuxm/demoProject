package com.ziniu.spring;

import com.ziniu.spring.demo.test.TestBean;
import com.ziniu.spring.demo.test.TestConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/24 0024 16:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class}) //加载配置ApplicationContext
@ActiveProfiles("prod")
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}
