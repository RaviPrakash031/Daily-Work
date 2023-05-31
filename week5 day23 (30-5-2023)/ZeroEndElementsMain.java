//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 
//Note that you must do this in-place without making a copy of the array.
 
 
//Example 1:
 
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]

import java.util.Scanner;
import java.util.Arrays;
public class ZeroEndElementsMain{
  public static void main(String[] args){
    ZeroEndElements a=new ZeroEndElements();
    a.zero();
  }
}
class ZeroEndElements{
  public void zero(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    
    int a[]=new int[n];
    System.out.println("enter the elements in to an array");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int j=0;
    System.out.println("after changing array elements are");
    for(int i=0;i<a.length;i++){
      if(a[i]!=0){
          a[j++]=a[i];
        }
    }
    for (int i=j;i<a.length;i++)
      a[i]=0;
    for (int i=0;i<a.length;i++){
      System.out.print(a[i]+"  ");
    }
  }
}