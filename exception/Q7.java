package exception;

public class Q7 {
    public void showFinal() {
        try {
            int x = 1 / 0;
            System.out.println(x);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Called!");
        }
    }
}
