package Interface;

interface Interface6 {
    public void sum(int a, int b);
}

interface Interface7 {
    public void sum(int a, int b);
}

public class Q5 implements Interface6, Interface7 {
    @Override
    public void sum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
}
