//program for finding charecter index value in a string
import java.util.Scanner;
public class StringExample2Main{
  public static void main(String[] args){
    StringExample2 call= new StringExample2();
    call.countChar();
  }
}
class StringExample2{
  public void countChar(){
    String str;
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    str=sc.nextLine();
    System.out.println("Enter the charecter");
    ch=sc.next().charAt(0);
    int count=0;
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(ch==c){
        System.out.println("The index value of the charecter is:"+i);
        count++;
      }
    }
    if(count==0)
      System.out.println("The charecter is  not in the String");
  }
}