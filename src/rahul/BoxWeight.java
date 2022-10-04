package rahul;

public class BoxWeight extends Box {
    int weight;
    BoxWeight() {
        System.out.println("Inside BoxWeight Class");
        this.weight = -1;
    }

    BoxWeight(int weight) { this.weight = weight; }

    BoxWeight(double l, double h, double w, int weight){
        super(l,w,h);
        this.weight = weight;
    }
    void greet() {
        System.out.println("Hello from BoxWeight!");
    }
}
