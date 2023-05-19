//program to find the frequency of array elements
import java.util.Scanner;
 
public class FrequencyElementsMain {
  public static void main(String[] args) {
    FrequencyElements a=new FrequencyElements();
    a.frequency();
  }
}
class FrequencyElements{
  public void frequency(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of elements");
     int n=sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter the array elements");
    for (int i = 0; i < n; i++)
      arr[i] = sc.nextInt();
    int count;
    System.out.println("element\tcount");
    boolean visited[] = new boolean[8];
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
      System.out.println(arr[i] + "\t\t" + count);
 
    }
 
  }
}