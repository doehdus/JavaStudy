import java.util.Scanner;

// Define command types
enum Command {
    EXIT, HELP, HISTORY, LIST, RERUN, INVALID, SNIPPET
}

public class Project11 {

    // Convert input to a command
    static Command getCommand(String input) {
        switch (input) {
            case "/exit":
                return Command.EXIT;
            case "/help":
                return Command.HELP;
            case "/history":
                return Command.HISTORY;
            case "/list":
                return Command.LIST;
            case "/!":
                return Command.RERUN;
            default:
                if (input.startsWith("/")) {
                    return Command.INVALID;
                }
                return Command.SNIPPET;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] history = new String[10];
        String[] list = new String[200];

        int historyCount = 0;
        int listCount = 0;
        boolean jshell = true;

        while (jshell) {
            System.out.print("jshell> ");
            String input = sc.nextLine();

            // Save command history
            history[historyCount] = input;
            historyCount++;

            if (historyCount == 10) {
                System.out.println(
                        "The history buffer is cleared."
                );
                historyCount = 0;
            }

            // Convert input to enum
            Command command = getCommand(input);

            switch (command) {
                case EXIT:
                    System.out.println("Goodbye.");
                    jshell = false;
                    break;

                case HELP:
                    System.out.println(
                            "Type a Java language expression, statement, or declaration."
                    );
                    System.out.println(
                            "Or type one of the following commands:"
                    );
                    System.out.println(
                            "/list: list the source you have typed."
                    );
                    System.out.println(
                            "/exit: exit the jshell tool"
                    );
                    System.out.println(
                            "/history: history of what you have typed."
                    );
                    System.out.println(
                            "/!: rerun last snippet."
                    );
                    break;

                case HISTORY:
                    // Print history using for-each
                    for (String h : history) {
                        if (h != null) {
                            System.out.println(h);
                        }
                    }
                    break;

                case LIST:
                    // Print saved snippets
                    int number = 1;

                    for (String item : list) {
                        if (item != null) {
                            System.out.println(
                                    number + ": " + item
                            );
                            number++;
                        }
                    }
                    break;

                case RERUN:
                    if (listCount > 0) {
                        System.out.println(
                                "Re-running '" +
                                        list[listCount - 1] + "'."
                        );
                    }
                    break;

                case INVALID:
                    System.out.println(
                            "Invalid command: " + input
                    );
                    System.out.println(
                            "Type /help for help."
                    );
                    break;

                case SNIPPET:
                    System.out.println(
                            "Running '" + input + "'."
                    );

                    if (listCount < list.length) {
                        list[listCount] = input;
                        listCount++;
                    }
                    break;
            }
        }

        sc.close();
    }
}
