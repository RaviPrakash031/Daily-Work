import java.util.*;
class Employee23 implements Comparable<Employee23>{
  String name;
  int id;
  double Salary;
  Employee23(String name,int id,double Salary){
    this.name=name;
    this.id=id;
    this.Salary=Salary;
    
  }
  public int compareTo(Employee23 emp){
    
    return this.name.compareTo(emp.name);
  }
  public String toString()
    {
      return ("" + this.name + " " + this.id + " "+ this.Salary);
    }
  
  
}
public class EmployeeTreeSet1{
  public static void main(String[] args){
    
    TreeSet<Employee23> ts=new TreeSet<>();
    Employee23 emp1=new Employee23("Ravi",1,52042.3);
    Employee23 emp2=new Employee23("Pra",2,8962.25);
    Employee23 emp3=new Employee23("Prasad",3,896334.25);
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println(ts);
    System.out.println("Based on name the values printing in Ascending order");
    for (Employee23 emp : ts) {

      System.out.println(emp);
      
    
    }
  }
}