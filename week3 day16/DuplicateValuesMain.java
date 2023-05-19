//Duplicate elements in an array

import java.util.Scanner;
public class DuplicateValuesMain {
  public static void main(String[] args) {
    DuplicateValues a=new DuplicateValues();
    a.duplicate();
  }
}
class DuplicateValues{
  public void duplicate(){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of elements");
     int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int count;
    
    boolean visited[] = new boolean[n];
    for (int i = 0; i < n; i++) {
      if (visited[i] == true)
        continue;
      count = 1;
      for (int j = i + 1; j < n; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          visited[j] = true;
        }
      }
      if(count>1)
        System.out.println("duplicate values is"+arr[i]);
      if(count==1)
        System.out.println("distinct values is"+arr[i]);
    }
  }
}