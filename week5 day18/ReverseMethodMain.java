import java.util.Scanner;
public class ReverseMethodMain{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the elements");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("array elements are");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      
    }
    System.out.println("after reverse the elemenss are");
    
    ReverseMethod s=new ReverseMethod();
    
    s.sum(arr);
    for(int i=0;i<n;i++)
    
      System.out.println(arr[i]);
  } 
}
class ReverseMethod{
  public int[] sum(int a[]){
    int temp=0,i=0,j=a.length;
      for(i=0,j=a.length-1;i<j;i++,j--){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
       return a;
    
    
  }
}