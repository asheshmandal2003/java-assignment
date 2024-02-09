package array;

public class Q1 {
    public int[] push(int[] arr, int num) {
        int newArrLen = arr.length + 1;
        int[] newArr = new int[newArrLen];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[i];
        newArr[newArr.length - 1] = num;
        return newArr;
    }
}
