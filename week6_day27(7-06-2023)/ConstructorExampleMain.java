import java.util.Scanner;
class Student{
  String name; //instance variable
  int id; //instance variable
 
  public Student(String n, int i){
    name=n;
    id=i;
  }
  
  public void talk(){
    System.out.println("name is "+name);
    System.out.println("id is "+id);
  }
}
public class ConstructorExampleMain{
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Student s1= new Student("ravi",1 );
     
    s1.talk();
 
    Student s2= new Student("Prakash",2);
   
    s2.talk();
  }
}