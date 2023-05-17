//25. WAP to print multiplication table of any number.
import java.util.Scanner;
public class Example25Main{
  public static void main(String[] args){
    Example25 mu=new Example25();
    mu.multi();
  }
}
class Example25{
  public void multi(){
    Scanner sc=new Scanner(System.in);
    int num,range,i=1;
    System.out.println("enter the num and range value");
    num=sc.nextInt();
    range=sc.nextInt();
    for(i=1;i<=range;i++){
      System.out.println(num+"*"+i+"="+(num*i));
    }
  }
}