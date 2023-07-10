/*You are creating a program to keep track of a list of tasks for a project. Each task has a unique ID, a name, a description, a due date, and a status (e.g. "in progress", "completed", "overdue"). You decide to use a HashSet to store the task IDs, and you need to implement some functionality for adding and removing tasks from the list, as well as updating the status of a task. Write a Java program that implements the following:
1. Add Task
2. Remove Task
3. Update status of Task
4. Display all the Tasks
5. Display "in progress" Tasks
6. Display "completed" tasks
7. Display "overdue" tasks*/

import java.util.*;
class InvalidTaskException extends Exception{
  InvalidTaskException(String msg){
    super(msg);
  }
}
class Task {
    private int id;
    private String name;
    private String description;
    private Date dueDate;
    private String status;
public Task(int id, String name, String description, Date dueDate, String status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Date getDueDate() {
        return dueDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
public class TaskManager {
    private HashSet<Integer> taskIds;
    private ArrayList<Task> tasks;

 

    public TaskManager() {
        taskIds = new HashSet<>();
        tasks = new ArrayList<>();
    }

 

    public void addTask(Task task) {
      
        if (!taskIds.contains(task.getId())) {
            taskIds.add(task.getId());
            tasks.add(task);
            System.out.println("Task added successfully.");
        } else {
            System.out.println("Task with the same ID already exists.");
        }
      
      
    }

 

    public void removeTask(int taskId) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == taskId) {
                iterator.remove();
                taskIds.remove(taskId);
                System.out.println("Task removed successfully.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

 

    public void updateTaskStatus(int taskId, String status) {
        for (Task task : tasks) {
            if (task.getId() == taskId) {
                task.setStatus(status);
                System.out.println("Task status updated successfully.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

 

    public void displayAllTasks() {
        System.out.println("All Tasks:");
        for (Task task : tasks) {
            displayTask(task);
        }
    }

 

    public void displayTasksByStatus(String status) {
        System.out.println(status + " Tasks:");
        for (Task task : tasks) {
          try{
            if (!task.getStatus().equalsIgnoreCase(status)) {
              throw new InvalidTaskException("task is invalid");
            }
            else{
                displayTask(task);
            }
          }
          catch(InvalidTaskException e){
            System.out.println(e.getMessage());
          }
        }
    }

 

    private void displayTask(Task task) {
        System.out.println("ID: " + task.getId());
        System.out.println("Name: " + task.getName());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Due Date: " + task.getDueDate());
        System.out.println("Status: " + task.getStatus());
        System.out.println();
    }

 

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

 

        // Add tasks
        Task task1 = new Task(1, "Task 1", "Description 1", new Date(), "in progress");
        Task task2 = new Task(2, "Task 2", "Description 2", new Date(), "completed");
        Task task3 = new Task(3, "Task 3", "Description 3", new Date(), "overdue");

 

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

 

        // Display all tasks
        taskManager.displayAllTasks();
      taskManager.displayTasksByStatus("in progress");
      taskManager.displayTasksByStatus("completed");
      taskManager.updateTaskStatus(1,"notcompleted");
    }
}