package finalOOP.calc.operation;

import finalOOP.calc.Number;

public class Add implements Operation {
    @Override
    public Number operate(Number num1, Number num2) {
        return new Number(num1.getReal() + num2.getReal(), num1.getImaginary() + num2.getImaginary());
    }
}
