package loop;

public class Q12 {
    public void printGender(char key) {
        switch (key) {
            case 'M':
                System.out.println("Male");
                break;
            case 'F':
                System.out.println("Female");
                break;

            default:
                System.out.println("Type \"M\" or \"F\"");
                break;
        }
    }
}
