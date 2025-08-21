package org.example.dayaop;

//intercepting filter:
public interface Arithmetic {
    public Double cal(Double a, Double b);
}
class Add implements Arithmetic {

    @Override
    public Double cal(Double a, Double b) {
        return a + b;
    }
}
class Sub implements Arithmetic {

    @Override
    public Double cal(Double a, Double b) {
        return a - b;
    }
}
class Mul implements Arithmetic {

    @Override
    public Double cal(Double a, Double b) {
        return a * b;
    }
}
class Div implements Arithmetic {

    @Override
    public Double cal(Double a, Double b) {
        return a / b;
    }
}
//factor method: returns the object of the subclass