package rahul.abstraction_bs;

public class Main {
    public static void main(String[] args) {
        Son son = new Son("Rahul","sushi");
        son.normal();
        Parent rahul = new Son("Rahul","burger");
        rahul.normal();
        rahul.breathe();
        rahul.eat();
       // rahul = son;
        Integer value = new Integer(10);
        System.out.println(son.hashCode() + " " + rahul.hashCode());
        System.out.println(son.equals(rahul) + " " + rahul.equals(son));
        System.out.println(value == 10);
    }
}
