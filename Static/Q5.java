package Static;

public class Q5 {
    static void print(){
        System.out.println("Hello from static method");
    }
    public void instanceMethod(){
        Q5.print();
    }
}
