package constructor;

/*
 *  Constructor doesn't require any return type.
 *  If we provide any return type then it will be identified as a method.
 *  And will give an error - "This method has a same constructor name."
 */

public class Q4 {
    public int Q4() {
        return 10;
    }

    public String Q4() {
        return "Ashesh Mandal";
    }
}
