package rahul.Threads.Priotries;

import rahul.Threads.Threads;

public class Main {
    public static void main(String[] args) {
        Running cooking = new Running("Cooking");
        Running sleeping = new Running("Sleeping");
        Running walking = new Running("Walking");
        cooking.setPriority(Thread.MAX_PRIORITY);
        sleeping.setPriority(Thread.NORM_PRIORITY);
        cooking.start();
        sleeping.start();
        walking.start();
    }
}
