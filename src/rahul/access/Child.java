package rahul.access;

public class Child extends Parent {
    Child(String name){
        super(name);
    }
    @Override
    void greet() {
        System.out.println("Hii, I'm from Child Class");
    }
}
