//43. WAP to check whether a number is Armstrong number or not.
import java.util.Scanner;

public class Example43Main{
  public static void main(String[] args){
    Example43 su= new Example43();
    su.sum1();
  }
}
class Example43{
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
      System.out.println("number is armstrong ");
    }
    else{
      System.out.println("number is not  armstrong ");
    }
  }
}