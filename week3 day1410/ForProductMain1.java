//31. WAP to calculate product of digits of a number using for loop.


import java.util.Scanner;
public class ForProductMain1{
  public static void main(String[] args){
    ForProductDigits su= new ForProductDigits();
    su.forProduct1();
  }
}
class ForProductDigits{
  public void forProduct1(){
    Scanner sc=new Scanner(System.in);
    int num,digit,product;
    System.out.println("enter the num");
    num=sc.nextInt();
    for(product=1;num!=0;num=num/10){
      digit=num%10;
      product=product*digit;
    }
   
    System.out.println("product of digits are  " +product);
  }
}