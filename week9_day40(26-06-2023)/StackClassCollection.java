import java.util.*;
public class StackClassCollection{
  public static void main(String[] args){
    Stack s=new Stack();
    s.push("ravi");
    s.push("prakash");
    System.out.println(s);
    s.pop();
    s.peek();
    System.out.println(s);
    System.out.println(s.size());
  }
}