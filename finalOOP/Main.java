package finalOOP;

import finalOOP.calc.*;
import finalOOP.calc.Number;
import finalOOP.calc.operation.Operation;

public class Main {
    public static void main(String[] args) {
        Number num1 = new Number(2, 3);
        Number num2 = new Number(1, -1);

        OperationFactory factory = new OperationFactory();

        Operation addition = factory.createOperation('+');
        addition.operate(num1, num2);

        Operation multiplication = factory.createOperation('*');
        multiplication.operate(num1, num2);

        Operation division = factory.createOperation('/');
        division.operate(num1, num2);
    }
}
