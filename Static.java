import Static.Q2;
import Static.Q3;
import Static.Q4;
import Static.Q5;
import Static.Q6;
import Static.Q7;

public class Static {
    public static void main(String[] args) {
        Q2.greet();

        Q3 q3 = new Q3();
        q3.printX();

        Q4.staticMethod();

        Q5 q5 = new Q5();
        q5.instanceMethod();

        System.out.println(Q6.static_var);
        Q6 q6 = new Q6();
        System.out.println(q6.instance_var);

        Q7.staticMethod();
        Q7 q7 = new Q7();
        q7.instanceMethod();
    }
}
