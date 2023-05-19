import java.util.Scanner;
public class UniqueValuesMain{
  public static void main(String[] args){
    UniqueValues a=new UniqueValues();
    a.unique();
  }
}
class UniqueValues{
  public void unique(){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter the no of elements");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements");
    for( int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int count=1;
    int visited[]=new int[n];
    for( int i=0;i<n;i++){
      if (visited[i]==1)
        continue;
      count=1;
      for(int j=i+1;j<n;j++){
        if(arr[i]==visited[j]){
          count=count+1;
          visited[j]=1;
        }
      }
      if(count==1){
      System.out.println("unique values are"+arr[i]);
      }
    
    
      
    }
  }
}