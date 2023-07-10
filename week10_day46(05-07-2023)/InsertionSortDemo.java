import java.util.Scanner;
class Sort1{
  public void insertionSort(int a[],int n){
    
      for (int i = 1; i < n; ++i) {
        int key = a[i];
        int j = i - 1;
        while (j >= 0){
         if(a[j] > key) {
          a[j + 1] = a[j];
          j = j - 1;
         }
          else{
          break;
          }
        }
        a[j + 1] = key;
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
public class InsertionSortDemo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the size of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements in the array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Sort1 s=new Sort1();
    s.insertionSort(a,n);
  }
}