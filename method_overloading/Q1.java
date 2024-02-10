package method_overloading;

public class Q1 {
    public void printUserDetails(String name) {
        System.out.println(name);
    }

    public void printUserDetails(String name, String email) {
        System.out.printf("%s <%s>\n", name, email);
    }
}
