class C {
  public synchronized void d1(D b) {
    System.out.println("Thread1 starts executing d1() method");
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread1 trying to call  D class last() method");
    b.last();
  }

 

  public synchronized void last() {
    System.out.println("Inside class A,last() method");
  }
}

 

class D {
  public synchronized void d2(C a) {
    System.out.println("Thread2 starts executing d2() method");
    try {
      Thread.sleep(6000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Thread2 trying to call  A class last() method");
    a.last();
  }

 

  public  synchronized void last() {
    System.out.println("Inside class D ,last() method");
  }
}

 

public class DeadLock extends Thread {
  C a = new C();
  D b = new D();

 

  public void m1() {
    this.start();
    a.d1(b);// main Thread
  }

 

  public void run() {
    b.d2(a); // child Thread
  }

 

  public static void main(String[] args) {
    DeadLock t = new DeadLock();
    t.m1();

 

  }

 

}

 

// main thread holds a's lock and waits for b's lock since it need to execute
// b.last() method
// newly created thread holds b's lock and waits for a's lock since it need to
// execute a.last() method.