package array;

import java.util.Arrays;

public class Q16 {
    public int findDifference(int[] arr) {
        if (arr.length == 0)
            return -1;
        if (arr.length == 1)
            return arr[0];
        Arrays.sort(arr);
        return (arr[arr.length - 1] - arr[0]);
    }
}
