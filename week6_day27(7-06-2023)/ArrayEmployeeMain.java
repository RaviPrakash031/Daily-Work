import java.util.Scanner;
class Employee4{
  String name;
  int id;
  double salary;
}
public class ArrayEmployeeMain{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Employee4 emp[] =new Employee4[3];
    for(int i=0;i<3;i++){
      emp[i]=new Employee4();
      System.out.println("enter the employee name");
      emp[i].name = sc.nextLine();
      System.out.println("enter employee id");
      emp[i].id = sc.nextInt();
      System.out.println("enter employee salary");
      emp[i].salary = sc.nextDouble();
      sc.nextLine();
    }
    for(int i=0;i<3;i++){
      System.out.println("name is"+emp[i].name);
      System.out.println("Id is"+emp[i].id);
      System.out.println("salary is"+emp[i].salary);
      
      
    }
    
    
    
  }
  
}