package rahul.Exception;

public class Main {

    public static void main(String[] args) {
         CheckedException obj = new CheckedException();
         try{
             obj.divide(5,0);
         }
         catch(ArithmeticException e) {
             e.printStackTrace();
         }
         catch(Exception e) {
             System.out.println(e.getMessage());
         }
         finally {
             System.out.println("end...../");
         }

//        Main m = new Main();
//        try {
//            String name = "Rahul";
//            if( name.equals("Rahul") ) {
//                throw new MyException("Name is Rahul, ok...");
//            }
//            int x = m.divide(10, 0);
//            System.out.println(x);
//        }
//        catch(NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//        catch(MyException e) {
//            System.out.println(e.getMessage());
//        }
//        catch(ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("This will always execute..");
//        }
    }
}
