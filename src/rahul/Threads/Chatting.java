package rahul.Threads;

public class Chatting extends Thread {
    @Override
    public void run() {
        int count = 0;
        while(count < 40000) {
            System.out.println("Chatting Thread is Running.");
            count++;
        }
    }
}
