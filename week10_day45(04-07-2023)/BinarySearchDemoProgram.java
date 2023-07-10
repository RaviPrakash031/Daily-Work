import java.util.Scanner;
class BinarySearch1{
  public int linear(  int a[],int n,int key ){
    int low=0,mid,high=n-1;
    while(low<=high){
      mid=(low+high)/2;
      if(a[mid]==key){
        return mid;
      }
      else if(key>a[mid]){
        low=mid+1;
      }
      else{
        high=mid-1;
      }
        
    }
    return -1;

  }
}
public class BinarySearchDemoProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the size of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements in the array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    BinarySearch1 ls=new BinarySearch1();
    System.out.println("enter the key to search");
    int key=sc.nextInt();
    
    int pos=ls.linear(a,n,key);
    if(pos!=-1){
      System.out.println(+key+" value is found at index "+(pos));
    }
    else{
      System.out.println("key is not found");
    }
  }
}