package a1;

public class program {

    public static void main(String[] args) {
        cat cot = new cat();
        cot.setName("Барс");
        cot.setAge(5);
        cot.greet();

        System.out.println();

        rectangle rec = new rectangle(6, 3);
        rectangle rec2 = new rectangle();
        System.out.println(rec.calculatePerimeter());
        System.out.println(rec2.calculateArea());
    }
}
