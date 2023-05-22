//write a program to check weather an interger is prime number r not
import java.util.Scanner;
public class Example2TestMain{
  public static void main(String[] args){
    Example2Test a=new Example2Test();
    a.example2();
  }
}
class Example2Test{
  public void example2(){
    Scanner sc=new Scanner(System.in);
    int n,i=1, count=0;
    System.out.println("enter the number");
    n=sc.nextInt();
    for (i=1;i<=n;i++){
      if (n%i==0){
        count=count+1;
        
      }
    }
    if (count==2){
    System.out.println("n is a prime number");
    }
    else {
      System.out.println("n is not a prime number");
    }
    
      
    
  }
} 