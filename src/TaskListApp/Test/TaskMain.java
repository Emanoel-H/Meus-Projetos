package TaskListApp.Test;

import TaskListApp.Domain.TaskList;

public class TaskMain {
    public static void main(String[] args) {
        TaskList tl = new TaskList();

        tl.addTask("Drink Water");
        tl.addTask("Take creatine");
        tl.addTask("Boil the eggs");
        tl.addTask("Read the Bible");
        tl.addTask("Study NoSQL");
        tl.addTask("Study AWS");
        tl.addTask("Study Spring");

        tl.displayTasks();

        tl.removeTask("Boil the eggs");
        tl.displayTasks();

        System.out.println("Amount of tasks: " + tl.countTasks());

        System.out.println("These are the pending tasks: ");
        System.out.println(tl.getPendingTasks());


        tl.markTaskAsDone("Drink Water");
        tl.markTaskAsDone("Take creatine");
        tl.markTaskAsDone("Read the Bible");
        tl.displayTasks();

        System.out.println("These are the tasks that were done: ");
        System.out.println(tl.getTheConcludeTasks());

        tl.markTaskAsPending("Study NoSQL");
        tl.markTaskAsPending("Study AWS");
        tl.markTaskAsPending("Study Spring");
        tl.displayTasks();

        tl.clearTaskList();
        System.out.println(tl.countTasks());


    }
}
