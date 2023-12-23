package finalOOP.calc;

public class Number {
    private double real;
    private double imaginary;

    public Number(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + (imaginary >= 0 ? " + " : " - ") + Math.abs(imaginary) + "i";
    }

    
}
