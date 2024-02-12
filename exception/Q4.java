package exception;

public class Q4 {
    public void catchExceptions() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException!");
        } catch (ArrayStoreException e) {
            System.out.println("ArrayStoreException!");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException!");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException!");
        }

    }
}
