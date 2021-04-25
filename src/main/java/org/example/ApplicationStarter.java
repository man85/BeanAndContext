package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStarter {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean tb=context.getBean("testBean",TestBean.class);
        System.out.println(tb);
        System.out.println(tb.getName());
        context.close();

    }
}
