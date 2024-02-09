import inheretance.A;
import inheretance.B;
import inheretance.C;

public class Inheretance {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        a.func();
        a.func1_A();
        a.func2_A();

        b.func();
        b.func1_A();
        b.func2_A();
        b.func1_B();
        b.func2_B();

        c.func();
        c.func1_A();
        c.func2_A();
        c.func1_B();
        c.func2_B();
        c.func1_C();
        c.func2_C();

        System.out.println(c.x);
    }
}
