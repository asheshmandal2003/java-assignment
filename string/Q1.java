package string;

public class Q1 {
    String str1 = "Created using string literal";
    String str2 = new String("Created using new keyword");
    StringBuilder sBuilder = new StringBuilder().append("Created using StringBuilder");

    public void printStrings() {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(sBuilder);
    }
}
