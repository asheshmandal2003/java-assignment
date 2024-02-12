package exception;

public class Q15 {
    public void throwNullPointerException() {
        try {
            String str = null;
            str.charAt(0);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }
}
