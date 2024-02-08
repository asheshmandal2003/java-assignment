package loop;

public class Q6 {
    public void printEvenBetween1to100() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }
}
