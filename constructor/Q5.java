package constructor;

public class Q5 {
    public Q5() {
        System.out.println("Testing...");
    }

    public Q5(String name) {
        System.out.println("Hello, " + name);
    }

    public Q5(String name, String id) {
        System.out.printf("id: %s\nName: %s\n", id, name);
    }
}
