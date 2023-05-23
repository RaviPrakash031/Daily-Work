import java.util.Scanner;
public class SortingElementsMain{
  public static void main(String[] args){
    SortingElements s=new SortingElements();
    s.sorting();
  }
}
class SortingElements{
  public void sorting(){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the no of elements");
    n=sc.nextInt();
    int arr [] =new int[n];
    System.out.println("enetr the arrya elements");
    for (int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    System.out.println("the array is");
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);
    int temp=0;
    System.out.println("after sorting the array is");
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if (arr[i]<arr[j])
          continue;
        else{
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
    for(int i=0;i<arr.length;i++)
      
      System.out.println(arr[i]);
    
    
      
  }
  
}