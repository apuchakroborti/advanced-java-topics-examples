package javatutorial.generics;

import java.util.List;

public class WildClass {
    void printList(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }
}
