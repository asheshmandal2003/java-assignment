package Abstract;

public class Q4Sub extends Q3 {
    @Override
    public void func1() {
        System.out.println("Implemented by Q4Sub!");
    }

    public void demo() {
        Q4Sub q4Sub = new Q4Sub();
        q4Sub.func2();
    }
}
