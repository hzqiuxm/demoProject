package com.ziniu.spring.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/21 0021 10:52
 */
@Aspect//声明一个切面类
@Component//声明为一个spring的普通Bean,让容器来管理它
public class LogAspect {
    @Pointcut("@annotation(com.ziniu.spring.demo.aop.Action)")//注解声明切点
    public void annotionPointCut(){}

    @After("annotionPointCut()")//根据切点来拦截
    public void after(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("拦截式After注解 "+action.name());
    }

    @Before("execution(* com.ziniu.spring.demo.aop.DemoMethodService.*(..))")//直接使用拦截规则来拦截
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        System.out.println("方法规则Before拦截，" +method.getName());
    }
}
