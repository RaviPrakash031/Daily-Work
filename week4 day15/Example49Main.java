//49. WAP to print Fibonacci series up to n terms

import java.util.Scanner;
class Example49{
  public void fibonaciss(int number){
    int f_1=0,f_2=1,j=1,fibo=0;
    for(j=2;j<=number;j++){
      fibo=f_1+f_2;
      f_1=f_2;
      f_2=fibo;
    }
    System.out.println(number +" fibonaciss value is = "+fibo);
  }
}
public class Example49Main{
  public static void main(String[] args){
    int n,i=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Entre the N value");
    n=sc.nextInt();
    Example49 call=new Example49();
    for(i=1;i<=n;i++){
      call.fibonaciss(i);
    }
    
  }
}