//41. WAP to find sum of all prime numbers between 1 to n.
import java.util.Scanner;
public class Example41Main{
  public static void main(String[] args){
    Example41 p = new Example41();
    int n,i,sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    n = sc.nextInt();
    for(i=1,sum=0;i<=n;i++){
      boolean b = p.isPrime(i);
      if(b)
        sum=sum+i;
    }
    System.out.println("sum of prime numbers from 1 to "+n+" is "+sum);
  }
}

 

  class Example41{
  public boolean isPrime(int num){
    int i,nf;
    for(i=1,nf=0;i<=num;i++)
      {
        if(num%i==0)
          nf = nf+1;
      }
    if(nf==2)
      return true;
    else
      return false;
  }
}
