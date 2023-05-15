//WAP to find sum of all odd numbers between 1 to n.

import java.util.Scanner;
public class OddProgramMain1{
  public static void main(String[] args){
    OddProgram2 od=new OddProgram2();
    od.odd();
  }
}
class OddProgram2{
  public void odd(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i=1;
    System.out.println("enter the num value");
    num=sc.nextInt();
    do{
      if(num%2!=0){
        sum=sum+i;
        i=i+2;
      }
    }
    while(i<=num);
    System.out.println("sum of even numbers is " +sum);
  }
}