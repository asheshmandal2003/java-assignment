import java.math.BigInteger;

import constructor.Q1;
import constructor.Q2;
import constructor.Q3;
import constructor.Q3Sub;
import constructor.Q5;

public class Constructor {
    public static void main(String[] args) {
        // Q1 q1 = new Q1();
        // Q1 q12 = new Q1("Ashesh");
        // Q1 q13 = new Q1("Ashesh", "Mandal");

        // Q2 q2 = new Q2();
        // Q2 q22 = new Q2("Ashesh");

        // Q3 q3 = new Q3();
        // q3.setPassAndToken("abc@123", "a12bdb673b%187&%gs");
        // Q3Sub q3Sub = new Q3Sub("Ashesh Mandal");
        // Q3Sub q3Sub2 = new Q3Sub(new BigInteger("0123456789"));

        Q5 q5 = new Q5();
        q5 = new Q5("Ashesh Mandal");
        q5 = new Q5("Ashesh Mandal", "A001");
    }
}
