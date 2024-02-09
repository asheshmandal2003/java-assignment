package array;

public class Q5 {
    public int[] delete(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (j >= newArr.length) {
                return arr;
            }
            if (arr[i] == element)
                continue;
            else
                newArr[j++] = arr[i];
        }
        return newArr;
    }

}
