package rahul.Threads;


class Chatting1 implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while(count < 40000) {
            System.out.println("Chatting Thread is Running.");
            count++;
        }
    }
}
class Cooking1 implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while(count < 40000) {
            System.out.println("Cooking Thread is Running");
            count++;
        }
    }
}
public class Runnable1 {
    public static void main(String[] args) {
        Cooking1 ck1 = new Cooking1();
        Chatting1 ch1 = new Chatting1();
        Thread chattingThread = new Thread(ch1);
        Thread cookingThread = new Thread(ck1);
        chattingThread.start();
        cookingThread.start();
    }
}