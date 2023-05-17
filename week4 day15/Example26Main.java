//26. WAP to count number of digits in a number.
import java.util.Scanner;
public class Example26Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n,count=0;
    System.out.println("enter the number");
    n=sc.nextInt();
    while(n!=0){
    n=n/10;
    count++;
    }
    System.out.println("no of digits"+count);
  }
}