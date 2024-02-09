package Static;

public class Q1 {
    // static variables
    static int var1 = 1;
    static Q1 obj1 = new Q1();

    // instance variables
    int var2 = 1;
    Q1 obj2 = new Q1();

    // static methods
    static void func1() {
        System.out.println("Static method 1");
    }

    static void func2() {
        System.out.println("Static method 2");
    }

    // instance methods
    void func3() {
        System.out.println("Instance method 1");
    }

    void func4() {
        System.out.println("Instance method 2");
    }

    public static void main(String[] args) {

    }
}
