 //WAP to calculate sum of digits of a number.


import java.util.Scanner;
public class SumMain1{
  public static void main(String[] args){
    SumDigits su= new SumDigits();
    su.sum1();
  }
}
class SumDigits{
  public void sum1(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,digit;
    System.out.println("enter the num");
    num=sc.nextInt();
    do{
      digit=num%10;
      sum=sum+digit;
      num=num/10;
    }
    while(num!=0);
    System.out.println("sum of are  " +(sum));
  }
}