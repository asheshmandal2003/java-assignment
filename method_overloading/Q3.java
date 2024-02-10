package method_overloading;

/*
 *  Having 2 methods with same signature is not possible in java.
 *  Because JRE will never differentiate which method we want to call.
 */

public class Q3 {
    public void printUserDetails(String name) {
        System.out.println(name);
    }

    public void printUserDetails(String name) {
        System.out.println(name);
    }
}
