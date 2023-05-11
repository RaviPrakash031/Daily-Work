import java.util.Scanner;
public class OddProgramMain{
  public static void main(String[] args){
    OddProgram1 od=new OddProgram1();
    od.odd();
  }
}
class OddProgram1{
  public void odd(){
    Scanner sc=new Scanner(System.in);
    int n,i=1,sum=0;
    System.out.println("enter n value");
    n=sc.nextInt();
    while(i<=n){
      if (i%2!=0){
        sum=sum+i;
        i=i+2;
      }
    }
  System.out.println("sum of even numbers is="+sum);
  }
}