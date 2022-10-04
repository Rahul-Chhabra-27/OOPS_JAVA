package rahul.Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Teacher teacher = new Teacher("Teacher",30,"Maths");
        Employee teacher2 = new Teacher("Teacher2",30,"History");
        Employee egs = new EnglishTeacher("Radha",28,"biology",10);
        EnglishTeacher englishTeacher = new EnglishTeacher("englishTeacher",20,"english",10);
        teacher.greet();
        teacher2.greet();
        englishTeacher.greet();
        System.out.println(teacher2.getName());
        EnglishTeacher.getMe();
        egs.greet();
    }
}
