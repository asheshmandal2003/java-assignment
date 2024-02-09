package access_protected;

import access_modifiers.Q3;

/*
 *  Protected variables can only be accessed in same class, same package and subclasses.
 */

public class DemoClass {
    public static void main(String[] args) {
        Q3 q3 = new Q3();
        // System.out.println(q3.a);
    }
}
