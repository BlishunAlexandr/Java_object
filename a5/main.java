package a5;
public class main {
    public static void main(String[] args) {

        Calculator num1 = new Calculator();
        CalcView view1 = new CalcView();

        CalcPresenter Calc = new CalcPresenter(num1, view1);
        Calc.operation(2, '+');
        Calc.operation(2, '+');
        Calc.operation(1, '-');
        Calc.operation(3, '*');
        Calc.operation(2, '/');
        Calc.C();
        Calc.operation(-2, '+');
    }
}
