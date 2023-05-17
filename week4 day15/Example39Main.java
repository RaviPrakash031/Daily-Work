//39. WAP to check whether a number is Prime number or not.
import java.util.Scanner;  
public class Example39Main {  
  public static void main(String[] args) {  
    
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    n = sc.nextInt();
    Example39 p = new Example39();
    boolean b = p.isPrime(n);
    if(b)
      System.out.println("The given number "+n+" is prime number");
    else
      System.out.println("The given number "+n+" is not a prime number");
  }
}
class Example39{
  public  boolean isPrime(int n){
    int i,count;
    for (i = 1,count=0; i <=n; i++){
      if(n%i==0){
        count=count+1;
      }  
    }
    if (count == 1){ 
      return true;  
    }
    else{
      return true;  
    }
  }  
}