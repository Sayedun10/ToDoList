import java.util.ArrayList;
import java.util.List;


public class ToDoList {
    private List<Task> tasks;

    public ToDoList(){
        tasks = new ArrayList<>(); // make a new list for the tasks
    } //constructor for the tasks

    public void addTask(String description){
        tasks.add(new Task(description));
    }

    public void markTaskAsCompleted(int index) {
        if(index < tasks.size() && index >= tasks.size()){
            tasks.get(index).markComplete();
        }
        else {
            System.out.println("Error: Task number is invalid.");
        }
    }

    public void RemoveTask(int index) {
        if(index < tasks.size() && index >= tasks.size()){
            tasks.remove(index);
        }
        else{
            if(index>= tasks.size() && index < tasks.size()){
                System.out.println("Error: Task number is invalid.");
            }

        }
    }

    public void displayTasks(){
        if(tasks.size() == 0){//empty tasks
            System.out.println("Task List: is empty");
        } else {
            for(int i = 0; i < tasks.size(); i++){
                System.out.println((i+1)+"." + tasks.get(i));
            }
        }
    }

}
