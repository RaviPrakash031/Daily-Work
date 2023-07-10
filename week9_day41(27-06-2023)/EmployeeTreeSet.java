import java.util.*;
class Employee20{
  String name;
  int id;
  double salary;
  Employee20(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;
  }
  
  public String toString()
    {
      return ("" + this.name + " " + this.id + " "+ this.salary);
    }
}
class FirstComparator implements Comparator<Employee20> {
     public int compare(Employee20 e1, Employee20 e2)
    {
        int val= (e2.name).compareTo(e1.name);
        if (val==0){
          if (e1.id > e2.id) {
            return 1;
          }
          else if (e1.id < e2.id) {
            return -1;
          }
          else {
            return 0;
          }
        }
      else
        return val;
    }
}


  

public class EmployeeTreeSet{
  public static void main(String[] args){
    
    TreeSet<Employee20> ts=new TreeSet<>(new FirstComparator());
    Employee20 emp1=new Employee20("Ravi",1,52042.3);
    Employee20 emp2=new Employee20("Ravi",2,8962.25);
    Employee20 emp3=new Employee20("Pra",3,896334.25);
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    System.out.println("Based on name the values printing in Ascending order");
    for (Employee20 emp : ts) {

      System.out.println(emp);
      
    
    }
  }
}
    /*System.out.println();
    TreeSet<Employee20> ts1=new TreeSet<Employee20>(new SecondComparator());
    Employee20 emp6=new Employee20("Ravi",1,52042.3);
    Employee20 emp4=new Employee20("prakash",2,8962.25);
    Employee20 emp5=new Employee20("prasad",3,896334.25);
    ts1.add(emp6);
    ts1.add(emp4);
    ts1.add(emp5);
    System.out.println("Based on id the employee details printing decending order");
    for (Employee20 emp : ts1) {

      System.out.println(emp);
    
    }
    
  }
}
class FirstComparator implements Comparator<Employee20> {
     public int compare(Employee20 e1, Employee20 e2)
    {
        return (e2.name).compareTo(e1.name);
    }
}


/*class SecondComparator implements Comparator<Employee20> {
    @Override public int compare(Employee20 e1, Employee20 e2)
    {
        if (e1.id > e2.id) {
            return 1;
        }
        else if (e1.id < e2.id) {
            return -1;
        }
        else {
            return 0;
        }
    }
}*/



