//Given two non-negative integers low and high,find the count of odd numbers between low and high (inclusive). use conditional statements only(not loops)
import java.util.Scanner;
public class ConditionalProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int high,low ,m,n,count=1;
    System.out.println("enter low,high values");
    high=sc.nextInt();
    low=sc.nextInt();
    m=low+1;
    n=high-1;
    
    
    if ((m%2!=0)||(n%2!=0)){
      
      
      System.out.println("count of odd numbers are" +count);
    } 
    else{
      System.out.println("no odd value");
    }
  }
}