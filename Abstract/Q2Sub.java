package Abstract;

/*
 *  Key things to note:-
 *  We cannot use Q2Sub without implementing the func1() method.
 *  We cannot instantiate an abstract class.
 */

public class Q2Sub extends Q2 {
    @Override
    public void func1() {
        System.out.println("Hello 1");
    }

    public void demo() {
        Q2 q2 = new Q2Sub();
        q2.func2();
    }

}
