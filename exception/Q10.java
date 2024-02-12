package exception;

public class Q10 {
    public void throwClassNotFoundException() {
        try {
            Class.forName("ImaginaryClass");
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
