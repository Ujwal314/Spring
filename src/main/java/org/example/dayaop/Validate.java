package org.example.dayaop;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Order(0)
@Aspect
public class Validate {
//    any package, class, method having signature(double, double)
    @Before("execution(* *.*(Double, Double))")
    public void checkNegative(JoinPoint arg) throws Exception {
        for (Object x : arg.getArgs()) {
            Double y = (Double) x;
            if (y<0.0) throw new IllegalArgumentException("Negetive values not supported");
        }
    }
    @AfterReturning(pointcut = "execution(* *.*(Double, Double))",returning = "result")
    public void checkFiveLakh(Object result) throws Exception {
        if ((Double) result > 500000.0) throw new IllegalArgumentException("Above 5 lakh!");
    }
}
