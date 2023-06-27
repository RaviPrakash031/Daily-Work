import java.util.*;
public class SortedTreeCollection{
  public static void main(String[] args){
    SortedSet st=new TreeSet();
    st.add("Ravi");
    st.add("Prakash");
    st.add("Prasad");
    
    System.out.println(st);
    System.out.println(st.headSet("Prakash"));
    st.remove("Ravi");
    System.out.println(st);
    System.out.println(st.size());
    st.first();
    st.last();
    System.out.println(st.first());
    System.out.println(st.last());
  }
}