import java.util.Scanner;
class Person1{
  
  String name;
  String office;
  public Person1(String name,String office){
    this.name=name;
    
    this.office=office;
  }
  static void print(){
    System.out.println("Employee block");
  }
  public  void getEmpDetails(){
    System.out.println("employee name is "+name);
    
    System.out.println("office of employee is "+office);
  }
}
class TeamLeader1 extends Person1{
  double teamSalary;
  public TeamLeader1(String name,String office,double teamSalary){
  super(name,office);
  this.teamSalary=teamSalary;
    
  }
  void display(){
    System.out.println("employee details");
    
    super. getEmpDetails();
    System.out.println("teamleader is: "+teamSalary);
  }
}
  

class Manager1 extends Person1{
  double salary;
  
  public Manager1(String name,String office,double salary){
  super(name,office);
  this.salary=salary;
  }
  void manager1(){
    System.out.println("manager details");
    super. getEmpDetails();
    System.out.println("Manager salary is: "+salary);
  }

}
public class ArrayConstructorInheritance{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Person1.print();
    TeamLeader em[]=new TeamLeader[1];
    em[0]=new TeamLeader("prasad","Bitlabs",232.45);
    
    Manager1 emp[]=new Manager1[1];
    emp[0]=new Manager1("ravi","Bitlabs",225.78);
    emp[0].manager1();
    
    
    
    
    
    
    
    
  }
}
