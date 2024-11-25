import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the To-Do List Application");
        boolean running = true;

        while (running) {
            System.out.println("/nMenu: ");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");


            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the Task Description: ");
                    String description = input.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.displayTasks();
                    break;
                case 3:
                    System.out.println("Enter the Task Number To Mark as Completed: ");
                    int completed = input.nextInt() - 1;
                    toDoList.RemoveTask(completed);
                    break;
                case 4:
                    System.out.println("Enter the Task Number to Delete Task: ");
                    int removeTask = input.nextInt() - 1;
                    toDoList.RemoveTask(removeTask);
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid Option. Please try again.");
            }
        }
        input.close();
    }

}

