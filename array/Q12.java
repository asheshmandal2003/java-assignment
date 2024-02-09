package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Q12 {
    public int[] removeDuplicate(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        if (arr.length == 1 || arr.length == 0)
            return arr;
        if (arr[0] == arr[1])
            list.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i])
                continue;
            else
                list.add(arr[i]);
        }
        int[] newArr = new int[list.size()];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = list.get(i);
        }
        return newArr;
    }
}
