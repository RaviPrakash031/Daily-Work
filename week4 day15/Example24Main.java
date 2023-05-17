//24.WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
public class Example24Main{
  public static void main(String[] args){
    Example24 od=new Example24();
    od.odd();
  }
}
class Example24{
  public void odd(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i=1;
    System.out.println("enter the num value");
    num=sc.nextInt();
    for(i=1;i<=num;i++){
      if(num%2!=0){
        sum=sum+i;
        i=i+2;
      }
    }
    System.out.println("sum of odd numbers is " +sum);
  }
}