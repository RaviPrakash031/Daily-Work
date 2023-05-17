//Linear search element of an array

import java.util.Scanner;
public class LinearSearchMain{
  public static void main(String[] args){
    LinearSearch a=new LinearSearch();
    a.array();
  }
}
class LinearSearch{
  public void array(){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[8];
    System.out.println("enter the elements");
    for( int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    System.out.println("enter the kay value");
    int key=sc.nextInt();
    int count=0;
    for( int i=0;i<arr.length;i++){
      if(key==arr[i]){
        System.out.println("key is present in position of " +i);
        count++;
      }
    }
    
    if(count==0){
         System.out.println("key is  not present in array");
    }
      
    
  }
}
      