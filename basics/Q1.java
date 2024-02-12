

/* Create a class
 * => A class is a blueprint of an object.
 */
class Demo {
    
}

public class Q1 {
    /* Create a method and it's signature
     * => A method is a block of code that performs a specific task when it is called.
     * => A signature is a unique identifier of a method which consists of method name and parameters. 
     *    Method signatures help JRE to differentiate methods and call the corrisponding function's code when it's called.
     */

    public static void func1(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        /* Create an object
         * => An object is an instance of a class
         */
        Demo d = new Demo();
    }
}