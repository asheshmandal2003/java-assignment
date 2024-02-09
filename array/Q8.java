package array;

import java.util.Arrays;

public class Q8 {
    public void findMinAndMax(int[] arr) {
        Arrays.sort(arr);
        System.out.printf("Min Element: %d\n", arr[0]);
        System.out.printf("Max Element: %d\n", arr[arr.length - 1]);
    }
}
