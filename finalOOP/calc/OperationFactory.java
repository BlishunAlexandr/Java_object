package finalOOP.calc;

import finalOOP.calc.operation.*;


public class OperationFactory {

    private final CalcLogger logger;

    public OperationFactory() {
        this.logger = new CalcLogger();
    }


    public Operation createOperation(char operation) {
        logger.logInfo("Creating operation: " + operation);
        switch (operation) {
            case '+':
                return new Add();
            case '*':
                return new Mult();
            case '/':
                return new Div();
            default:
                throw new IllegalArgumentException("Error404");
        }
    }
}
