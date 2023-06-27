import java.util.*;
public class CustomTreeSet{
  public static void main(String[] args){
    TreeSet a=new TreeSet(new MyComparator());
    a.add("Ravi");
    a.add("Prakash");
    System.out.println(a);
    
  }
}
class  MyComparator implements Comparator{
  public int compare(Object obj1,Object obj2){
    String s1=(String)obj1;
    String s2=(String)obj2;
    /*if(s1<s2){
      return +1;
    }
    else if(s1>s2){
      return -1;
    }
    else{
      return 0;
    }*/
    return -s1.compareTo(s2);
    
  }
  
}