package exception;

public class Q9 {
    public void throwArrayIndexOutOfBoundsException() {
        try {
            int[] arr = new int[] { 1, 2, 3, 4 };
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
