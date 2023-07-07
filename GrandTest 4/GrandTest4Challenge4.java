/*Challenge-4: 

You are creating a program to keep track of a list of tasks for a project. Each task has a unique ID, a name, a description, a due date, and a status (e.g. "in progress", "completed", "overdue"). You decide to use a HashSet to store the task IDs, and you need to implement some functionality for adding and removing tasks from the list, as well as updating the status of a task. Write a Java program that implements the following: 

1. Add Task 

2. Remove Task 

3. Update status of Task 

4. Display all the Tasks 

5. Display "in progress" Tasks 

6. Display "completed" tasks 

7. Display "overdue" tasks */

import java.util.*;
class InvalidTaskException1 extends Exception{
  InvalidTaskException1(String msg){
    super(msg);
  }
}
class Task1{
  private int id;
  private String name;
  private String description;
  private String duedate;
  private String status;
 public  Task1(int id,String name,String description,String duedate,String status){
   this.id=id;
   this.name=name;
   this.description=description;
   this.duedate=duedate;
   this.status=status;
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
    public String getdueDate() {
        return duedate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
class TaskExample {
    private HashSet<Integer> taskIds=new HashSet<Integer>();
    private ArrayList<Task1> tasks=new ArrayList<>();
    public void addTask(Task1 task) {
      
        if (!taskIds.contains(task.getId())) {
            taskIds.add(task.getId());
            tasks.add(task);
            System.out.println("Task added successfully.");
        } else {
            System.out.println("Task with the same ID already exists.");
        }
      
      
    }

 

    public void removeTask(int taskId) {
        Iterator<Task1> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task1 task = iterator.next();
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
        for (Task1 task : tasks) {
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
        for (Task1 task : tasks) {
            displayTask(task);
        }
    }


   public void displayTasksByStatus(String status) {
  System.out.println(status + " Tasks:");
        for (Task1 task : tasks) {
          try{
            if (!task.getStatus().equalsIgnoreCase(status)) {
              throw new InvalidTaskException1("task is invalid");
            }
            else{
                displayTask(task);
            }
          }
          catch(InvalidTaskException1 e){
            System.out.println(e.getMessage());
          }
        }
    }

 

    private void displayTask(Task1 task) {
        System.out.println("ID: " + task.getId());
        System.out.println("Name: " + task.getName());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Due Date: " + task.getdueDate());
        System.out.println("Status: " + task.getStatus());
        System.out.println();
    }
}
public class GrandTest4Challenge4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    TaskExample ts=new TaskExample();
    System.out.println("enter the Task details to add");
    System.out.println("enter the id ");
    int id=sc.nextInt();
    System.out.println("enter the name");
    sc.nextLine();
    String name=sc.nextLine();
    System.out.println("enter the due date");
    String duedate=sc.nextLine();
    System.out.println("enter the description");
    
    String description=sc.nextLine();
    System.out.println("enter the status");
    sc.nextLine();
    String status=sc.nextLine();
    Task1 task=new Task1(id,name,duedate,description,status);
    ts.addTask(task);
    System.out.println("enter the id to remove");
    int taskId=sc.nextInt();
    ts.removeTask(taskId);
    System.out.println("enter the id and status to update the status");
    int id1=sc.nextInt();
    String status1=sc.nextLine();
    ts.updateTaskStatus(id,status1);
    ts.displayAllTasks();
    System.out.println("Enter the status to dispaly");
    String status2=sc.nextLine();
    ts.displayTasksByStatus(status2);
    
  }
  
}
