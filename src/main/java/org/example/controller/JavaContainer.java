package org.example.controller;

import org.example.dao.StudentDAO;
import org.example.dayaop.Arithmetic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy
public class JavaContainer {
    @Bean
    public StudentDAO f1() {
        return new StudentDAO();
    }
    @Bean
    public Holiday f3() {
        return new Holiday("Gandhi Jayanti", "October 2nd");
    }
    @Bean
    public Holiday f4() {
        Holiday ob = new Holiday();
        ob.setHolidayDate("October 2nd");
        ob.setHolidayName("Lal Bahadur Shastri Jayanti");
        return ob;
    }
}
