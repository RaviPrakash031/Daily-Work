class Student1{
  
  String college="Dhanekula";
  String place="vijayawada";
  public  void details(){
    System.out.println("student");
    
  }
}
class EeeStudent extends Student1{
  String subject="Machines";
}
class MecStudent extends Student1{
  String subject="Mechanics";
}
public class InheritanceProgramMain{
  public static void main(String[] args){
    EeeStudent s1=new EeeStudent();
    
    
    System.out.println("clg name is  "+s1.college);
    System.out.println("place is "+s1.place);
    System.out.println("subject is "+s1.subject);
    s1.details();
    MecStudent s2=new MecStudent();
    System.out.println("clg name is  "+s2.college);
    System.out.println("place is "+s2.place);
    System.out.println("subject is "+s2.subject);
    s2.details();
  }
}
