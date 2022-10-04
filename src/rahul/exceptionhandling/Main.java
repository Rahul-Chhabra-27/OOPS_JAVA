package rahul.exceptionhandling;

public class Main {
    static int divide(int a,int b) throws ArithmeticException {
        if(b == 0) {
             throw new ArithmeticException("Please do not divide by zero");
        }
        else {
            return a/b;
        }
    }

    public static void main(String[] args) {
        try{
            divide(1,0);
            System.out.println("Inside try block");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally block executes every time");
        }
    }
}
