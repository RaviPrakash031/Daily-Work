class Employee1{
  String name;
  int id;
  float salary;
  public void print(){
    System.out.println("employee name is:"+name);
    System.out.println("employee id is:"+id);
    System.out.println("employee salary is:"+salary);
    
  }
}
public class EmployeeMain{
  public static void main(String[] args){
    Employee1 e1=new Employee1();
    e1.name="Ravi";
    e1.id=1;
    e1.salary=25000;
    e1.print();
    Employee1 e2=new Employee1();
    e2.name="prakash";
    e2.id=2;
    e2.salary=32000;
    e2.print();
    Employee1 e3=new Employee1();
    e3.name="prasad";
    e3.id=3;
    e3.salary=50000;
    e3.print();
  }
}