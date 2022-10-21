package rahul.Threads;

public class Threads {
    public static void main(String[] args) {
        System.out.println("Rahul Chhabra");
        Cooking cooking = new Cooking();
        Chatting chatting = new Chatting();
        cooking.start();
        chatting.start();
    }
}
