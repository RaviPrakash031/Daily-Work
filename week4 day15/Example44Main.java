//44. WAP to print all Armstrong numbers between 1 to n.
import java.util.Scanner;

public class Example44Main{
  public static void main(String[] args){
    Example44 su= new Example44();
    su.sum1();
  }
}
class Example44{
  public void sum1(){
    Scanner sc=new Scanner(System.in);
    int num,n,sum=0,temp,digit;
    System.out.println("enter the n value");
    n=sc.nextInt();
    System.out.println("enter the num");
    num=sc.nextInt();
    temp = num;
    while(temp>0){
      temp= temp % 10;
      sum+=Math.pow(temp,n);   
 
      temp = temp/10; 
    }
    if(sum==n){
      System.out.println("arm strong are");
    }
  }
}