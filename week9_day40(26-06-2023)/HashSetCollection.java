import java.util.*;
public class HashSetCollection{
  public static void main(String[] args){
    HashSet<String> hs=new HashSet<String>();
    hs.add("Ravi");
    hs.add("praksh");
    hs.add("prasad");
    hs.add("Ravi");
    System.out.println("HashSet:"+hs);
    hs.remove("prasad");
    System.out.println(hs.size());
    System.out.println(hs);
    LinkedHashSet<String> lhs=new LinkedHashSet<String>();
    lhs.add("ravi");
    lhs.add("prakash");
    lhs.add("prasad");
    System.out.println("LinkedHashSet: "+lhs);
    System.out.println(lhs.size());
    System.out.println(lhs.contains("Ravi"));
    
    
  }
}