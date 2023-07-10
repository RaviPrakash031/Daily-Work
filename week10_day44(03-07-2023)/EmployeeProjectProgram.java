import java.util.*;
import java.text.SimpleDateFormat;  
import java.util.Date; 
class Employees{
 static String companyName="bitlabs";
  private static int nextId=1;
  private int id;
  private String name; 
  private int age;
  private String  gender;
  private double salary;
  
  private long aadharCardNumber;
  private long contactNumber; 
  private String city;
  private String address;
  private String dateOfJoining;
  private boolean performance;
  public Employees(String name,int age,String gender,double salary,long aadharCardNumber,long contactNumber,String city,String address,String dateOfJoining){
    this.id=nextId++;
    
    this.name=name;
    this.age=age;
    this.gender=gender;
    this.salary=salary;
    
    this.aadharCardNumber=aadharCardNumber;
    this.contactNumber=contactNumber;
    this.city=city;
    this.address=address;
    this.dateOfJoining=dateOfJoining;
    this.performance=true;
    
  }
  public int getId(){
    return id;
  }
  public void setName(String name){
    this.name=name;
  
  }
  public String getName(){
    return name;
  }
  public int   getAge(){
    return age;
  }
  public String getGender(){
    return gender;
  }
  public double getSalary(){
    return salary;
  }
  
