import java.util.Scanner;
import java.util.ArrayList;

public class James {
    public static void main(String[] args) {
        String greeting = "Hello Big Boy! I'm James \n"
                + "How can I assist you today? \n";
        String exitMessage = "Goodbye. Come back anytime! \n";

        System.out.println(greeting);

        Scanner scanner = new Scanner(System.in);
        String command;
        ArrayList<String> tasks = new ArrayList<>();

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("bye")) {
                break;
            } else if (command.equalsIgnoreCase("list")) {
                for (int i = 0; i < tasks.size(); i++) {
                    String task = String.format("%d. %s", (i + 1), tasks.get(i));
                    System.out.println(task);
                }
            } else {
                tasks.add(command);
                System.out.println("Task added: " + command + "\n");
            }
        }

        System.out.println(exitMessage);

        scanner.close();
    }
}

