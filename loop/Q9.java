package loop;

public class Q9 {
    private boolean checkPrime(int num, int checker) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (checker == (int) num / 2) {
            return true;
        }
        if (num % checker == 0) {
            return false;
        }
        return checkPrime(num, checker + 1);
    }

    public void isPrime(int num) {
        if (checkPrime(num, 2))
            System.out.println("Prime no!");
        else
            System.out.println("Not a prime no!");
    }
}
