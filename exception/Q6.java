package exception;

import error.CustomException;

public class Q6 {
    public void vote(int age) throws CustomException {
    if (age < 18) {
        throw new CustomException("You're under age!");
    }else{
        System.out.println("Vote taken!");
    }
    }
}
