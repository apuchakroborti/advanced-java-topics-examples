package javatutorial.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTestMain {
    public static void main(String[] args) {
        //test simple generics type
        SimpleBox<Integer> box = new SimpleBox<>(100);
        System.out.println("Box: "+box.getContent());

        //Bounded Generics test
        BoundedNumberBox<Integer> integer = new BoundedNumberBox<Integer>(100);
        System.out.println("Bounded test Integer: "+integer.getContent());


        BoundedNumberBox<Double> doubleTest = new BoundedNumberBox<Double>(200.0);
        System.out.println("Bounded test Double: "+doubleTest.getContent());

        BoundedNumberBox<Short> shortTest = new BoundedNumberBox<Short>((short) 200);
        System.out.println("Bounded test Short: "+shortTest.getContent());

        BoundedNumberBox<Float> floatTest = new BoundedNumberBox<Float>(200.0F);
        System.out.println("Bounded test Float: "+floatTest.getContent());

        BoundedNumberBox<Long> longTest = new BoundedNumberBox<Long>(200L);
        System.out.println("Bounded test Long: "+longTest.getContent());

        BoundedNumberBox<Number> numberTest = new BoundedNumberBox<Number>(200L);
        System.out.println("Bounded test number: "+numberTest.getContent());


        //wild class generics test
        List<Integer> integerList = new ArrayList<Integer>(){
            {
                add(100);
                add(200);
                add(300);

            }
        };
        new WildClass().printList(integerList);

        //triple test
        Triple triple = new Triple("firstValue", 20.0, 30L);
        System.out.println("Triple test: first: "+triple.getFirst());
        System.out.println("Triple test: second: "+triple.getSecond());
        System.out.println("Triple test: third: "+triple.getThird());

        Triple<String, Integer, Boolean> triple2 =
                new Triple<>("Hello", 42, true);
        System.out.println("Triple test: first: "+triple2.getFirst());
        System.out.println("Triple test: second: "+triple2.getSecond());
        System.out.println("Triple test: third: "+triple2.getThird());

        //pair test
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println("Pair test: first: "+pair.getFirst());
        System.out.println("Pair test: second: "+pair.getSecond());

    }
}
