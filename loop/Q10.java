package loop;

public class Q10 {
    private boolean checker(int num, int newNum, int temp) {
        if (num == 0)
            return temp == newNum;
        return checker(num / 10, (newNum * 10) + (num % 10), temp);
    }

    public void isChecker(int num) {
        if (checker(num, 0, num)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}
