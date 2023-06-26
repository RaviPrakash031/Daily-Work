class MyThread1 implements Runnable{
  public void run(){
    int num=10;
    int num1=50;
    
    int sum=num+num1;
    System.out.println("sum is "+sum);
    System.out.println("this is new thread");
  }
}
public class MultiThreading1{
  public static void main(String[] args){
    MyThread1 a=new MyThread1();
    Thread b=new Thread(a);
    b.start();
    for(int i=0;i<10;i++)
      System.out.println("main thread");
  }
}