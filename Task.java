public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description){
        this.description = description;
        boolean isCompleted = false;
    } // constructor

    public void markComplete(){
        this.isCompleted = true;
    }

    public String getDescription(){
        return description;
    }

    public boolean getIsCompleted(){
        return isCompleted;
    }

    @Override
    public String toString(){
        return description;
    }

}
