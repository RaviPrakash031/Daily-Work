import java.util.Scanner;
class Sort3{
  public void selectionSort(int arr[],int n){
    int index=0;
    for(int i=0;i<n-1;i++){
      int min=arr[i];
      for(int j=i+1;j<n;j++){
        if(arr[j]<min){
          min=arr[j];
          index=j;
        }
      }
      int temp=arr[i];
      arr[i]=min;
      arr[index]=temp;
    }
    System.out.println("Array After Sorting");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
public class SelectionSortingDemo1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Sort3 s=new Sort3();
    s.selectionSort(arr,n);
  }
}