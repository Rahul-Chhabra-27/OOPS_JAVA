package rahul.access;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Parent("Parent");
        Parent parent = new Child("Rahul");
        obj.greet();
        parent.greet();
    }
}
