package Static;

public class Q4 {
    void print(){
        System.out.println("Hello from instace method");
    }

    public static void staticMethod(){
        Q4 q4 = new Q4();
        q4.print();
    }
}
