package Interface;

/**
 * Interface1
 */
interface Interface1 {
    public void method();
}

public class Q1 implements Interface1{
    @Override
    public void method(){
        System.out.println("Hello World!");
    }
}
