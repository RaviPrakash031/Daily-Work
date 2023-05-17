//36. WAP to find power of a number using for loop.
import java.util.Scanner;
public class Example36Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n,power,i,result=1;
    System.out.println("enter the n value");
    n=sc.nextInt();
    System.out.println("enter the power");
    power=sc.nextInt();
    for(i=1;i<=power;i++){
      result=result*n;
    }
    System.out.println("the power of number is="+result);
  }
}