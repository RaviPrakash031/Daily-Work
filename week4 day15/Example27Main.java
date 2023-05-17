//27. WAP to find first and last digit of a number.
import java.util.Scanner;
public class Example27Main{
  public static void main(String[] args){
    Example27 su= new Example27();
    su.sum();
  }
}
class Example27{
   public void sum(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,first_digit,last_digit;
    System.out.println("enter the num");
    num=sc.nextInt();
    last_digit=num%10;
    do{
      first_digit=num%10;
      
      
      num=num/10;
      sum=first_digit+last_digit;
    }
    while(num!=0);
    System.out.println("sum of  first and last digits are  " +(sum));
  }
}