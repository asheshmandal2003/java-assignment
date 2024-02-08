package loop;

public class Q13 {
    public void largestNum(int num1, int num2, int num3){
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Number 1 is the largest!");
            }
            else{
                System.out.println("Number 3 is the largest!");
            }
        }
        else {
            if (num2 > num3) {
                System.out.println("Number 2 is the largest!");
            }
            else{
                System.out.println("Number 3 is the largest!");
            }
        }
    }
}
