package array;

import java.util.Arrays;

public class Q13 {
    public int secondLargestElement(int[] arr) {
        if (arr.length == 0)
            return -1;
        Arrays.sort(arr);
        if (arr.length == 1)
            return arr[0];
        return arr[arr.length - 2];
    }
}
