package org.example.dayaop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaContainer1 {
//    AOP
    @Bean
    public Arithmetic a1() {
        return new Add();
    }
    @Bean
    public Arithmetic a2() {
        return new Sub();
    }
    @Bean
    public Arithmetic a3() {
        return new Mul();
    }
    @Bean
    public Arithmetic a4() {
        return new Div();
    }
    @Bean
    public Validate a5() {
        return new Validate();
    }
}
