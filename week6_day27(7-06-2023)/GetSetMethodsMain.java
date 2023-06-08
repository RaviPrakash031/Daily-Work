import java.util.Scanner;

class Employee2{
  String name;
  int id;
  double salary;
  public void setName(String name){
    this.name=name;
  }
  public void setId(int id){
    this.id=id;
  }
  public void setSalary(double salary){
    this.salary=salary;
  }
  public String getName(){
    return name;
  }
  public int getId(){
    return id;
  }
  public double getSalary(){
    return salary;
  }
}
public class GetSetMethodsMain{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Employee2 emp=new Employee2();
    
    
    
    System.out.println("enter the name of emplyee  ");
    String name=sc.nextLine();
    System.out.println("enter tha id of employee  ");
    int id=sc.nextInt();
    System.out.println("enter tha salary");
    Double salary=sc.nextDouble();
    
    
    
    emp.setName(name);
    emp.setId(id);
    emp.setSalary(salary);
    System.out.println("Employee name is "+emp.getName());
    System.out.println("Employee id is "+emp.getId());
    System.out.println("Employee salary is "+emp.getSalary());
  }
}