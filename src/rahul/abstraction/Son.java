package rahul.abstraction;

import java.sql.SQLOutput;

public class Son extends Parent {

    @Override
    void career() {
        System.out.println("I choose coder as a career");
    }

    @Override
    void partner() {
        System.out.println("I love Iron Man");
    }
}
