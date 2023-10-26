package a4;

public class PrintElement<T> {
    private T t;

    public PrintElement(T t) {
        this.t = t;
    }

    public void printElement() {
        System.out.println(t);
    }

}