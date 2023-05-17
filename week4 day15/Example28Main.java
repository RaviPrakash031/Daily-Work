//WAP to calculate sum of  first and last digits of a number.


import java.util.Scanner;
public class Example28Main{
  public static void main(String[] args){
    SumProgram su= new SumProgram();
    su.sum();
  }
}
class Example28{
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