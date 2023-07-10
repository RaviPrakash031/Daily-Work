import java.util.*;





public class MockInterview7{
  public static void main(String[] args){
    HashMap<Integer,String> hs=new HashMap<Integer,String>();
    hs.put(1,"Ravi");
    hs.put(2,"prasad");
    ArrayList<Integer> al=new ArrayList<Integer>();
    for(Integer I:hs.keySet())
      al.add(I);
    System.out.println(al);
    ArrayList<String> al2=new ArrayList<String>();
    for(String s:hs.values())
      al2.add(s);
    System.out.println(al2);
    
  }
}