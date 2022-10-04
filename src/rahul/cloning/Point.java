package rahul.cloning;

public class Point implements Cloneable {
    double x;
    double y;
    // Copy Constructor.......
    public Point(Point obj) {
        x = obj.x;
        y = obj.y;
    }
    // Constructor Overloading....
    public Point(double x,double y) {
        this.x = x;
        this.y = y;
    }

    // clone method of cloneable interface...
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
