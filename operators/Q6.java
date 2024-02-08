package operators;

public class Q6 {
    public void relationalOperators(int a, int b) {
        if (a > b)
            System.err.printf("%d is greater than %d\n", a, b);
        if (a >= b)
            System.out.printf("%d is greater than or equal to %d\n", a, b);
        if (a < b)
            System.out.printf("%d is less than %d\n", a, b);
        if (a <= b)
            System.out.printf("%d is less than or equal to %d\n", a, b);
    }
}
