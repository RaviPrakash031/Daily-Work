/*import java.util.*;

class Employee10{
 int id;
 String name;
int salary;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
  
}

public class EmployeeCollectionMethods{
  public static void main(String[] args){
    ArrayList a=new ArrayList();
    Employee10 b=new Employee10();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<a.size();i++){
    System.out.println("entre the id");
    
    
    int id=sc.nextInt();
    b.setId(id);
    System.out.println("entre the name");
    
    String name=sc.nextLine();
    b.setName(name);
    sc.nextLine();
    System.out.println("enter the salary");
    int salary=sc.nextInt();
    b.setSalary(salary);
    }
    
    
    
    a.add(b);
    for(int i=0;i<a.size();i++){
      Employee10 emp=a.get(i);
      System.out.println("Id:"+emp.getId());
      System.out.println("Name:"+emp.getName());
      System.out.println("Salary:"+emp.getSalary());
      System.out.println();
    }
    
    
    
    
  }
}*/