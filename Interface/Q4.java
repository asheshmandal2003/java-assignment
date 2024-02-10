package Interface;

interface Interface4 {
    public void func1();
}

interface Interface5 {
    public void func2();
}

public class Q4 implements Interface4, Interface5 {
    @Override
    public void func1() {
        System.out.println("Interface 4");
    }

    @Override
    public void func2() {
        System.out.println("Interface 5");
    }
}
