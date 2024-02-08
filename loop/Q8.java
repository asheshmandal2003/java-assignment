package loop;

public class Q8 {
    private int len(int num, int length) {
        if (num == 0) {
            return length;
        }
        return len(num / 10, length + 1);
    }

    private boolean checkArmstrongNo(int num, int sum, int temp) {
        if (num == 0) {
            return sum == temp;
        }
        return checkArmstrongNo(num / 10, sum + (int) (Math.pow(num % 10, len(temp, 0))), temp);
    }

    public void isArmstrongNo(int num) {
        if (checkArmstrongNo(num, 0, num))
            System.out.println("Armstrong No!");
        else
            System.out.println("Not an armstrong no!");
    }
}
