package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19 {
    public void findMissingNums(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++)
            list.add(i);

        Arrays.sort(arr);
        int count = 0;
        for (int i = 1; i <= arr.length; i++) {
            list.remove(arr[i-1] - count - 1);
            count++;
        }

        System.out.println(list);
    }
}
