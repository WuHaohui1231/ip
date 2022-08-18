import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello! I'm Duke\n" +
                "What can I do for you?");
        TaskList taskList = new TaskList();

        while (true) {
            String input = myObj.nextLine();  // Read user input
            if (input.equals("bye")) {
                System.out.println("Bye. Hope to see you again soon!");
                break;
            } else if (input.equals("list")) {
                taskList.printTasks();
                continue;
            } else if (input.substring(0,4).equals("mark")) {
                continue;
            }
            taskList.addTask(input);
        }

    }
}
