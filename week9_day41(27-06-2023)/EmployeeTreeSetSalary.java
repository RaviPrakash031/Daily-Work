//Program Based on Salary values to display employee details
import java.util.*;
class Employee24 implements Comparable{
  String name;
  int id;
  double Salary;
  Employee24(String name,int id,double Salary){
    this.name=name;
    this.id=id;
    this.Salary=Salary;
    
  }
  public int compareTo(Object obj){
    Employee24 emp=(Employee24)obj;
    /*if(this.Salary<emp.Salary)
      return +1;
    else if(this.Salary>emp.Salary)
      return -1;*/
     if(this.Salary!=emp.Salary)
      return +1;
    else
       return 0;
  }
  public String toString()
    {
      return ("" + this.name + " " + this.id + " "+ this.Salary);
    }
  
  
}
public class EmployeeTreeSetSalary{
  public static void main(String[] args){
    
    TreeSet<Employee24> ts=new TreeSet<>();
    Employee24 emp1=new Employee24("Ravi",1,25000);
    Employee24 emp2=new Employee24("Pra",2,22000);
    Employee24 emp3=new Employee24("Prasad",3,40000);
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println(ts);
    System.out.println("Based on name the values printing in Ascending order");
    for (Employee24 emp : ts) {

      System.out.println(emp);
      
    
    }
  }
}
