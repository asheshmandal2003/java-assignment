import java.util.Scanner;

import collections.Q1;
import collections.Q2;
import collections.Q3;

public class Collections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q1 q1 = new Q1();
        q1.ArrayListOperatios(scanner);

        Q2 q2 = new Q2();
        q2.hashMap(scanner);

        Q3 q3 = new Q3();
        q3.hashSet(scanner);

        scanner.close();
    }
}
