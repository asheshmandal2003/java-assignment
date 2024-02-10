package constructor;

class Parent {
    public Parent() {
        System.out.println("This is a default constructor of class parent!");
    }

    public Parent(String name) {
        System.out.println("Hello " + name);
    }
}

public class Q2 extends Parent {
    public Q2() {
        super();
    }

    public Q2(String name) {
        super(name);
    }
}
