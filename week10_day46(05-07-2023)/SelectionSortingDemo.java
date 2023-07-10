import java.util.Scanner;
class Sort2{
  public void seletionSort(int a[],int n){
    
    for (int i = 0; i < n-1; i++) {
      int index=i; 
      for(int j = i + 1;j<n;j++){
       
        if(a[j] <a[index]) {
           
          
           index=j;
        
        }
      }
       int temp=a[i];
       a[i]=a[index];
       a[index]=temp;
    }
      /*printArray(a);
    }
    printArray(a);
      
    
    
  }
  
    
    
  

  
  static void  printArray(int a[]){*/
    System.out.println("after sorting the elements are");
    for(int i=0;i<n;i++){
      System.out.print(a[i]+"  ");
    }
    System.out.println();
    
  }
  
}
public class SelectionSortingDemo{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the size of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements in the array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Sort2 s=new Sort2();
    s.seletionSort(a,n);
  }
}