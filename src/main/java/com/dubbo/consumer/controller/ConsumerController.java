package com.dubbo.consumer.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/6/21.
 */
public class ConsumerController {


    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-mvc.xml");
        context.start();
        System.out.println(context.getBeanDefinitionCount());
//        System.out.println(context.containsBean("demoService"));

    }
}
