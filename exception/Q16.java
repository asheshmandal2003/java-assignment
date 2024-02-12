package exception;

public class Q16 {
    public void throwNumberFormatException() {
        try {
            int x = Integer.parseInt("Ashesh");
            System.out.println(x);
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
