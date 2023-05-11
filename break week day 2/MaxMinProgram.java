//Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values.
import java.util.Scanner;
public class MaxMinProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
    System.out.println("enter the three numbers");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if (a<b && a<c)
        System.out.println(" a is  min value"+a);
    else if((b<a && b<c)&&(a>b && a>c))
            System.out.println("b is min value"+b);
    else{
      System.out.println("c is min value"+c);
    if(a>b && a>c)
      System.out.println("a is max value"+b);

    else if(b>a&&b>c)
      System.out.println("b is max  value"+b);
      else{
        System.out.println("c is max value"+b);
      }
    }
  }
}