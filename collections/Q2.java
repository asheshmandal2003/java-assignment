package collections;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Q2
 */
public class Q2 {

    public void hashMap(Scanner scanner) {
        System.out.printf("\t\t\tHashMap\t\t\t\n");
        HashMap<String, String> map = new HashMap<>();
        map.put("A001", "Ashesh");
        map.put("A002", "Devayan");
        map.put("A003", "Arani");
        map.put("A004", "Arnab");
        map.put("A005", "Arka");

        System.out.println(map);

        System.out.print("Enter the query key: ");
        String key = scanner.next();
        if (map.containsKey(key)) {
            System.out.println(map.get(key));
        } else {
            System.out.println("Key doesn't exists!");
        }

        Object newHashMap = map.clone();
        System.out.println(newHashMap);

        System.out.print("Enter the query key: ");
        key = scanner.next();
        System.out.println(map.containsKey(key));

        System.out.print("Enter the query value: ");
        String value = scanner.next();
        System.out.println(map.containsValue(value));

        System.out.println("The map is empty?: " + map.isEmpty());

        System.out.println("Size of the map: " + map.size());

        System.out.println("All the keys of the map: " + map.keySet());

        System.out.println("All the values of the map" + map.values());

        System.out.print("Enter the query key: ");
        key = scanner.next();
        System.out.print("Enter the query value: ");
        value = scanner.next();
        if (map.containsKey(key) && map.containsValue(value)) {
            map.remove(key, value);
            System.out.println("Key-Value pair removed!");
        } else {
            System.out.println("Key-Value pair doesn't exists!");
        }

        HashMap<String, String> newMap = new HashMap<>();
        newMap.putAll(map);
        System.out.println(newMap);

    }
}