package array;

import java.util.Arrays;

public class Q4 {
    private boolean binarySerach(int[] arr, int lb, int ub, int target) {
        if (lb > ub)
            return false;
        int mid = lb + (ub - lb) / 2;
        if (arr[mid] == target)
            return true;
        else if (arr[mid] > target)
            return binarySerach(arr, lb, mid - 1, target);
        return binarySerach(arr, mid + 1, ub, target);
    }

    public boolean contains(int[] arr, int target) {
        Arrays.sort(arr);
        return binarySerach(arr, 0, arr.length - 1, target);
    }
}
