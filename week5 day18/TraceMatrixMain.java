//trace of a matrix


import java.util.Scanner;
public class TraceMatrixMain{
  public static void main(String[] args){
    TraceMatrix s=new TraceMatrix();
    s.matrix();
  }
}
class TraceMatrix{
  public void matrix(){
    Scanner sc=new Scanner(System.in);
    int n,m;
    System.out.println("enter the  no of rows");
    n=sc.nextInt();
    System.out.println("eneter the no of columns");
    m=sc.nextInt();
    
    System.out.println("enter the no of elements in matrix 1");
    int arr1[][]=new int[n][m];
    for(int i=0;i<n;i++)
      for( int j=0;j<m;j++)
        arr1[i][j]=sc.nextInt();
    
    
    for(int i=0;i<n;i++)
      for( int j=0;j<m;j++){
        
        System.out.println(arr1[i][j]);
      }
    System.out.println();
    
    System.out.println("after addition the elements are");
      
     int sum=0,i,j;
    for( i=0;i<n;i++){
      for( j=0;j<m;j++){
        if(i==j) {
          sum=sum+arr1[i][j];
          
        }
         
      }
    }
    System.out.println(sum);
     
        
  }
}
    