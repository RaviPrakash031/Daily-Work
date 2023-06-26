import java.util.ArrayList;
class Employee11 {
private String name;
private int age;
private double salary;
public Employee11(String name, int age, double salary) {
this.name = name;
this.age = age;
this.salary = salary;
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
public double getSalary() {
return salary;
}
}

 

public class EmployeeCollectionMethods1 {

  public static void main(String[] args) {

    ArrayList<Employee11> employees = new ArrayList<Employee11>();

 

    // Creating employee objects

    Employee11 emp1 = new Employee11("ravi", 30, 50000.0);

    Employee11 emp2 = new Employee11("prasad", 35, 60000.0);

    Employee11 emp3 = new Employee11("chaitanya", 28, 45000.0);

 

    // Adding employees to the ArrayList

    employees.add(emp1);

    employees.add(emp2);

    employees.add(emp3);


    // Accessing employee details



for (int i = 0; i < employees.size(); i++) {

    Employee11 emp = employees.get(i);

    System.out.println("Name: " + emp.getName());

    System.out.println("Age: " + emp.getAge());

    System.out.println("Salary: " + emp.getSalary());

    System.out.println();

}

 

//Accessing employee details-another way

   for (Employee11 emp : employees) {

      System.out.println("Name: " + emp.getName());

      System.out.println("Age: " + emp.getAge());

      System.out.println("Salary: " + emp.getSalary());

      System.out.println();

    }

  }

}