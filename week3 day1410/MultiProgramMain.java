//WAP to print multiplication table of any number.
import java.util.Scanner;
public class MultiProgramMain{
  public static void main(String[] args){
    MultiProgram1 mu=new MultiProgram1();
    mu.multi();
  }
}
class MultiProgram1{
  public void multi(){
    Scanner sc=new Scanner(System.in);
    int num,range,i=1;
    System.out.println("enter the num and range value");
    num=sc.nextInt();
    range=sc.nextInt();
    do{
      System.out.println(num+"*"+i+"="+(num*i));
      i=i+1;
    }
    while(i<=range);
  }
}