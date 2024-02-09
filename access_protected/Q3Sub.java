package access_protected;

import access_modifiers.Q3;

public class Q3Sub extends Q3 {
    public Q3Sub() {
        System.out.println(super.a);
        super.print();
    }
}
