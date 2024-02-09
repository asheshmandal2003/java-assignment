package array;

public class Q15 {
    public int oddCount(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if ((i & 1) == 1)
                count++;
        }
        return count;
    }

    public int evenCount(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if ((i & 1) == 0)
                count++;
        }
        return count;
    }
}
