package method_overloading;

public class Q2 {
    public void printUserDetails(String name) {
        System.out.println(name);
    }

    public void printUserDetails(String name, boolean isAdmin) {
        System.out.printf("Name: %s\nisAdmin: %b\n", name, isAdmin);
    }
}
