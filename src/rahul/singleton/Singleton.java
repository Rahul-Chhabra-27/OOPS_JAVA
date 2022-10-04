package rahul.singleton;

public class Singleton {

    private static Singleton instanceOfAClass = null;
    String message = "";
    private Singleton() {
        message = "Instance of a singleton class is created.";
    }
    public static Singleton getInstance() {
        if(instanceOfAClass == null) {
            instanceOfAClass = new Singleton();
        }
        return instanceOfAClass;
    }
}
