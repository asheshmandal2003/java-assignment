package array;

public class Q7 {
    public int[] insert(int[] arr, int idx, int element) {
        if (idx >= arr.length)
            return arr;
        int[] newArr = new int[arr.length + 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (j == idx)
                newArr[j++] = element;
            newArr[j++] = arr[i];
        }
        return newArr;
    }
}
