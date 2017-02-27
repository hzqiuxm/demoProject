import com.ziniu.spring.other.MyMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.List;

/**
 * Copyright © 2016年 author. All rights reserved.
 *
 * @Author 临江仙 hxqiuxm@163.com
 * @Date 2017/2/25 0025 16:01
 */
@Configuration
@EnableWebMvc
@EnableScheduling
@ComponentScan({"com.ziniu.spring.service","com.ziniu.spring.mvctest"})
//@ComponentScan({"com.ziniu.spring.service"})
//继承WebMvcConfigurerAdapter来实现自己的配置
public class MyMvcConfig  extends WebMvcConfigurerAdapter{

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");//WEB-INF/classes/views/
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);

        return viewResolver;
    }

    //静态资源配置
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){

        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");
    }

    //拦截器配置
    //用普通Bean实现HanderInterceptor接口或者继承HandlerInterceptorAdapter
    @Bean
    public DemoInterceptor demoInterceptor(){
        return new DemoInterceptor();
    }

    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor());
    }

    //快捷的ViewController配置
    //主要配置一些通用共性的映射关系
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/toUpload").setViewName("/upload");
        registry.addViewController("/converter").setViewName("/converter");
        registry.addViewController("/sse").setViewName("sse");
        registry.addViewController("/async").setViewName("async");
    }

    //MultipartResolver配置
    @Bean
    public MultipartResolver multipartResolver(){
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(1000000);
        return multipartResolver;
    }

    //仅添加一个自定义的转换器，不要覆盖默认注册的Ht
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(converters());
    }

    @Bean
    public MyMessageConverter converters(){
        return  new MyMessageConverter();
    }



}
