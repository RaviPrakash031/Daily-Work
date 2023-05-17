//23.WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;
public class Example23Main{
  public static void main(String[] args){
    Example23 ev=new Example23();
    ev.even();
  }
}
class Example23{
  public void even(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i=2;
    System.out.println("enter the num value");
    num=sc.nextInt();
    for(i=2;i<=num;i++){
      if(num%2==0){
        sum=sum+i;
        i=i+2;
      }
    }
    
    System.out.println("sum of even numbers is " +sum);
  }
}