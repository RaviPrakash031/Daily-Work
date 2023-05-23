//Transpose of a matrix

import java.util.Scanner;
public class TransposeMatrixMain{
  public static void main(String[] args){
    TransposeMatrix s=new TransposeMatrix();
    s.matrix();
  }
}
class TransposeMatrix{
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
    
    
    
    
    System.out.println(" the transpose of a matrix are");
    
     int sum=0,i;
    for( i=0;i<m;i++){
      for( int j=0;j<n;j++){
        
        System.out.print(arr1[j][i]+" ");
      }
      System.out.println();
      
      
    }
    
     
        
  }
}
    