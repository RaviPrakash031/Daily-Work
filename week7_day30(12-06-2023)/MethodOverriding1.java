class Student6{
  public void details(String name,int id,String clg){
    System.out.println("Student name is: "+name);
    System.out.println("Student id "+id);
    System.out.println("College name is: "+clg);
  }
}
class Student2 extends Student6{
  public void details(String name,int id,String clg){
    System.out.println("College name is: "+clg);
    System.out.println("Student name is: "+name);
    System.out.println("Student id "+id);
    System.out.println();
    super.details("Charan",227,"Dhanekula");
  }
}
public class MethodOverriding1{
  public static void main(String[] args){
    System.out.println();
    Student6 s1=new Student6();
    s1.details("Prasad", 232, "Dhanekula");
    System.out.println();
    Student2 s2=new Student2();
    s2.details("Ravi", 225, "Dhanekula");
  }
}