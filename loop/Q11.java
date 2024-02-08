package loop;

import java.util.Scanner;

public class Q11 {
    public void checkOddorEven(int num, Scanner scanner) {
        System.out.print("Enter the check type[\"odd\", \"even\"]: ");
        String check_type = scanner.next();

        switch (check_type) {
            case "odd":
                if (num % 2 != 0)
                    System.out.println(true);
                else
                    System.out.println(false);

                break;

            case "even":
                if (num % 2 == 0)
                    System.out.println(true);
                else
                    System.out.println(false);
                    break;
            default:
                System.out.println("Please type \"odd\" or \"even\" in the input!");
                break;
        }
    }
}
