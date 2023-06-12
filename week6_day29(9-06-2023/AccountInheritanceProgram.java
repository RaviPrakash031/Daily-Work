//Create a class called "Account" that represents a bank account. The class should have properties such as account number, balance, and account holder name, and methods such as deposit, withdraw and check balance. Create another class called "ATMSimulator" that represents an ATM machine. The class should have a list of accounts, and methods such as addAccount, removeAccount, and transact.
import java.util.Scanner;
class Account{
  long accountNum;
  float balance;
  String holderName;
  float withdraw;
  float deposit;
  public Account(long accountNum,float balance,String holderName){
    this.accountNum=accountNum;
    this.balance=balance;
    this.holderName=holderName;
  }
  public void accountNum(long accountNum) {
        
        System.out.println( "Account number is"+accountNum);
        System.out.println( "Account balance is"+balance);
        System.out.println( "Account holder name is"+ holderName);
    }

    public void deposit(float amount) {
    balance = balance + amount;
    System.out.println(holderName+ " deposited " + deposit + " Current Balance " + balance);

    }    

    public void withdraw(float amount) {
        if (balance >= withdraw) {
            balance = balance - amount;
            System.out.println(holderName + " withdrew " + withdraw + " Current Balance " + balance);
        }
        if (balance < withdraw) {
            System.out.println("Unable to withdraw " + amount + " for " + holderName + " due to insufficient funds.");
        }
    }
  public void checkBalance(float amount){
    System.out.println("enter the account number to check balance");
    Scanner sc=new Scanner(System.in);
    long accNum=sc.nextLong();
    if (accountNum==accNum){
      System.out.println("remaining balance is "+balance);
    }
    else{
      System.out.println(" account not found unable to check balance");
    }
  }
}
class ATMSimulator extends   Account{
  
  int listOfAccounts;
  String addaccount="pra";
  long another=630389635l;
  public ATMSimulator(long accountNum,int balance,String holderName,int listOfAccounts ){
    super(accountNum,balance,holderName);
    this.listOfAccounts=listOfAccounts;
  }
  public void addAccount(){
    
    
    
    System.out.println("after adding account name is"+addaccount);
    System.out.println(addaccount+" account number  "+another);
    System.out.println("list of accounts"+listOfAccounts);
  }
  public void removeAccount(){
    
    System.out.println("remove account");
  }
  public void transcation(){
    System.out.println("atm details are");
    super.deposit(8526.25f);
    super.withdraw(8956.58f);
    super.checkBalance(8963.58f);
    System.out.println("transcation is done");
  }
}
public class AccountInheritanceProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ATMSimulator ab=new ATMSimulator(6303701330l,45000,"ravi",2);
    ab.accountNum(6303701330l);
    ab.deposit(5200.3f);
    ab.withdraw(2500.5f);
    ab.addAccount();
    ab.removeAccount();
    ab.transcation();
  }
}

