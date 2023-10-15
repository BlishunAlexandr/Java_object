package a3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        plus Plus;
        Plus = (a) -> a + 123;
        System.out.println(Plus.getValue(10));

        List<Cat> cat = new ArrayList<>();
        cat.add(new Cat("Bars", 2));
        cat.add(new Cat("Mars", 1));
        cat.add(new Cat("Myrs", 3));
        cat.add(new Cat("Bars", 4));
        cat.add(new Cat("Null", 2));

        for(Cat newCat : cat){
            System.out.println(newCat);
        }

        Collections.sort(cat);
        
        System.out.println("После сортировки");
        for (Cat sortedCat : cat) {
            System.out.println(sortedCat);
        }
    }
}
