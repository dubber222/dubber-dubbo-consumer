package com.dubber.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2018/6/21.
 *
 * @author dubber
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        System.out.println(demoService.saySeeYou("安安小公主"));
    }
}
