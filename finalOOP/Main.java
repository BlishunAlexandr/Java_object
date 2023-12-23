package finalOOP;

import finalOOP.calc.*;
import finalOOP.calc.Number;
import finalOOP.calc.operation.Operation;

public class Main {
    public static void main(String[] args) {

        Number number1 = new Number(11, 2);
        Number number2 = new Number(2, 2);
        OperationFactory factory = new OperationFactory();

        Operation add = factory.createOperation('+');
        Number sum1 = add.operate(number1, number2);
        System.out.println("Addition result: " + sum1);

        Operation mult = factory.createOperation('*');
        Number sum2 = mult.operate(number1, number2);
        System.out.println("Addition result: " + sum2);
    }
}
