//23. WAP to find sum of all even numbers between 1 to n.

import java.util.Scanner;
public class EvenProgramMain{
  public static void main(String[] args){
    EvenProgram1 ev=new EvenProgram1();
    ev.even();
  }
}
class EvenProgram1{
  public void even(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i=2;
    System.out.println("enter the num value");
    num=sc.nextInt();
    do{
      if(num%2==0){
        sum=sum+i;
        i=i+2;
      }
    }
    while(i<=num);
    System.out.println("sum of even numbers is " +sum);
  }
}