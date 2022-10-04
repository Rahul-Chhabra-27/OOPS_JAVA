package rahul.Inheritance;

public class Teacher extends Employee{
    String favSubject;
    Teacher() {
        this.favSubject = "";
   }

    Teacher(String name,int age,String favSubject) {
        super(name,age);
        this.favSubject = favSubject;
    }
    @Override
    void greet() {
        System.out.println("Hii, I'm a " + this.name);
    }

}
