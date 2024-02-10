package Interface;

interface Interface2{
    public void func1();
    public void func2();
}


/*
 *  We cannot call a method without implementing another method.
 *  Every abstract method should be implemented before calling a method.
 *  Or it will give a compilation error.
 */


// public class Q2 implements Interface2 {
//     @Override
//     public void func1(){
//         System.out.println("Hello World!");
//     }
// }
