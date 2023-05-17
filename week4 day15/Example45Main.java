//45. WAP to check whether a number is Perfect number or not.
import java.util.Scanner;
 
public class Example45Main {
  public static void main(String[] args) {
    
    Example45 e = new Example45();
    e.perfect();
  }
}
class Example45{
  public void perfect() {
    int number,sum = 0, i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    
    number=sc.nextInt();
    for (i = 1; i<=number; i++) {
      if (number % i == 0)
        sum = sum + i;
    }
    if (sum == number) {
      System.out.println("number is perfect number");
    } 
    else {
      System.out.println("number is perfect number");
    }
  }
}