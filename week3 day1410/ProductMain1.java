//31. WAP to calculate product of digits of a number.


import java.util.Scanner;
public class ProductMain1{
  public static void main(String[] args){
    ProductDigits su= new ProductDigits();
    su.product1();
  }
}
class ProductDigits{
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