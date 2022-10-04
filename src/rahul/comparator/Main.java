package rahul.comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("abhi",1,50));
        students.add(new Student("aditya",2,99));
        students.add(new Student("amit",3,99));
        students.add(new Student("rahul",5,40));
        students.add(new Student("atul",4,99));
        System.out.println(students);
        //Collections.sort(students);
        Collections.sort(students,(a,b) -> {
            if(a.marksObtained > b.marksObtained) return 1;
            else if(a.marksObtained == b.marksObtained) return a.name.compareTo(b.name);
            else return -1;
        });
        System.out.println(students);
    }
}
