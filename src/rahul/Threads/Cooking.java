package rahul.Threads;

public class Cooking extends Thread {
    @Override
    public void run() {
        int count = 0;
        while(count < 40000) {
            System.out.println("Cooking Thread is Running");
            count++;
        }
    }
}
