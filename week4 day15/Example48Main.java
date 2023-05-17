
//write a program to check all strong numbers from 1 to n where n is an integer
import java.util.Scanner;
class Example48{
  public boolean is_Strong_Number(int number){
    int sum=0;
    int duplicate=number;
    while(number!=0){
      int digit=number%10;
      int fact=1,i=2;
      for(i=2;i<=digit;i++){
        fact*=i;
      }
      sum=sum+fact;
      number/=10;
  }
    if(sum==duplicate)
      return true;
    else
      return false;
  }
}
public class Example48Main{
  public static void main(String[] args){
    int n,i=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the N value");
    n=sc.nextInt();
    Example48 call=new Example48();
    System.out.println("The all Strong numbers from 1 to "+n+" is ");
     for(i=1;i<=n;i++){
       boolean b=call.is_Strong_Number(i);
       if(b)
         System.out.println(i);
     }
  }
}