//WAP to find sum of all natural numbers between 1 to n.

import java.util.Scanner;
public class NaturalMain{
  public static void main(String[] args){
    NaturalProgram na=new NaturalProgram();
    na.natural();
  }
}

class NaturalProgram{
  public void natural(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i=1;
    System.out.println("enter the num value");
    num=sc.nextInt();
    do{
      sum=sum+i;
      i=i+1;
    }
    while(i<=num);
    System.out.println("sum of natural numbers is" +sum);
  }
}