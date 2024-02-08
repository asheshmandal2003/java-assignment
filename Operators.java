// import operators.Q1;

// import operators.Q2;

// import operators.Q3;

import java.util.Scanner;

// import operators.Q4;

// import operators.Q5;

// import operators.Q6;

import operators.Q7;

/**
 * Operators
 */
public class Operators {

    public static void main(String[] args) {
        // Q1 q1 = new Q1();
        // q1.arithmeticOperations(20, 10);

        // Q2 q2 = new Q2();
        // q2.increment(1);
        // q2.decrement(1);

        // Q3 q3 = new Q3();
        // System.out.println(q3.isEqual(1, 1));
        // System.out.println(q3.isNotEqual(0, 1));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.printf("Enter num 1: ");
        int num2 = sc.nextInt();
        sc.close();

        // Q4 q4 = new Q4();
        // System.err.println();
        // System.out.println(q4.isEqualNo(num1, num2));

        // Q5 q5 = new Q5();
        // q5.logicalOperators(true, false);

        // Q6 q6 = new Q6();
        // q6.relationalOperators(0, 1);

        Q7 q7 = new Q7();
        q7.compare(num1, num2);
    }
}