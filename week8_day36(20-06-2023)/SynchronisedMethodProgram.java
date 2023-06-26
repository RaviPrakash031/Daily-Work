class Counter{
  int num=0;
   synchronized void max(){
    num++;
  }
   synchronized void min(){
    num--;
  }
}
public class SynchronisedMethodProgram extends Thread{
  Counter c;
  SynchronisedMethodProgram(Counter c){
    this.c=c;
    start();
  }
  
  public void run(){
    for(int i=0;i<100;i++){
      c.min();
    }
  }
  public static void main(String[] args) throws Exception{
    Counter c=new Counter();
    SynchronisedMethodProgram b=new SynchronisedMethodProgram(c);
      for(int i=0;i<100;i++){
        c.max();
        b.join();
        
      }
    System.out.println("number is "+c.num);
  }
  
  
    
}