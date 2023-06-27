//program to illustrate Treeset with comparator
//program to implement Descending order for Integers
//opposite to ascending order which is default natural ordering

 

import java.util.*; 
class CustomTreeSet1
{ 
    public static void main(String[] args) 
    { 
        TreeSet ts=new TreeSet(new MyComparator1()); 
      // TreeSet ts=new TreeSet(); 
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(5);
        ts.add(20);
        System.out.println(ts);
    }
}

 


class MyComparator1 implements Comparator
{
    public int compare(Object obj1,Object obj2)
    {
        Integer I1=(Integer)obj1;
        Integer I2=(Integer)obj2;
       /* if(I1<I2)
            return +1;
        else if(I1>I2)
            return -1;
        else
            return 0;*/
       return -I1.compareTo(I2);
      //return +10;//insertion order
    }
}

 

/* here we are writing TreeSet ts=new TreeSet(new MyComparator());so JVM will call compare() method which is meant for customized sorting(in this case descending order).so output is [20,15,10,5,0]

 


if we write TreeSet ts=new TreeSet(); instead of 
TreeSet ts=new TreeSet(new MyComparator()); then internally JVM will call CompareTo() method which meant for Default natural order(ascending order). So the output will be [0,5,10,15,20]
*/