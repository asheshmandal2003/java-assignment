package exception;

public class Q8 {
    public void throwArithmeticException() {
        try {
            int x = 0 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }
}
