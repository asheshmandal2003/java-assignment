package constructor;

import java.math.BigInteger;

public class Q3 {
    public Q3() {
        System.out.println("This constructor has default access.");
    }

    Q3(String fullName) {
        System.out.println("Fullname: " + fullName);
    }

    protected Q3(BigInteger phoneNum) {
        System.out.println("Phone No: " + phoneNum);
    }

    private Q3(String password, String token) {
        System.out.printf("Password: %s, Token: %s\n", password, token);
    }

    public void setPassAndToken(String password, String token) {
        Q3 q3 = new Q3(password, token);
    }
}
