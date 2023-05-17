import java.util.Scanner;
public class SumKeyElements{
  public static void main(String[] args){
    SumKey a=new SumKey();
    a.sum();
  }
}
class SumKey{
  public void sum(){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    
    System.out.println("enter the elements");
    for( int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    System.out.println("enter the kay value");
    int key=sc.nextInt();
    int sum=0 ,i,j;
    for(  i=0;i<arr.length;i++){
      for(  j=1;j<=arr.length;j++){
        
        if (sum==key){
          sum=arr[i]+arr[j];
          System.out.println("sum of key elements are"+i);
          
        }
        
        
      }
      System.out.println("sum of key elements are"+j);
      
      
    }
    
    
    
  }
}
      