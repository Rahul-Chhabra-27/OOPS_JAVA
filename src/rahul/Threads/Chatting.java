package rahul.Threads;

public class Chatting extends Thread {
    Chatting(String name) { super(name); }
    @Override
    public void run() {
        int count = 0;
        while(count < 40) {
            System.out.println("Chatting Thread is Running.");
            count++;
        }
    }
}
