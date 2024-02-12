package exception;

public class Q2 {
    public void handleArithmeticException() {
        try {
            int a = 0 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
        }
    }
}
