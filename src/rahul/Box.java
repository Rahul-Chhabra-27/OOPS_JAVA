package rahul;

public class Box {
    double l;
    double h;
    double w;

    Box() {
        System.out.println("Inside Box Constructor 1");
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(double l,double w) {
        this.l = l;
        this.w = w;
    }
    Box(double l,double w,double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    void greet() {
        System.out.println("Hello from Box Class!");
    }
}
