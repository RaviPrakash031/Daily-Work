//write a java program to find the largest, second largest and third largest element of the one dimensional array
import java.util.Scanner;
public class LargestArrayElement{
  public static void main(String[] args){
    Array a = new Array();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
    System.out.println("array is:");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + ",");
    }
    System.out.println();
    a.sortArray(arr);
  }
}
class Array{
  public void sortArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      
      for(int j=i+1;j<arr.length;j++){
      if(arr[i]<arr[j]){
        int temp=arr[j];
        arr[j] =arr[i];
        arr[i] = temp;
      }
    }
      
    }
    System.out.println("First largest element is "+arr[0]);
    System.out.println("Second largest element is "+arr[1]);
    System.out.println("Third largest element is "+arr[2]);
  }
}
