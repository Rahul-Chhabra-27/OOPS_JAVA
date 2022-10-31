package rahul.Exception;

public class Arithmetic {
    static int add(int a,int b) {
        return a + b;
    }
    static int subtract(int a,int b) {
        return a - b;
    }
    static int multiply(int a,int b) {
        return a * b;
    }
    int divide(int a,int b) throws ArithmeticException {

        // base case
        if(b == 0) {
            throw new ArithmeticException("Cannot divide with zero..");
        }
        else {
            return a/b;
        }
    }
}
