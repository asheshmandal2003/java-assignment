package exception;

import error.CustomException;

public class Q5 {
    public void throwCustomException() throws CustomException {
        throw new CustomException("It's a custom message!");
    }
}
