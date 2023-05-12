//2. WAP to find maximum between three numbers.

import java.util.Scanner;
public class MaxOfThree1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a,b,c;
  System.out.println("enter the values of a, b and c");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if (a>b && a>=c){
      System.out.println("a is bigger="+a);
    }
     else if (b>a && b>c){ 
      System.out.println("b is bigger="+b);
    }
    else{
      System.out.println("c is bigger="+c);
    }
  }
}