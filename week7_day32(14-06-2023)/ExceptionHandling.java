import java.util.Scanner;
public  class ExceptionHandling{
  public static void main(String[] args){
    try{
    Scanner sc=new Scanner(System.in);
    
    
      int sum=0;
        System.out.println("netr the a value");
      int a=sc.nextInt();
      int c=sc.nextInt();
      sum=a/c;
      System.out.println(sum);
      }
      
      catch(ArithmeticException e ){
      System.out.println("eneter the correst input value");
      }
      
    
        
      
      
    
  }
}