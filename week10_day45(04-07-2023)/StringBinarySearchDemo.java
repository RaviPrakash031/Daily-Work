
import java.util.Scanner;
class BinarySearch2{
  public int  binary(  String a[],int n,String key ){
    int low=0,mid,high=n-1;
    
    while(low<=high){
      mid=(low+high)/2;
      int val=key.compareTo(a[mid]);
      if (val>0){
        low=mid+1;
      }
      else if(val<0){
        
        high=mid-1;
        
      }
      else{
        return mid;
        
      }
        
    }
    return -1;
    

  }
}
public class StringBinarySearchDemo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the size of the array");
    int n=sc.nextInt();
    String a[]=new String[n];
    System.out.println("enter the elements in the array");
    sc.nextLine();
    for(int i=0;i<n;i++){
      
      a[i]=sc.nextLine();
      
      
    }
    BinarySearch2 ls=new BinarySearch2();
    System.out.println("enter the key to search");
    String key=sc.nextLine();
    
    int pos=ls.binary(a,n,key);
    if(pos!=-1){
      System.out.println("key value is found at index "+(pos));
    }
    else{
      System.out.println("key is not found");
    }
  }
}