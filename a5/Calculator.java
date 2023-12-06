package a5;

public class Calculator {

    public double itog = 0;

    public double add(double num) {
        return this.itog = this.itog + num;
    }

    public double subtract(double num) {
        return this.itog = this.itog - num;
    }

    public double multiply(double num) {
        return this.itog = this.itog * num;
    }

    public double divide(double num) {
        if (num == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return this.itog = this.itog / num;
    }

    public double C() {
        return this.itog = 0;
    }
}