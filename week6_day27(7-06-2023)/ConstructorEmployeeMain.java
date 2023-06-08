//Creating an employee class 
import java.util.Scanner;
class Employee{
  String name;
  int id;
  double salary;
  public Employee(String name ,int id,double salary ){
    this.name=name;
    this.id=id;
    this.salary=salary;
  }
  public void  details(){
    System.out.println("name is "+name );
    System.out.println("id is "+id);
    System.out.println("salary is"+salary);
  }
}
public class ConstructorEmployeeMain{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the name of emplyee  ");
    String name=sc.nextLine();
    System.out.println("enter tha id of employee  ");
    int id=sc.nextInt();
    System.out.println("enter tha salary");
    Double salary=sc.nextDouble();
    
    
    Employee e1=new Employee(name,id,salary);
    e1.details();
    
    
     
    Employee e2=new Employee(name,id,salary);
    e2.details();
    
    
    Employee e3=new Employee(name,id,salary);
    e3.details();
    
    
    
  }
}
    
    
    
    
    
    