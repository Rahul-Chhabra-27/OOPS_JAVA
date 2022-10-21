package rahul.Strings;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String a = "rahul";
        String b = "rahul";
        String c = new String("rahul");
        String d = new String("          Rahul");
        System.out.println(d);
        System.out.println(a.equals(c) + " " + (a.intern() == b.intern()));
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println(c.toLowerCase());
        System.out.println(c.toUpperCase());
        System.out.println(c.contains("ul"));
        System.out.println(d.trim());
        String temp = "i,am,rahul,chhabra";
        System.out.println(temp);
        String values[] = temp.split(",");
        System.out.println(Arrays.toString(values) + " " + values.length);
        System.out.println(a.replace('r','R'));
        System.out.println(a.intern() == b.intern());
//        String temp = c.substring(1,2);
//        System.out.println(temp);
//        String x = c.toString();
//        String y = d.toString();
//        System.out.println(x == y);
//        System.out.println(a.equals(c));
    }
}
