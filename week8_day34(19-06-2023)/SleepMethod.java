//program to illustrate sleep() method

 

class MyRunnable implements Runnable {
  public void run() {
    System.out.println("inside run method");
    go();
  }

 

  public void go() {
    try {
      Thread.sleep(2000); // 2000 milliseconds or 2 seconds
    } catch (InterruptedException ex) {
      ex.printStackTrace();
    }

 

    doMore();
  }

 

  public void doMore() {
    System.out.println("top of the stack");
  }
}

 

public class Ex5 {
  public static void main(String[] args) {
    MyRunnable theJob = new MyRunnable();
    Thread t = new Thread(theJob);
    t.start();
    for (int i = 0; i < 10; i++)
      System.out.println("main method");
  }
}