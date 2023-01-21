package javatutorial;

public class TestClass {
    public static void main(String[] args) {
        someMethod(null);

        //0.0
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

        //Infinity
        System.out.println("Exception test: "+1.0/0.0);
    }
    public static void someMethod(Object o) {
        System.out.println("Object method Invoked");
    }
    public static void someMethod(String s) {
        System.out.println("String method Invoked");
    }
}

