package Interface;

interface Interface3 {
    public void hello();
}

public class Q3 implements Interface3 {
    @Override
    public void hello() {
    }

    public void call() {
        Interface3 interface3 = new Interface3() {
            @Override
            public void hello() {
                System.out.println("Hello World!");
            }
        };
        interface3.hello();
    }
}
