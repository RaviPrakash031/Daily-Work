import java.util.Scanner;
class NewThread extends Thread{
  public void run(){
    System.out.println("Prime numbers are:");
    for(int i=1;i<=100;i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0)
          count++;
      }
     
      if(count==2)
      System.out.println(i+" ");
    }
  }
}
public class PrimeEvenThread{
  public static void main(String[] args)throws InterruptedException{
    NewThread a=new NewThread();
    a.start();
    a.join();
    
    System.out.println("even numbers are");
    for(int m=2;m<100;m++){
      if(m%2==0){
        System.out.println(m);
      }
    }
  }
}