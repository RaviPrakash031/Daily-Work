class MyThread extends Thread{
  public void run(){
    for(int i=0;i<10;i++)
      System.out.println("child Thread");
    
    
    
  }
  public void ececute(){
    for(int i=0;i<10;i++)
      System.out.println("inside child thread");
    
  }
}
public class MultiThreading{
  public static void main(String[] args){
    MyThread a=new MyThread();
    
    a.start();
  
    
    for(int i=0;i<10;i++)
      System.out.println("main methhod");
  }
}