package rahul.Threads;

public class Threads {
    public static void main(String[] args) {
        System.out.println("Rahul Chhabra");
        Cooking cooking = new Cooking("Cooking");
        Chatting chatting = new Chatting("Chatting");
        cooking.start();
        chatting.start();
        System.out.println(cooking.getName() + " thread id is " + cooking.getId());
        System.out.println(chatting.getName() + " thread id is " + chatting.getId());
    }
}
