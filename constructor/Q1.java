package constructor;

public class Q1 {
    public Q1() {
        System.out.println("It's a default constructor!");
    }

    public Q1(String name) {
        System.out.println("Hello, " + name);
    }

    public Q1(String firstName, String lastName) {
        System.out.printf("Hello %s %s\n", firstName, lastName);
    }
}
