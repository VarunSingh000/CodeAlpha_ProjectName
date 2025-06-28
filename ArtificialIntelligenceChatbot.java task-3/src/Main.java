import java.util.Scanner;

class SimpleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("🤖 Hello! I'm ChatBot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = scanner.nextLine().toLowerCase();

            if (input.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day!");
                break;
            } else if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello there!");
            } else if (input.contains("how are you")) {
                System.out.println("Bot: I'm just a program, but I'm running fine!");
            } else if (input.contains("your name")) {
                System.out.println("Bot: I'm a simple Java chatbot.");
            } else if (input.contains("help")) {
                System.out.println("Bot: I can answer greetings, tell my name, and respond to 'how are you'.");
            } else {
                System.out.println("Bot: Sorry, I didn't understand that.");
            }
        }
    }
}