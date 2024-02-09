package array;

import java.util.ArrayList;

/**
 * Q11
 */
public class Q11 {

    public void findMatchingElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j])
                    list.add(arr1[i]);
            }
        }
        System.out.println(list);
    }
}