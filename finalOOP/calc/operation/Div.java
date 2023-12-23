package finalOOP.calc.operation;

import finalOOP.calc.Number;

public class Div implements Operation {
    @Override
    public Number operate(Number num1, Number num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new Number(realPart, imaginaryPart);
    }
}
