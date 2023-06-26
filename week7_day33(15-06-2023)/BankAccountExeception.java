//1. Bank Account: Create a class called BankAccount that simulates a bank account. The class should have methods to deposit, withdraw, and check the balance. You can also create a custom exception called InsufficientFundsException to throw when a withdrawal is attempted with insufficient funds.
import java.util.Scanner;
class BankAccount{
  private double balance;
  public void setBalence(double balance){
    this.balance=balance;
  }
  public double getBalence(){
    return balance;
  }
  public double deposite(int amount){
    balance=balance+amount;
    return balance;
  }
  public double withdraw(int amount){
    return (balance-amount);
  }
}
class InsufficientFundsException1 extends Exception{
  public InsufficientFundsException1(String str){
    super(str);
  }
}
public class BankAccountExeception{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    BankAccount call=new BankAccount();
    System.out.println("Enter amount to account");
    call.setBalence(sc.nextDouble());
    System.out.println("1.Deposite\n2.Withdraw\n3.Check Balence\nSelect One option");
    int n=sc.nextInt();
    switch(n){
      case 1:
        System.out.println("Enter the Deposite Amount");
        int dep=sc.nextInt();
        call.deposite(dep);
        System.out.println("Balence After Deposite Amount "+call.getBalence());
        break;
      case 2:
        System.out.println("Enter the withdraw Amount");
        int amo=sc.nextInt();
        try{
          if(call.withdraw(amo)<0){
            throw new InsufficientFundsException1("InsufficientFundsException");
          }
          else{
            System.out.println("Balence After Withdraw "+call.withdraw(amo));
          }
        }
        catch(InsufficientFundsException1 e){
          System.out.println("Exception: "+e.getMessage());
        }
        break;
      case 3:
        System.out.println("Balence Amount "+call.getBalence());
        break;
      default:
        System.out.println("Invalid Option");
        break;
    }
  }
}