 //WAP to find sum of all even numbers between 1 to n using for loop.

import java.util.Scanner;
public class ForEvenMain{
  public static void main(String[] args){
    ForEven ev=new ForEven();
    ev.even();
  }
}
class ForEven{
  public void even(){
    Scanner sc=new Scanner(System.in);
    int num,sum,i;
    System.out.println("enter the num value");
    num=sc.nextInt();
    for(i=2,sum=0;i<=num;i=i+2){
      if(num%2==0){
        sum=sum+i;
      }
    }
    System.out.println("sum of even numbers is " +sum);
  }
}