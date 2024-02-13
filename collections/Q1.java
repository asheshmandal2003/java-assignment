package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q1 {
    public void ArrayListOperatios(Scanner scanner) {
        System.out.printf("\t\t\tArrayList\t\t\t\n");
        try {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                System.out.print("Add a string: ");
                list.add(scanner.next());
            }
            System.out.println(list);

            list.add("My custom entry");
            System.out.println(list);

            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();

            list.add(0, "Ashesh Mandal");
            System.out.println(list);

            list.remove(0);
            System.out.println(list);

            list.set(0, "Hello");
            System.out.println(list);

            System.out.print("Enter the index you want to query: ");
            int desiredIdx = scanner.nextInt();
            System.out.print("Enter the value of that index: ");
            String desiredElement = scanner.next();
            if (list.get(desiredIdx).equals(desiredElement)) {
                System.out.println("Element found!");
            } else {
                System.out.println("Not found!");
            }

            System.out.println(list.get(0));

            System.out.println(list.size());

            System.out.print("Enter the query value: ");
            String value = scanner.next();
            System.out.println(list.contains(value));

            list.removeAll(list);
            System.out.println(list);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
