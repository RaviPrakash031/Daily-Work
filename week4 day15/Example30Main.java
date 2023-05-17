//WAP to calculate sum of digits of a number.
import java.util.Scanner;
public class Example30Main{
  public static void main(String[] args){
    Example30 su= new Example30();
    su.sum1();
  }
}
class Example30{
  public void sum1(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,digit;
    System.out.println("enter the num");
    num=sc.nextInt();
    do{
      digit=num%10;
      sum=sum+digit;
      num=num/10;
    }
    while(num!=0);
    System.out.println("sum of are  " +(sum));
  }
}