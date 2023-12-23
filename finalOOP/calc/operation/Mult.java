package finalOOP.calc.operation;

import finalOOP.calc.Number;


public class Mult implements Operation {
    @Override
    public Number operate(Number num1, Number num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new Number(realPart, imaginaryPart);
    }
}
