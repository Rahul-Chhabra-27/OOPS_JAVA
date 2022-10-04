package rahul.abstraction;

public class Daughter extends Parent {
    Daughter(int value) {
        this.SIZE = value;
        Parent.HASHCODE = value;
    }
    @Override
    void career() {
        System.out.println("I choose doctor as a career");
    }

    @Override
    void partner() {
        System.out.println("I love Jon deep");
    }
}
