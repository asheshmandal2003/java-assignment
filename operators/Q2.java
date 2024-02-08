package operators;

import java.util.Scanner;

public class Q2 {
    Scanner sc = new Scanner(System.in);

    public void increment(int a) {
        System.err.print("Type increment type(preIncrement, postIncrement): ");
        String type = sc.nextLine();
        sc.close();

        switch (type) {
            case "preIncrement":
                System.out.println("Before increment value: " + a);
                System.out.println("During increment value: " + ++a);
                System.out.println("After increment value: " + a);
                break;

            case "postIncrement":
                System.out.println("During increment value: " + a);
                System.out.println("During increment value: " + a++);
                System.out.println("During increment value: " + a);

            default:
                System.out.println("Please type \"postIncrement\" or \"preIncrement\" in the input!");
                break;
        }
    }

    public void decrement(int a) {
        System.err.print("Type decrement type(preDecrement, postDecrement): ");
        String type = sc.nextLine();
        sc.close();

        switch (type) {
            case "preDecrement":
                System.out.println("Before decrement value: " + a);
                System.out.println("During decrement value: " + --a);
                System.out.println("After decrement value: " + a);
                break;

            case "postDecrement":
                System.out.println("During decrement value: " + a);
                System.out.println("During decrement value: " + a--);
                System.out.println("During decrement value: " + a);

            default:
                System.out.println("Please write \"postDecrement\" or \"preDecrement\" in the input!");
                break;
        }
    }
}
