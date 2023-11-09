package session_31javaCoreRecap;

public class GreetingCardTemplate {

    public static void main(String[] args) {
        String recipient = "Emily";
        String occasion = "Birthday";
        String sender = "John";

        System.out.println("Dear %s, Happy %s! Best wishes, %s.%n".formatted(recipient, occasion, sender));
    }
}
