package exception;

public class Q17 {
    public void throwStringIndexOutOfBoundsException() {
        try {
            System.out.println("Ashesh".charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
