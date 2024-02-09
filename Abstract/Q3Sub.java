package Abstract;

public class Q3Sub extends Q3 {
    @Override
    public void func1() {
        System.out.println("Implemented by Q3Sub!");
    }

    public void demo() {
        Q3Sub q3Sub = new Q3Sub();
        q3Sub.func1();
    }
}
