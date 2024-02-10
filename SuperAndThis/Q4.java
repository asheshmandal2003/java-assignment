package SuperAndThis;

public class Q4 {
    private String name;
    private int roll;

    public Q4(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public Q4() {
        this("Ashesh Mandal", 18);
    }

    public void getFieldValues() {
        System.out.println("Name: " + this.name);
        System.out.println("Roll: " + this.roll);
    }
}
