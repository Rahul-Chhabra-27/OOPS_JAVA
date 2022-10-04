package rahul.Polymorphism;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.area();
        Shape circle = new Circle();
        circle.area();
        System.out.println(circle.name);
        Shape triangle = new Triangle();
        System.out.println(triangle.name);
        triangle.area();


    }
}
