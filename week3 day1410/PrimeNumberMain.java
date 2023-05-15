import java.util.Scanner;  
public class PrimeNumberMain {  
  public static void main(String[] args) {  
    
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    n = sc.nextInt();
    SumOfPrime p = new SumOfPrime();
    boolean b = p.isPrime(n);
    if(b)
      System.out.println("The given number "+n+" is prime number");
    else
      System.out.println("The given number "+n+" is not a prime number");
  }
}
class SumOfPrime{
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