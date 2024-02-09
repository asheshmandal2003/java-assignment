import Abstract.Q1;
import Abstract.Q1Sub;
import Abstract.Q2Sub;
import Abstract.Q3Sub;
import Abstract.Q4Sub;

public class Abstract {
    public static void main(String[] args) {
        Q1 q1 = new Q1Sub();
        q1.func1();
        q1.func2();

        Q2Sub q2Sub = new Q2Sub();
        q2Sub.func1();
        q2Sub.func2();

        Q3Sub q3Sub = new Q3Sub();
        q3Sub.func1();
        q3Sub.func2();

        Q4Sub q4Sub = new Q4Sub();
        q4Sub.func1();
        q4Sub.func2();
    }
}
