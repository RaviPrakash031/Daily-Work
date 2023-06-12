class Employee3{
  String name;
  String company;
  int  age;
  Employee3(String name,String company,int age){
    this.name=name;
    this.company=company;
    this.age=age;
  }
  
  
  void getEmpDetails(){
    System.out.println("employee name is "+name);
    System.out.println("company name is "+company);
    System.out.println("Age of employee "+age);
  }
}
class Manager2 extends Employee3{
  int managerId;
  Manager2(String name,String company,int age,int managerId){
  super(name,company,age);
  this.managerId=managerId;
  }
  void manager(){
    System.out.println("manager details");
    System.out.println("-----------------");
    super.getEmpDetails();
    System.out.println("Manager Id is: "+managerId);
  }
}
class Accountent1 extends Employee3{
  int accountId;
  Accountent1(String name,String company,int age,int accountId){
    super(name,company,age);
    this.accountId=accountId;
  }
  void accountent(){
    System.out.println("Accontent Details");
    System.out.println("-----------------");
    super.getEmpDetails();
    System.out.println("Accountent id is:"+accountId);
  }
}
public class ArrayConstructorInheritance1{
  public static void main(String[] args){
    Manager2 em[]=new Manager2[1];
    
    em[0]=new Manager2("prasad","Bitlabs",21,232);
    em[0].manager();
    Accountent1 emp[]=new Accountent1[1];
    emp[0]=new Accountent1("ravi","Bitlabs",21,227);
    emp[0].accountent();
  }
}