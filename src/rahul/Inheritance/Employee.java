package rahul.Inheritance;

public class Employee {
    final String name;
    int age;
    Employee() {
        this.name = "";
        this.age = 0;
    }
    Employee(String name,int age) {
        this.name = name;
        this.age = age;
    }
    String  getName() { return this.name; }
    int getAge() { return this.age; }
     void greet() {
        System.out.println("Hello, my name is " + this.name);
    }
    static void getMe() {
        System.out.println("Hello its Me");
    }
}
