package a5;

public class CalcPresenter {

    private Calculator model;
    private CalcView view;

    public CalcPresenter(Calculator model, CalcView view) {
        this.model = model;
        this.view = view;
    }



    public void operation(double num, char operation) {
        try {
            switch (operation) {
                case '+':
                    model.add(num);
                    break;
                case '-':
                    model.subtract(num);
                    break;
                case '*':
                    model.multiply(num);
                    break;
                case '/':
                    model.divide(num);
                    break;
                default:
                    view.printError("Нету такой операции");
                    break;
            }
            view.printResult(model.itog);
        } catch (ArithmeticException e) {
            view.printError(e.getMessage());
        }
    

    }

    public void C() {
        model.C();
    }

}   

