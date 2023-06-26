//4. Employee Management: Create a class called Employee that represents an employee and a class called Company that represents a company. The company class should have methods to add, remove, and display employees. You can also create a custom exception called InvalidSalaryException to throw when an employee's salary is below the minimum wage.

import java.util.Scanner;
class Employee_5{
  private String name;
  private double salary;
  private int id;
  /*public Product_1(String name,double price,int quantity){
    this.name=name;
    this.price=price;
    this.quantity=quantity;
  }*/
  public void setName(String name){
    this.name=name;
  }
  public void setSalary(double salary){
    this.salary=salary;
  }
  public void setId(int id){
    this.id=id;
  }
  
  public String getName(){
    return name;
  }
  public double getSalary(){
    return salary;
  }
  public int getId(){
    return id;
  }
}
class Company extends Employee_5{
  Scanner sc=new Scanner(System.in);
  public void addEmployee(Employee_5 emp[]){
    Employee_5 newEmp[]=new Employee_5[emp.length+1];
    int l=newEmp.length-1;
    newEmp[l]=new Employee_5();
    for(int i=0;i<emp.length;i++){
      newEmp[i]=emp[i];
    }
    System.out.print("Entre name: ");
    newEmp[l].setName(sc.nextLine());
    System.out.print("Ente Salary: ");
    newEmp[l].setSalary(sc.nextDouble());
    System.out.print("Enter Id: ");
    newEmp[l].setId(sc.nextInt());
    
    for(int i=0;i<newEmp.length;i++){
      System.out.println();
      System.out.println("Name: "+newEmp[i].getName());
      System.out.println("Salary: "+newEmp[i].getSalary());
      System.out.println("Id: "+newEmp[i].getId());
    }
  }
  public void removeEmployee(Employee_5 emp[],int index){
    Employee_5 newEmp[]=new Employee_5[emp.length-1];
    int k=0;
    for(int i=0;i<emp.length;i++){
      if(index==i){
        continue;
      }
      else{
        newEmp[k++]=emp[i];
      }
    }
    for(int j=0;j<newEmp.length;j++){
      System.out.println();
      System.out.println("Name: "+newEmp[j].getName());
      System.out.println("Salary: "+newEmp[j].getSalary());
      System.out.println("Id: "+newEmp[j].getId());
    }
  }
  public void display(Employee_5 emp[]){
    for(int i=0;i<emp.length;i++){
      System.out.println("Enter the "+(1+i)+" Employee wages");
      int wages=sc.nextInt();
      try{
        if(emp[i].getSalary()<wages){
        throw new InvalidSalaryException("InvalidSalaryException");
        }
      else{
        System.out.println("Name: "+emp[i].getName());
            System.out.println("Price: "+emp[i].getSalary());
            System.out.println("Qunatity: "+emp[i].getId());
          }
        }
      catch(InvalidSalaryException e){
        System.out.println("Exception: "+e.getMessage());
        System.exit(0);
      }
    }
  }
}
class InvalidSalaryException extends Exception{
  public InvalidSalaryException(String str){
    super(str);
  }
}
public class EmployeeExceptionHandling{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the count of Employees");
    int n=sc.nextInt();
    Employee_5 emp[]=new Employee_5[n];
    for(int i=0;i<emp.length;i++){
      emp[i]=new Employee_5();
      System.out.println("Enter the "+(1+i)+" Employee Details");
      sc.nextLine();
      System.out.print("Enter name: ");
      emp[i].setName(sc.nextLine());
      System.out.print("Enter Salary: ");
      emp[i].setSalary(sc.nextDouble());
      System.out.print("Enter Id: ");
      emp[i].setId(sc.nextInt());
    }
    System.out.println("1.Add Employee\n2.Remove Employee\n3.Display Employees\nSelect one option");
    int choice=sc.nextInt();
    Company c=new Company();
    switch(choice){
      case 1:
        c.addEmployee(emp);
        break;
      case 2:
        //Store s=new Store();
        System.out.println("Enter Index value to remove Employee");
        int ind=sc.nextInt();
        c.removeEmployee(emp,ind);
        break;
      case 3:
        c.display(emp);
        break;
      default:
        System.out.println("Invalid Option");
    }
  }
}

/*import java.util.Scanner;
class InvalidSalaryException extends Exception{
  public InvalidSalaryException(String msg){
    
  
  super(msg);
  }
}
class Employee15{
  int id;
  String name;
  double salary;
  
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
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
}
class Company extends Employee15{
  public void addEmployee(Employee15 b[]){
    
    Scanner sc=new Scanner(System.in);
    Employee15 newb=new Employee15(b.length+1);
    int I=newb.length-1;
    newb[I]=new Employee15();
    
    
    for(int i=0;i<n+1;i++){
      
      newb[i]=b[i];
    System.out.println("enter the id");
    
    int id =sc.nextInt();
      newb[I].setId();
    System.out.println("enter the name");
    String name=sc.nextLine();
      newb[I].setName();
      System.out.println("enter the salary");
    double salary=sc.nextDouble();
      newb[I].setSalary();
    }
    
    for(int i=0;i<newb.length;i++){
    System.out.println("Emplyee name:"+newb[I].getId());
    System.out.println("employee name:"+newb[I].getName());
    System.out.println("enployee salary"+newb[I].getSalary());
    }
  }
  public void removeEmployee(){
    System.out.println("Emplyee details are removed");
  }
  public void displayEmployee(){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the employee id to display");
    
    int id=sc.nextInt();
    System.out.println("emter the employee name");
    String name=sc.nextLine();
    sc.nextLine();
    
    
    System.out.println("enter the employee saalry");
    double salary=sc.nextDouble();
      System.out.println("enter the wage");
      double wage=sc.nextDouble();
      try{
        if(salary<wage){
          throw new InvalidSalaryException("InvalidSalaryException");
        }
        else{
          System.out.println(salary);
        }
        
      }
      catch(InvalidSalaryException e){
      System.out.println("salary is less than wage "+e.getMessage());
      }
    System.out.println("Emplyee name:"+id);
    System.out.println("employee name:"+name);
    System.out.println("enployee salary"+salary);
  
  }
  
  
  
}
public class EmployeeExceptionHandling{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    
    
     System.out.println("enter the size of employee");
    int n=sc.nextInt();
    Employee15 b[]=new Employee15[n];
    for(int i=0;i<n;i++){
      System.out.println("enter the id");
      int id=sc.nextInt();
      b[i].setId(id);
      System.out.println("Enter the name");
      String name=sc.nextLine();
      b[i].setName(name);
      System.out.println("enter the saalry");
      double salary=sc.nextDouble();
      b[i].setSalary(salary);
    }
    
    System.out.println("1.addEmplyee/n2.removeEMployee3.DisplayEMplyee");
    int m=sc.nextInt();
    switch(m){
      case 1:
        for(int i=0;i<n;i++){
        
      /*case 2:
        
        b.removeEmployee();
        break;
      case 3:
        b.displayEmployee();
        
        }
    
    }  
  }
    
}*/





