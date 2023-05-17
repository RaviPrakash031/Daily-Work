//37. WAP to find all factors of a number.
import java.util.Scanner;
public class Example37Main{
  public static void main(String[] args){
    Example37 a=new Example37();
    a.factors();
  }
}
class Example37{
  public void factors(){  
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the number");
    n=sc.nextInt();
    for(int i=1;i<=n;i++){
      if(n%i==0){
        System.out.println(" "+i);
      }
    }
  }
}
    
    