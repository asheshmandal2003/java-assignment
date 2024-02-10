package SuperAndThis;

class Parent {
    public int a = 10;

    public void print() {
        System.out.println("Hello World!");
    }
}

public class Q2 extends Parent {
    public void callParent() {
        System.out.println(super.a);
        super.print();
    }
}
