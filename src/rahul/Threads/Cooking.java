package rahul.Threads;

public class Cooking extends Thread {
    Cooking(String name) { super(name); }
    @Override
    public void run() {
        int count = 0;
        while(count < 40) {
            System.out.println("Cooking Thread is Running");
            count++;
        }
    }
}
