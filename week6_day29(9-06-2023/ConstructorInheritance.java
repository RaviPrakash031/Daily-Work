import java.util.Scanner;
class Person{
  
  String name;
  String office;
  public Person(String name,String office){
    this.name=name;
    
    this.office=office;
  }
  public  void details(){
    System.out.println("employee name is "+name);
    
    System.out.println("office of employee is "+office);
  }
}
class TeamLeader extends Person{
  double teamSalary;
  public TeamLeader(String name,String office,double teamSalary){
  super(name,office);
  this.teamSalary=teamSalary;
    
  }
  void details1(){
    System.out.println("employee details");
    
    super.details();
    System.out.println("teamleader is: "+teamSalary);
  }
}
  

class Manager extends Person{
  double salary;
  
  public Manager(String name,String office,double salary){
  super(name,office);
  this.salary=salary;
  }
  void manager(){
    System.out.println("manager details");
    super.details();
    System.out.println("Manager salary is: "+salary);
  }

}

public class ConstructorInheritance{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the name of emplyee  ");
    String name=sc.nextLine();
    
    System.out.println("enter tha office name");
    String office=sc.nextLine();
    
    
    
    System.out.println("enter tha salary");
    double salary=sc.nextDouble();
    sc.nextLine();
    
    Manager s1=new Manager(name,office,salary);
    
    s1.manager();
    
    TeamLeader s2=new TeamLeader(name,office,salary);
    s2.details1();
    
  }
}
