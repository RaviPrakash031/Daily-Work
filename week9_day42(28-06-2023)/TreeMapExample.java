import java.util.*;
class Student50{
  String name;
  double marks;
  Student50(String name,double marks){
    this.name=name;
    this.marks=marks;
    
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
  public String toString(){
    return this.name+" "+this.marks;
  }
}
class MyComparator4 implements Comparator<Student50>{
  public int compare(Student50 s1,Student50 s2){
    if(s1.marks<s2.marks)
      return 1;
    else if(s1.marks>s2.marks)
      return -1;
    else
      return 0;
    
    
  }
}
public class TreeMapExample{
  public static void main(String [] args){
    TreeMap<Student50,String> tr=new TreeMap<Student50,String>(new MyComparator4());
    Student50 st1=new Student50("Ravi",85);
    Student50 st2=new Student50("prakash",90);
    Student50 st3=new Student50("pra",69);
    tr.put(st1,"A");
    tr.put(st2,"B");
    tr.put(st3,"c");
    System.out.println(tr);
    Set entires=tr.entrySet();
    for(Object o:entires){
      Map.Entry e=(Map.Entry)o;
      System.out.println(e.getKey()+"="+e.getValue());
    }
      
    
  }
}