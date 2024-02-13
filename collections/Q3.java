package collections;

import java.util.HashSet;
import java.util.Scanner;

public class Q3 {
    public void hashSet(Scanner scanner) {
        System.out.printf("\t\t\tHashSet\t\t\t\n");
        HashSet<String> hashSet = new HashSet<>();

        String[] fruits = new String[] { "Apple", "Mango", "Banana", "Orange", "Litchi", "Pineapple", "Watermelon",
                "Grape" };

        for (String fruit : fruits) {
            hashSet.add(fruit);
        }

        System.out.println("HashSet: " + hashSet);

        System.out.print("Enter the query string: ");
        String value = scanner.next();
        if (hashSet.contains(value)) {
            System.out.println("Element present");
        } else {
            System.out.println("Element doesn't exists!");
        }

        System.out.print("Enter the value you want to remove: ");
        value = scanner.next();
        if (hashSet.contains(value)) {
            hashSet.remove(value);
            System.out.println("New HashSet: " + hashSet);
        } else {
            System.out.println("Element doesn't exists!");
        }

        System.out.println("HashSet size " + hashSet.size());

        hashSet.removeAll(hashSet);
        System.out.println("All elements are removed!");
        System.out.println(hashSet);

    }
}
