import java.util.*;
public class VectorClassCollection{
  public static void main(String[] args){
    Vector<String> vec=new Vector<String>(10);
    vec.addElement("Ravi");
    vec.addElement("prakash");
    System.out.println(vec);
    System.out.println(vec.size());
    System.out.println(vec.capacity());
    vec.add(1,"prasad");
    System.out.println(vec);
    vec.removeElement("Ravi");
    vec.remove(1);
    System.out.println(vec);
    Iterator I=vec.iterator();
    while(I.hasNext())
      System.out.println(I.next());
    
    
    Enumeration a=vec.elements();
    while(a.hasMoreElements())
      System.out.println(a.nextElement());
    
  }
}