//31. WAP to calculate product of digits of a number.
import java.util.Scanner;
public class Example31Main{
  public static void main(String[] args){
    Example31 su= new Example31();
    su.product1();
  }
}
class Example31{
  public void product1(){
    Scanner sc=new Scanner(System.in);
    int num,product=1,digit;
    System.out.println("enter the num");
    num=sc.nextInt();
    do{
      digit=num%10;
      product=product*digit;
      num=num/10;
    }
    while(num!=0);
    System.out.println("product of digits are  " +product);
  }
}