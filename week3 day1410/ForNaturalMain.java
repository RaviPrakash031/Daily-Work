//sum of n natural numbers by using for loop

import java.util.Scanner;
public class ForNaturalMain{
  public static void main(String[] args){
    ForNaturalProgram na=new ForNaturalProgram();
    na.forNatural();
  }
}

class ForNaturalProgram{
  public void forNatural(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i;
    System.out.println("enter the num value");
    num=sc.nextInt();
    for(i=1;i<=num;i++){
      sum=sum+i;
    }
   
    System.out.println("sum of natural numbers is" +sum);
  }
}