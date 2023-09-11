package TaskListApp.Domain;

import java.util.HashSet;
import java.util.Set;

public class TaskList {
    private Set<Task> taskSet;

    public TaskList() {
        this.taskSet = new HashSet<>();
    }

    public void addTask(String description) {
        Task t = new Task(description);
        taskSet.add(t);
    }

    public void removeTask (String description){
        Task task2Remove = null;
        for (Task t : taskSet){
            if (t.getDescription().equalsIgnoreCase(description)){
                task2Remove = t;
                break;
            }
        }
        taskSet.remove(task2Remove);
    }

    public void displayTasks(){
        System.out.println(taskSet);
    }

    public int countTasks(){
        return taskSet.size();
    }

    public Set<Task> getTheConcludeTasks(){
        Set<Task> doneTasks = new HashSet<>();
        for (Task t : taskSet){
            if (t.isDone()){
                doneTasks.add(t);
            }
        }
        return doneTasks;
    }

    public Set<Task> getPendingTasks(){
        Set<Task> pendingTasks = new HashSet<>();
        for (Task t : taskSet){
            if (!t.isDone()){
                pendingTasks.add(t);
            }
        }
        return pendingTasks;
    }

    public void markTaskAsDone(String description){
        for (Task t : taskSet){
            if (t.getDescription().equalsIgnoreCase(description)){
                t.setDone(true);
            }
        }
    }

    public void markTaskAsPending(String description){
        for (Task t : taskSet){
            if (t.getDescription().equalsIgnoreCase(description)){
                t.setDone(false);
            }
        }
    }

    /*public void markTaskAsPending(String description){
        Task task2MarkAsPending = null;

        for (Task t : taskSet){
            if (t.getDescription().equalsIgnoreCase(description)){
                task2MarkAsPending = t;
                break;
            }
        }

        if (task2MarkAsPending != null){
            task2MarkAsPending.setDone(true);
        } else {
            System.out.println("Task not found!");
        }
    }*/

    public void clearTaskList(){
        taskSet.clear();
    }

}
