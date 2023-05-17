//33. WAP to find frequency of each digit in a given integer.
import java.util.Scanner;
public class Example33Main{
  public static void main(String[] args){
    Example33 a=new Example33();
    a.palindrome();
  }
}
class Example33{
  public void palindrome(){
    Scanner sc=new Scanner(System.in);
    int n,d,c=0;
    System.out.println("enter the number");
    n=sc.nextInt();
    System.out.println("enter the d value");
    d=sc.nextInt();
    while (n > 0) {
       if (n % 10 == d){
         c++;
         n = n / 10;
      }
    }
    System.out.println("frequency of the digit is"+c);
  }
}
    
    
