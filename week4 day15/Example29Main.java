//29. WAP to check whether a number is palindrome or not.
import java.util.Scanner;
public class Example29Main{
  public static void main(String[] args){
    Example29 a=new Example29();
    a.palindrome();
  }
}
class Example29{
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
    if(n==reverse){
      System.out.println("number is palindrome"+ n);
    }
    else{
      System.out.println("number is not palindrome"+ n);
    }
  }
}