package org.example.controller;

import org.example.dayaop.Arithmetic;
import org.example.dayaop.ArithmeticFactory;

public class DemoArithmeticFactory {
    public static void main(String[] args) {
        try{
            Arithmetic ob = ArithmeticFactory.getArithmeticFactory("1");
            System.out.println(ob.cal(500000.0,20.0));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
