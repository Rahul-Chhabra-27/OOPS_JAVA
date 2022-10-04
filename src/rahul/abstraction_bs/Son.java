package rahul.abstraction_bs;

public class Son extends Parent{
    String name;
    String dish;
    final int rate;
    final void normal() {
        System.out.println("Inside son");
        super.normal();
    }
     Son(String name,String dish) {
        this.name = name;
        this.dish = dish;
        this.rate = 10;
    }
    void eat(){
        System.out.println(name + " is eating " + dish);
    }
    void breathe(){
        System.out.println(name + " is breathing at a rate of " + rate);
    }
}
