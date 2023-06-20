/*You are building a payroll system for a company that has two types of employees: salaried employees and hourly employees. The payroll system needs to calculate the monthly salary for each employee based on their specific type and hours worked. Additionally, the system should demonstrate polymorphism by calculating the monthly salary for different types of employees.
Sample Input:
For Salary Base Employee
Enter Employee Name: John Doe
Enter Employee Id : 1001, 
Enter Employee Salary: 5000.0

For hourly Based Employee
Enter Employee Name: Jane Smith
Enter Employee Id : 1002
Enter Employee Salary: 5000.0
Enter Hourly Rate:  200.0
Enter hoursWorked : 150.0
Sample Output:
Employee Name: John Doe
Employee ID: 1001
Monthly Salary:  5000.0
Employee Name: Jane Smith
Employee ID: 1002
Monthly  Salary: 30000.0*/



import java.util.Scanner;
class SalariedEmployee{
  String name;
  int Id;
  float Salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public float getSalary() {
	return Salary;
}
public void setSalary(float salary) {
	Salary = salary;
  
}
}
class HourlyEmployees extends SalariedEmployee{
  float hourlyRate;
  float hoursWorked;
public float getHourlyRate() {
	return hourlyRate;
}
public void setHourlyRate(float hourlyRate) {
	this.hourlyRate = hourlyRate;
}
public float getHoursWorked() {
	return hoursWorked;
}
public void setHoursWorked(float hoursWorked) {
	this.hoursWorked = hoursWorked;
}
  public float totalSalary(){
    float Amount=hourlyRate*hoursWorked;
    return Amount;
  }
  
  
}
public class GrandTest3Challenge1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enyte the value of n");
    int n=sc.nextInt();
    HourlyEmployees a[]=new HourlyEmployees[n];
    for(int i=0;i<n;i++){
      a[i]=new HourlyEmployees();
      System.out.print("For salary base employee details");
      System.out.print("enter the employee name:");
      sc.nextLine();
      String name=sc.nextLine();
      a[i].setName(name);
      System.out.print("enter the employee id:");
      int id=sc.nextInt();
      a[i].setId(id);
      System.out.print("enter the employee salary:");
      float salary=sc.nextFloat();
      a[i].setSalary(salary);
      System.out.print("For salaried employee details");
      System.out.print("enter the employee name:");
      sc.nextLine();
      String name1=sc.nextLine();
      a[i].setName(name);
      System.out.print("enter the employee id:");
      
      
      id=sc.nextInt();
      a[i].setId(id);
      System.out.print("enter the employee salary:");
      salary=sc.nextFloat();
      a[i].setSalary(salary);
      System.out.print("netr the Hourly rate:");
      float hourlyRate=sc.nextFloat();
      a[i].setHourlyRate(hourlyRate);
      System.out.print("enter the hours worked:");
      float hoursWorked=sc.nextFloat();
      a[i].setHoursWorked(hoursWorked);
       
      
      
    }
    
    for(int i=0;i<n;i++){
    System.out.println("Employee name:"+a[i].getName());
    System.out.println("Employee Id:"+a[i].getId());
    System.out.println("Employee Salary:"+a[i].getSalary());
    System.out.println("Employee name:"+a[i].getName());
    System.out.println("Employee Id:"+a[i].getId());
    System.out.println("Employee salary:"+a[i].totalSalary());
    }
      
      
  }
}