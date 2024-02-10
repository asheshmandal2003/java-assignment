package method_overloading;

public class Q4 {
    public void printUserDetails(String name, String email) {
        System.out.printf("%s <%s>\n", name, email);
    }

    public void printUserDetails(int id, boolean isAdmin) {
        System.out.printf("id: %d, isAdmin: %b\n", id, isAdmin);
    }
}
