package a4;

import java.util.List;

public class main {
    public static void main(String[] args) {
        PrintElement<Integer> elementint = new PrintElement<Integer>(4);
        elementint.printElement();
        PrintElement<String> elementstr = new PrintElement<String>("Hello");
        elementstr.printElement();
        PrintElement<Double> elementdb = new PrintElement<Double>(3.14);
        elementdb.printElement();       


        printArray<String> goSpisokSTR = new printArray<>();
        String[] spisokSTR = {"Hello", "world", "!"};
        goSpisokSTR.PrintArray(spisokSTR);

        printArray<Integer> goSpisokINT = new printArray<>();
        Integer[] spisokINT = {1, 3, 5};
        goSpisokINT.PrintArray(spisokINT);
    }
}
