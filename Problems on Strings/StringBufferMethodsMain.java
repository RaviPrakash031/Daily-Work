import java.util.Scanner;
public class StringBufferMethodsMain{
  public static void main(String[] args){
    StringBufferMethods a=new StringBufferMethods();
    a.method();
    
  }
} 
class StringBufferMethods{
  public void method(){
    Scanner sc=new Scanner(System.in);
    StringBuffer sb=new StringBuffer("Ravi Prakash");
    
    
    sb.insert(5,"reddy ");
    System.out.println("after inserting  "+sb);
    sb.append(" molaka");
    System.out.println("after appending "+sb);
    System.out.println("enter a index");
    int index=sc.nextInt();
    sb.delete(index,sb.length());
    System.out.println("after deleting" +sb);
    sb.indexOf("Ravi");
    System.out.println(sb);
    sb.replace(index,sb.length(),"ravi");
    System.out.println("after replaccing " +sb);
    sb.reverse();
    System.out.println("after reversing  " +sb);
    
  }
}