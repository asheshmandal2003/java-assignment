package SuperAndThis;

/*
 *  We can't initialize this() or super() inside of a method.
 *  this() and super() is only accessable inside of the construtor.
 */

public class Q6 {
    public void test() {
        this();
        super();
    }
}
