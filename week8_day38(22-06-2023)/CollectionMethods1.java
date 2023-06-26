import java.util.*;
public class CollectionMethods1{
  public static void main(String[] args){
    ArrayList<String> a=new <String>ArrayList();
    a.add("ravi");
    a.add("prasad");
    a.add("chaitanya");
    System.out.println("after using collection methods is");
    System.out.println(a);
    a.add(1,"prakash");
    a.add(2,"Nikhil");
    System.out.println("after using listInterface methods are");
    System.out.println(a);
    for(String s:a)
      System.out.println(s);
    a.ensureCapacity(2);
    a.remove("Nikhil");
    a.remove(2);
    System.out.println("after removing the elements are");
    System.out.println(a);
    ListIterator b=a.listIterator();
    System.out.println("forwarding order ");
    while(b.hasNext())
      System.out.println(b.next()+" ");
    System.out.println("reverse the objects are");
    while(b.hasPrevious())
      System.out.println(b.previous()+" ");
    
    
  }
}