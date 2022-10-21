package rahul.abstraction;

public class Main {
    public static void main(String[] args) {
        Parent son = new Son();
        Daughter daughter = new Daughter(500);
        System.out.println(daughter.SIZE + " " + Daughter.HASHCODE);

        Son s1 = new Son();
//        son.career();
//        son.partner();
//        System.out.println(son.SIZE);
//        System.out.println(Parent.HASHCODE);
    }
}
