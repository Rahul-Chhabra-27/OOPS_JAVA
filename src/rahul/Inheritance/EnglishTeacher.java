package rahul.Inheritance;

final class EnglishTeacher extends Teacher {
    long rating;
    EnglishTeacher() {
        this.rating = 0;
    }
    EnglishTeacher(String name,int age,String favSubject,long rating) {
        super(name,age,favSubject);
        this.rating = rating;
    }
    @Override
    void greet() {
        System.out.println("Hii, I'm " + name);
    }
}
