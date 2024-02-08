package loop;

public class Q4 {
    public void printEvens(int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            for (int i = lowerBound; i <= upperBound; i++) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
        } else if (lowerBound > upperBound) {
            for (int i = lowerBound; i >= upperBound; i--) {
                if (i % 2 == 0)
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void printOdds(int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            for (int i = lowerBound; i <= upperBound; i++) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
            }
        } else if (lowerBound > upperBound) {
            for (int i = lowerBound; i >= upperBound; i--) {
                if (i % 2 != 0)
                    System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
