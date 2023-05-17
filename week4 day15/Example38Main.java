//38. WAP to calculate factorial of a number.
import java.util.Scanner;
public class Example38Main{
  public static void main(String[] args){
    Example38 a=new Example38();
    a.factorial();
  }
}
class Example38{
  public void factorial(){  
    Scanner sc=new Scanner(System.in);
    int n,factorial=1;
    System.out.println("enter the number");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
      factorial=factorial*i;
    
    }
    System.out.println("factorial of the number "+factorial);
  }
}
    
    