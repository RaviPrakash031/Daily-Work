//Collection Methods
import java.util.*;
public class CollectionMethods{
  public static void main(String[] args){
    Collection a=new ArrayList();
    a.add("A");
    a.add("B");
    a.add("C");
    a.add("D");
    a.add(1);
    a.add(5);
    System.out.println(a);
    System.out.println(a.size());
    Collection b=new ArrayList();
    b.add("A");
    b.add("C");
    System.out.println(b);
    a.removeAll(b);
    a.remove("D");
    System.out.println(a);
    Iterator I=a.iterator();
    while(I.hasNext())
      System.out.println(I.next());
  }
}