package array;

public class Q3 {
    private int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public void indexOf(int[] arr, int target) {
        if (find(arr, target) == -1) {
            System.out.println("Element doesn't exist!");
            return;
        }
        System.out.println(find(arr, target));

    }
}
