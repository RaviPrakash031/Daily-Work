//program to demonstrate thread properties
class ExampleMulti {
  public static void main(String[] args) {
    Thread th = Thread.currentThread();
    System.out.println("Name of the current thread =" + th.getName());
    th.setName("Java");
    System.out.println("Name of the current thread =" + th.getName());
    System.out.println("is alive: " + th.isAlive());
    Thread t1 = new Thread("bitlabs");
    System.out.println("Name of the child thread = " + t1.getName());
    System.out.println("is alive: " + t1.isAlive());
    t1.start();
    t1.setPriority(3);
    System.out.println("after start() method ,is alive: " + t1.isAlive() + "its priority is " + t1.getPriority());
    System.out.println("Max Priority = " + Thread.MAX_PRIORITY);
    System.out.println("Min Priority = " + Thread.MIN_PRIORITY);
    System.out.println("Normal Priority = " + Thread.NORM_PRIORITY);
  }

 

}