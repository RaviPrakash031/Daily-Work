//18. WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
public class Example18Main{
  public static void main(String[] args){
    Example18 na=new Example18();
    na.forNatural();
  }
}

class Example18{
  public void forNatural(){
    Scanner sc=new Scanner(System.in);
    int num,sum=0,i;
    System.out.println("enter the num value");
    num=sc.nextInt();
    for(i=num;i>=1;i--){
      System.out.println("natural numbers are" +i);
    }
    
  }
}
