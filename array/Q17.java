package array;

import java.util.Arrays;

public class Q17 {
    private boolean doesContain12(int[] arr, int lb, int ub) {
        if (lb > ub)
            return false;
        int mid = lb + (ub - lb) / 2;
        if (arr[mid] == 12)
            return true;
        else if (arr[mid] > 12)
            return doesContain12(arr, lb, mid - 1);
        return doesContain12(arr, mid + 1, ub);
    }

    private boolean doesContain23(int[] arr, int lb, int ub) {
        if (lb > ub)
            return false;
        int mid = lb + (ub - lb) / 2;
        if (arr[mid] == 23)
            return true;
        else if (arr[mid] > 23)
            return doesContain23(arr, lb, mid - 1);
        return doesContain23(arr, mid + 1, ub);
    }

    public boolean doesContain12And23(int[] arr) {
        Arrays.sort(arr);
        boolean have12 = doesContain12(arr, 0, arr.length - 1);
        boolean have23 = doesContain23(arr, 0, arr.length - 1);
        if (have12 && have23)
            return true;
        return false;
    }
}
