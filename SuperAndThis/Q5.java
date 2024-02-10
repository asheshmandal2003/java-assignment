package SuperAndThis;

class Parent {
    private String name;

    protected Parent(String name) {
        this.name = name;
    }

    protected void getName() {
        System.out.println("Name: " + this.name);
    }
}

public class Q5 extends Parent {
    private int roll;

    public Q5(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    public void getDetails() {
        super.getName();
        System.out.println("Roll: " + this.roll);
    }
}
