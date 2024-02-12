package exception;

import java.util.ArrayList;

public class Q13 {
    ArrayList<Integer> list = new ArrayList<>();

    public void throwNoSuchFieldException() {
        try {
            Q13 q13 = new Q13();
            q13.list.iterator().next();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
