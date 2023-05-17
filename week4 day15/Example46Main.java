import java.util.Scanner;
class Example46{
  public boolean isPerfect(int number){
    int sum=0;
    for(int j=1;j<number;j++){
      if(number%j==0){
        sum=sum+j;
      }
    }
    if(sum==number)
      return true;
    else
      return false;
    
  }
}
public class Example46Main{
  public static void main(String[] args){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the N value");
    n=sc.nextInt();
    System.out.println("The perfect numbers between 1 to "+n+" is");
    for(int i=1;i<=n;i++){
      Example46 call=new Example46();
      boolean b=call.isPerfect(i);
      if(b)
        System.out.println(i);
    }
  }
}