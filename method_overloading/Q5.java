package method_overloading;

/*
 *  In Java method overloading happens based on method name, method parameters count and data type.
 *  We cannot achieve method overloading with only based upon different return type in Java.
 */

public class Q5 {
    public int sum(int a, int b) {
        return a + b;
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }
}
