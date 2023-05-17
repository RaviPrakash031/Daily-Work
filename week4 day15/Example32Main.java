//32. WAP to enter a number and print its reverse.
import java.util.Scanner;
public class Example32Main{
  public static void main(String[] args){
    Example32 a=new Example32();
    a.palindrome();
  }
}
class Example32{
  public void palindrome(){
    Scanner sc=new Scanner(System.in);
    int n,rem,reverse=0,temp;
    System.out.println("enter the number");
    n=sc.nextInt();
    temp=n;
    while(temp!=0){
      rem=temp%10;
      reverse=reverse*10+rem;
      temp=temp/10;
    }
    System.out.println("reverse number is"+reverse);
  }
}
    