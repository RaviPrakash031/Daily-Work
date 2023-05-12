//Write a Java program to check if a given integer is a power of 2 or not, using only co nditional statements don't use loops

import java.util.Scanner;
import java.lang.Math;
public class PowerProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double num1,num2=0,x=0;
    System.out.println("enter a number");
    num1=sc.nextInt();
    x=Math.log(num1)/Math.log(2);
    num2=Math.pow(2,(int)x);
    
    
    if(num1==num2)
      System.out.println("number is power of 2 ="+(int)num1);
    else
      System.out.println("number is  not a power of 2=" +(int)num1);
  }
}