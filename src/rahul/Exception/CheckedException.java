package rahul.Exception;

public class CheckedException {
    int divide(int a,int b) throws Exception {
        if(b == 0) {
            throw new Exception("Cannot divide with zero..");
        }
        else {
            return a / b;
        }
    }
}
