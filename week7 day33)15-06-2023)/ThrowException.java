//creating an exception
import java.util.Scanner;
class InsufficientFundsException extends Exception{
  InsufficientFundsException(String msg){
    super(msg);
  }
}
class WithdrawClass{
  int balance =10000;
  public void withdraw(double money){
    try{
    if(balance<money)
      throw new InsufficientFundsException("amount is greater than the balance");
      else{
        System.out.println("Withdrawn successfully");
        System.out.println("Balance amount is "+(balance - money));
      }
    }
    catch(InsufficientFundsException e) {
      System.out.println("Exception is found :"+e.getMessage());
    }
  }
}
public class ThrowException{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    WithdrawClass wc = new WithdrawClass();
    System.out.println("enter money to withdraw :");
    int money = sc.nextInt();
    wc.withdraw(money);
  }
}