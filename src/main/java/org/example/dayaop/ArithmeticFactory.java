package org.example.dayaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArithmeticFactory {
    public static Arithmetic getArithmeticFactory(String ch) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaContainer1.class);
        Arithmetic arithmeticObject1 = (Arithmetic) context.getBean("a"+ch);
//        switch (ch) {
//            case 1:
//                arithmeticObject1 = (Arithmetic) context.getBean("a1");
//                break;
//            case 2:
//                arithmeticObject1 = (Arithmetic) context.getBean("a2");
//                break;
//            case 3:
//                arithmeticObject1 = (Arithmetic) context.getBean("a3");
//                break;
//            case 4:
//                arithmeticObject1 = (Arithmetic) context.getBean("a4");
//                break;
//            default:
//                arithmeticObject1 = null;
//                break;
//        }
        return arithmeticObject1;
    }
}
