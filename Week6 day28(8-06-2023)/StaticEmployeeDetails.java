import java.util.Scanner;
class Employee5{
  String name;
  int id;
  
  static String  college="vasavi";
  public Employee5(String name,int id){
    this.name=name;
    this.id=id;
    
  }
  
  static void change(){
    college="dhanekula";
  }
  public void display(){
    System.out.println(name+" "+id+" "+college );
  }
}
public class StaticEmployeeDetails{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Employee5 emp1=new Employee5("ravi",15);
    Employee5 emp2=new Employee5("pra",3);
    /*System.out.println("enter the name");
    emp.name=sc.nextLine();
    System.out.println("enter the id");
    emp.id=sc.nextInt();*/
    emp1.display();
    emp2.display();
    Employee5.change();
    emp1.display();
    emp2.display();
  }
}