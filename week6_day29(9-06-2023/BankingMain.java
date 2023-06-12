import java.util.Scanner;
class Account1{
  long accountNumber;
  double balence;
  String accountHolder;
  Account1(long accountNumber,double balence,String accountHolder){
    this.accountNumber=accountNumber;
    this.balence=balence;
    this.accountHolder=accountHolder;
  }
  double deposit(int dep){
    balence=balence+dep;
    return balence;
  }
  double withdraw(int amount){
   balence=balence-amount;
    if(balence>=0)
      return balence;
    else
      return -1;
  }
  double checkBalence(){
    return balence;
  }
}
class AtmSimulator extends Account1{
  static int accountsList;
  Scanner sc=new Scanner(System.in);
  AtmSimulator(long accountNumber,double balence,String accountHolder){
    super(accountNumber,balence,accountHolder);
  }
  void addAccount(){
    System.out.println("Enter the new Account Details");
    long accountNumber=sc.nextLong();
    sc.nextLine();
    double balence=sc.nextDouble();
    sc.nextLine();
    String accountHolder=sc.nextLine();
    Account1 obj=new Account1(accountNumber,balence,accountHolder);
    System.out.println("New Accont Details");
    System.out.println("Account number: "+obj.accountNumber);
    System.out.println("Account balence :"+obj.balence);
    System.out.println("Account Holder name :"+obj.accountHolder);
    accountsList+=1;
    System.out.println("Total list of Accounts is "+accountsList);
    /*System.out.println("Accounts Details After Adding new Account");
    for(int i=0;i<(count+1);i++){
      System.out.println((i+1)+" Account Holder Details");
      System.out.println("Account number: "+add[i].accountNumber);
      System.out.println("Account balence :"+add[i].balence);
      System.out.println("Account Holder name :"+add[i].accountHolder);
    }*/
    
  }
  void removeAccount(AtmSimulator acc[],int index,int count){
    AtmSimulator remove[]=new AtmSimulator[count-1];
    int k=0;
    for(int i=0;i<count;i++){
      if(index==i){
        continue;
      }
      remove[k++]=acc[i];
    }
    System.out.println("Account details After Removing "+index+" index account");
    for(int i=0;i<count-1;i++){
      System.out.println("Account number: "+remove[i].accountNumber);
      System.out.println("Account balence :"+remove[i].balence);
      System.out.println("Account Holder name :"+remove[i].accountHolder);
    }
    accountsList-=1;
    System.out.println("Total list of Accounts is "+accountsList);
  }
  void transact(AtmSimulator acc[]){
    System.out.println("Select the Account with Index value");
    int ind=sc.nextInt();
    for(int i=0;i<acc.length;i++){
      if(i!=ind)
        continue;
      System.out.println("****MENU****");
      System.out.println("1.Deposit\n2.Withdraw\n3.Balence Check");
      int option=sc.nextInt();
      switch(option){
        case 1:
          System.out.println("Enter the Amount to be Deposit");
          int dep=sc.nextInt();
          System.out.println("Account balence after Deposit is "+acc[i].deposit(dep));
          break;
        case 2:
          System.out.println("Enter the Withdraw Amont");
          int withdraw=sc.nextInt();
          double amount=acc[i].withdraw(withdraw);
          if(amount>=0){
            System.out.println("Balence After Withdraw is:"+amount);
          }
          else{
            System.out.println("insufficient balence");
          }
          break;
        case 3:
          System.out.println("Account balence is "+acc[i].checkBalence());
          break;
        default:
          System.out.println("Invalid option");
        
        }
      }
  }
}
public class BankingMain{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter List of Accounts");
    AtmSimulator.accountsList=sc.nextInt();
    int count=AtmSimulator.accountsList;
    
    AtmSimulator acc[]=new AtmSimulator[AtmSimulator.accountsList+1];
    for(int i=0;i<AtmSimulator.accountsList;i++){
      System.out.println("Enter the "+(i+1)+" Account details");
      long accNumber=sc.nextLong();
      double bale=sc.nextDouble();
      sc.nextLine();
      String accHold=sc.nextLine();
      acc[i]=new AtmSimulator(accNumber,bale,accHold);
    }
    System.out.println("***MENU****");
    System.out.println("1.Add Account\n2.Remove Account\n3.Transact");
    System.out.println("Select on option");
    int n=sc.nextInt();
    switch(n){
      case 1:
        acc[0].addAccount();
        break;
      case 2:
        System.out.println("Enter index value to remove account");
        int index=sc.nextInt();
        acc[0].removeAccount(acc,index,count);
        break;
      case 3:
        acc[0].transact(acc);
        break;
      default:
        System.out.println("Invalid option");
    }
  }
}