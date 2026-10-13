import java.util.Scanner;

public class Project1 {
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

            if (jshell) {
                history[historyCount] = input;
                historyCount++;

                if (historyCount == 10) {
                    System.out.println("The history buffer is cleared.");
                    historyCount = 0;
                }
            }

            switch (input) {
                case "/exit":
                    System.out.println("Goodbye.");
                    jshell = false;
                    break;

                case "/help":
                    System.out.println("Type a Java language expression, statement, or declaration.");
                    System.out.println("Or type one of the following commands:");
                    System.out.println("/list: list the source you have typed.");
                    System.out.println("/exit: exit the jshell tool");
                    System.out.println("/history: history of what you have typed.");
                    System.out.println("/!: rerun last snippet.");
                    break;

                case "/history":
                    for (int i = 0; i < historyCount; i++) {
                        System.out.println(history[i]);
                    }
                    break;

                case "/list":
                    for (int i = 0; i < listCount; i++) {
                        System.out.println((i + 1) + ": " + list[i]);
                    }
                    break;

                case "/!":
                    if (listCount > 0) {
                        System.out.println("Re-running '" + list[listCount - 1] + "'.");
                    }
                    break;

                    default:
                    if (input.startsWith("/")) {
                        System.out.println("Invalid command: " + input);
                        System.out.println("Type /help for help.");
                    } else {
                        System.out.println("Running '" + input + "'.");
                        if (listCount < list.length) {
                            list[listCount] = input;
                            listCount++;
                        }
                    }
                    break;
            }
        }

        sc.close();
    }
}
