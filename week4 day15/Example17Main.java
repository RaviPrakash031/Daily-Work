//17. WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class Example17Main{
  public static void main(String[] args){
    Example17 na=new Example17();
    na.forNatural();
  }
}

class Example17{
  public void forNatural(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i;
    System.out.println("enter the num value");
    num=sc.nextInt();
    for(i=1;i<=num;i++){
      System.out.println("natural numbers are" +i);
    }
  }
}
