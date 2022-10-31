package rahul.Threads.Priotries;

public class Running extends Thread {
    public Running(String name) {
        super(name);
    }
    @Override
    public void run() {
        int i = 0;
        while(++i < 40) {
            System.out.println(super.getName() + " Thread is Running...");
        }
    }
}
