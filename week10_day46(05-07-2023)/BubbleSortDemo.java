import java.util.Scanner;
class Sort{
  public void bubbleSort(int a[],int n){
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-(i+1);j++){
        if(a[j]>a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
      printArray(a);
    }
    printArray(a);
  }
  
   static void  printArray(int a[]){
     System.out.println("after sorting the elements are");
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+"  ");
    }
     System.out.println();
    
  }
  
}
public class BubbleSortDemo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the size of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements in the array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Sort s=new Sort();
    s.bubbleSort(a,n);
  }
}