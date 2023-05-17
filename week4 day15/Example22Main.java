//22. WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class Example22Main{
  public static void main(String[] args){
    Example22 na=new Example22();
    na.forNatural();
  }
}

class Example22{
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