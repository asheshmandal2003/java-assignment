package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10 {
    public void findDuplicates(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                duplicates.add(arr[i + 1]);
        }
        System.out.println(duplicates);
    }
}
