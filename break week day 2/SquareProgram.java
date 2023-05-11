//write a java program to read two integers and calculate absolute value ,square root of two integers

import java.util.Scanner;
import java.lang.Math;
public class SquareProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter the two numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    
    
    System.out.println("absolute value of a is "+(Math.abs(a)));
    System.out.println("absolute value of b is "+(Math.abs(b)));
    System.out.println("square root value of a is "+(Math.sqrt(a)));
    System.out.println("square root  value of b is "+(Math.sqrt(b)));
    
    
    

       
  }
}