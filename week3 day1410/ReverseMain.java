//32. WAP to enter a number and print its reverse.
import java.util.Scanner;
public class ReverseMain{
  public static void main(String[] args){
    ReverseNumber su= new ReverseNumber();
    su.reverse1();
  }
}
class ReverseNumber{
  public void reverse1(){
    Scanner sc=new Scanner(System.in);
    int num,remainder,reverse=0;
    System.out.println("enetr the num");
    num=sc.nextInt();
    do{
       remainder = num % 10;  
       reverse = reverse * 10 + remainder;  
       num = num/10;  
    }
    while(num!=0);
    System.out.println("reverse number is "+reverse);
  }
}