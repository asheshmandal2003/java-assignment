package exception;

import java.util.HashSet;
import java.util.Set;

public class Q14 {
    public void throwNoSuchMethodException() {
        try {
            @SuppressWarnings("rawtypes")
            Set set = new HashSet<>();
            set.iterator().next();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
