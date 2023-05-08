import java.util.Scanner;
public class RomanNumbers{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a;
    System.out.println("enter a integer");
    a=sc.nextInt();
    
   
    if (a==1)
      System.out.println("I");
    if(a==5)
      System.out.println("V");
    if (a==10)
      System.out.println("X");
    if (a==50)
      System.out.println("L");
    if (a==100)
      System.out.println("C");
    if (a==500)
      System.out.println("D");
    if (a==1000)
      System.out.println("M");
    
  }
}