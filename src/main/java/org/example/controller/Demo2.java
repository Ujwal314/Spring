package org.example.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {
    public static void main(String[] args) {
//        xml
        ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
        Holiday holidayObj1 = (Holiday) context.getBean("holidayObj1");
        System.out.println(holidayObj1);
        Holiday holidayObj2 = (Holiday) context.getBean("holidayObj2");
        System.out.println(holidayObj2);

//        Java Container
        context = new AnnotationConfigApplicationContext(JavaContainer.class);
        holidayObj1 = (Holiday) context.getBean("f3");
        System.out.println(holidayObj1);
        holidayObj2 = (Holiday) context.getBean("f4");
        System.out.println(holidayObj2);
    }
}
