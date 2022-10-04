package rahul.cloning;

import java.sql.SQLOutput;

public class Main {
    private static Point p = new Point(1.0,2.0);
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(1.0,2.0);
        Point point2 = new Point(point);
        Point point3 = (Point) point.clone();
        System.out.println(point.x + " " + point.y);
        System.out.println(point2.x + " " + point2.y);
        System.out.println(point3.x + " " + point3.y);
        System.out.println(point instanceof Point);
        System.out.println("" instanceof  String);
        int a = 10;
        System.out.println(Integer.valueOf(a) instanceof Number);
        System.out.println(Double.valueOf(1.4) instanceof  Double);
        Integer x = a;
        System.out.println(x instanceof Integer);
    }
}
