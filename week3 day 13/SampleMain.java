//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000 else add "medium"
import java.util.Scanner;
import java.lang.Math;
public class SampleMain{
  public  static void  main (String[] args){
    Scanner sc=new Scanner(System.in);
    float n;
    float b;
    System.out.println("enter the value of n");
    n=sc.nextFloat();
    if (n==0)
      System.out.println("zero");
    else{
      if (n>0)
        System.out.println("positive");
      else
        System.out.println("negative");
    }
    b=Math.abs(n);
    if(b<1)
      System.out.println("small");
    else if(b<1 && b<1000000){
      System.out.println("medium");
    }
    else{
      System.out.println("large");
    }
  }
}


    
      
    