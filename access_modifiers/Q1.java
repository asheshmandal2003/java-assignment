package access_modifiers;

public class Q1 {
    private static int a = 10;
    private static boolean isTrue = true;

    private static void method() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(isTrue);
        method();
    }
}

/*
 * Private variables and methods are only accessable inside of that class.
 * We cannot access it any other class.
 */

class SubClass extends Q1 {
}