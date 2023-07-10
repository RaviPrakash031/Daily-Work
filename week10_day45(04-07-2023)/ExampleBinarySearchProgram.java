/*Write a program to find a target element in a given array using the binary search technique. The program should then check if the target element is a prime number or not and print an appropriate message.
Here's a sample input and output for the above question:
-------------------------------------------------------------
Sample Input:
A = [23,45,67,78,86,90]
Target element is: 67
Expected Output:
67 is present in 2nd index position and it is a prime number*/
import java.util.Scanner;
class BinarySearch3{
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
public class ExampleBinarySearchProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the size of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements in the array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    BinarySearch3 ls=new BinarySearch3();
    System.out.println("enter the key to search");
    int key=sc.nextInt();
    
    int pos=ls.linear(a,n,key);
    if(pos!=-1){
      int count=0;
      for(int i=1;i<key;i++){
        if(key%i==0){
          count++;
        }
      }
      if(count>2){
      System.out.println(+key+" value is found at index "+(pos)+"and it is not a prime number");
      }
      else{
        System.out.println(+key+" value is found at index "+(pos)+"and it is  a prime number");
      }
      

    }
    else{
      System.out.println("key is not found");
    }
  }
}