  public long getAadharCardNumber(){
    return aadharCardNumber;
  }
  public long getContactNumber(){
    return contactNumber;
  }
  public String getCity(){
    return city;
  }
  public String getAddress(){
    return address;
  }
  public String getDateOfJoining(){
    return dateOfJoining;
  }
  public String getCompanyName(){
    return companyName;
  }
  public void setCompanyName(String companyName){
    this.companyName=companyName;
    
  }
  public boolean getPerformance(){
    return performance;
  }
  
  
}
class Companies{
  HashMap<Integer,Employees> hs=new HashMap<Integer,Employees>();
  public void addEmployee(Employees emp){
    hs.put(emp.getId(),emp);
  }
  public void displayEmployee(){
    boolean check=hs.isEmpty();
    if (check==false){
      for(Employees emp:hs.values()){
        System.out.println("Displying all the employee details are");
        System.out.println("Employee Name:"+emp.getName());
        System.out.println("Emoloyee age:"+emp.getAge());
        System.out.println("Employee gender:"+emp.getGender());
        System.out.println("Emoployee salary"+emp.getSalary());
        System.out.println("Employee Aadaar number:"+emp.getAadharCardNumber());
        System.out.println("Employee Contact Number :"+emp.getContactNumber());
        System.out.println("City"+emp.getCity());
        System.out.println("Address:"+emp.getAddress());
        System.out.println("Date of joining:"+emp.getDateOfJoining());
        System.out.println("Company name: "+Employees.companyName);
      }
    }
    else{
      System.out.println("collection is emopty");
    }
  }
  public Employees getEmployeeById(int id){
    
      return hs.get(id);
  
    
  }
  public ArrayList<Employees> getEmployeeByName(String name){
    ArrayList<Employees> ls=new ArrayList<Employees>();
    for(Employees emp:hs.values()){
      if(emp.getName().equalsIgnoreCase(name)){
        ls.add(emp);
      }
    }
    return ls;
  }
  public ArrayList<Employees> getEmployeeByCity(String city){
    ArrayList<Employees> ls=new ArrayList<Employees>();
    for(Employees emp:hs.values()){
      if(emp.getCity().equalsIgnoreCase(city)){
        ls.add(emp);
      }
    }
    return ls;
  }
  public ArrayList<Employees> getEmployeeBySalary(double maxSalary,double minSalary){
    ArrayList<Employees> ls=new ArrayList<>();
    for(Employees emp:hs.values()){
      if(emp.getSalary()<=maxSalary && emp.getSalary()>minSalary){
        ls.add(emp);
      }
    }
    return ls;
  }
  public ArrayList<Employees> getEmployeeByAgeGroup(int maxAge,int minAge){
    ArrayList<Employees> ls=new ArrayList<>();
    for(Employees emp:hs.values()){
      if(emp.getAge()<=maxAge && emp.getSalary()>minAge){
        ls.add(emp);
      }
    }
    return ls;
  }
  public void deleteEmpoyeeById(int id){
    boolean check=hs.isEmpty();
    if(check==false){
      hs.remove(id);
    }
    else{
      System.out.println("therer is no emolyee to delete");
    }
    
  }
  
  
}
public class EmployeeProjectProgram{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    Companies c=new Companies();
    while(true){
      System.out.println("******Welcome to Employee management system");
      System.out.println("1.addEmployee\n2.dispaly the Employee\n3.get Employee By Id\n4.get Employee By Name\n5.get Employee By City6.\nget Employee salary range\n7.get employee details by age group\n8.delete employee by id");
    System.out.println("enter the choice");
      int choice =sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("enter the name");
          sc.nextLine();
          String name=sc.nextLine();
          System.out.println("enter the age");
          int age=sc.nextInt();
         
      System.out.println("enter the gender of the emoloyee");
        sc.nextLine();
      String gender=sc.nextLine();
          System.out.println("enter the salary of the emoloyee");
          double salary=sc.nextDouble();
      System.out.println("enter the aadhar of the employee");
      long aadharCardNumber=sc.nextLong();
      System.out.println("enter the mobile of the employee");
      long contactNumber=sc.nextLong();
      System.out.println("enter the city of the employee");
        sc.nextLine();
      String city=sc.nextLine();
        
      System.out.println("enter the address of the employee");
      String address=sc.nextLine();
      System.out.println("enter the date of admission of the employee");
          sc.nextLine();
          
      String dateOfJoining=sc.nextLine();
           SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy  ");  
    Date date = new Date(dateOfJoining); 
      System.out.println("enter the guardians name of the employee");
     Employees emp=new Employees(name,age,gender,salary,aadharCardNumber,contactNumber,city,address,dateOfJoining);
          c.addEmployee(emp);
          break;
        case 2:
          c.displayEmployee();
        case 3:
          System.out.println("enter the id to display employee");
          int id=sc.nextInt();
          Employees emp1=c.getEmployeeById(id);
          
          if(emp1!=null){
             System.out.println("Diaplying all the employee details areby id are:");
        System.out.println("employee id:"+emp1.getId());
        
        System.out.println("Employee Name:"+emp1.getName());
        System.out.println("Emoloyee age"+emp1.getAge());
        System.out.println("employee gender"+emp1.getGender());
        System.out.println("EMoployee salary"+emp1.getSalary());
        System.out.println("employee Aadaar number:"+emp1.getAadharCardNumber());
        System.out.println("Employee Contact Number "+emp1.getContactNumber());
        System.out.println("City"+emp1.getCity());
        System.out.println("Address:"+emp1.getAddress());
        System.out.println("date of joining:"+emp1.getDateOfJoining());
             
        }
        else{
          System.out.println("no details found for that id");
        }
    
        break;
        case 4:
          System.out.println("enter the name to dispaly employee by name");
          sc.nextLine();
          String name1=sc.nextLine();
          ArrayList<Employees> ls=c.getEmployeeByName(name1);
          
            if(ls!=null){
              for(Employees emp3:ls){
               System.out.println("employee id:"+emp3.getId());
        
               System.out.println("Employee Name:"+emp3.getName());
               System.out.println("Emoloyee age"+emp3.getAge());
               System.out.println("employee gender"+emp3.getGender());
               System.out.println("EMoployee salary"+emp3.getSalary());
               System.out.println("employee Aadaar number:"+emp3.getAadharCardNumber());
               System.out.println("Employee Contact Number "+emp3.getContactNumber());
              System.out.println("City"+emp3.getCity());
               System.out.println("Address:"+emp3.getAddress());
              System.out.println("date of joining:"+emp3.getDateOfJoining());
             }
            }
         else{
          System.out.println("no details found for that name");
        } 
        break;
        case 5:
          System.out.println("enter the city for display employee by city");
          sc.nextLine();
          String city1=sc.nextLine();
          ArrayList<Employees> ls1=c.getEmployeeByCity(city1);
          break;
        case 6:
          System.out.println("enter the max and min salary vaalues");
          double maxSalary=sc.nextDouble();
          double minSalary=sc.nextDouble();
          ArrayList<Employees> ls2=c.getEmployeeBySalary(maxSalary,minSalary);
          break;
        case 7:
          System.out.println("enyer the min and max age to dislay by age group");
          int maxAge=sc.nextInt();
          int minAge=sc.nextInt();
          ArrayList<Employees> ls3=c.getEmployeeByAgeGroup(maxAge,minAge);
          break;
        case 8:
          System.out.println("enter the id to remove");
          int id2=sc.nextInt();
          c.deleteEmpoyeeById(id2);
          break;
        default:
          System.out.println("invalid choice");
      }
    }
  }
}