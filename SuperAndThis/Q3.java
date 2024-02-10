package SuperAndThis;

/*
 *  We cannot call this() in this way, because it will call the constructor recursively in an infinite loop.
 */

public class Q3 {
    public Q3(){
        this();
    }
}
