import java.io.FileNotFoundException;
import java.io.IOException;

import error.CustomException;
import exception.Q1;
import exception.Q10;
import exception.Q11;
import exception.Q12;
import exception.Q13;
import exception.Q14;
import exception.Q15;
import exception.Q16;
import exception.Q17;
import exception.Q18;
import exception.Q2;
import exception.Q3;
import exception.Q4;
import exception.Q5;
import exception.Q6;
import exception.Q7;
import exception.Q8;
import exception.Q9;

/**
 * Exceptions
 */
public class Exceptions {

    public static void main(String[] args) {
        // Q1 q1 = new Q1();
        // q1.arithmeticException();

        Q2 q2 = new Q2();
        q2.handleArithmeticException();

        try {
            Q3 q3 = new Q3();
            q3.throwException();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        Q4 q4 = new Q4();
        q4.catchExceptions();

        try {
            Q5 q5 = new Q5();
            q5.throwCustomException();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            Q6 q6 = new Q6();
            q6.vote(17);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        Q7 q7 = new Q7();
        q7.showFinal();

        Q8 q8 = new Q8();
        q8.throwArithmeticException();

        Q9 q9 = new Q9();
        q9.throwArrayIndexOutOfBoundsException();

        Q10 q10 = new Q10();
        q10.throwClassNotFoundException();

        try {
            Q11 q11 = new Q11();
            q11.throwFileNotFoundException();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }

        try {
            Q12 q12 = new Q12();
            q12.throwIOException();
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        Q13 q13 = new Q13();
        q13.throwNoSuchFieldException();

        Q14 q14 = new Q14();
        q14.throwNoSuchMethodException();

        Q15 q15 = new Q15();
        q15.throwNullPointerException();

        Q16 q16 = new Q16();
        q16.throwNumberFormatException();

        Q17 q17 = new Q17();
        q17.throwStringIndexOutOfBoundsException();

        Q18 q18 = new Q18();
        q18.throwSQLException();

    }
}