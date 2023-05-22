import java.util.Scanner;
public class MatrixMulMain{
  public static void main(String[] args){
    MatrixMul a=new MatrixMul();
    a.matrix1();
  }
}
class MatrixMul{
  public void matrix1(){
    Scanner sc=new Scanner(System.in);
    int n,m,p,q;
    System.out.println("enter the  no of rows");
    n=sc.nextInt();
    System.out.println("eneter the no of columns");
    m=sc.nextInt();
    System.out.println("enter the  no of rows");
    p=sc.nextInt();
    System.out.println("eneter the no of columns");
    q=sc.nextInt();
    
    int arr3[][]=new int[n][m];
    int arr1[][]=new int[n][m];
    System.out.println("enter the no of elements in matrix 1");
    for(int i=0;i<n;i++)
      for( int j=0;j<m;j++)
        arr1[i][j]=sc.nextInt();
    int arr2[][]=new int[p][q];
    System.out.println("enter the no of elements martix 2");
    for(int i=0;i<p;i++)
      for( int j=0;j<q;j++)
        arr2[i][j]=sc.nextInt();
    System.out.println("after mul the elements are");
      
    
      if(n==q) {
       for(int i=0;i<p;i++){
         for( int j=0;j<q;j++){
           arr3[i][j]=0;
           for(int k=0;k<p;k++){
           arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
           System.out.print(arr3[i][j]+" ");
           }
        }
         System.out.println();
       }
     }
    else {
      System.out.println("matrix is not possible");
    }
     
        
  }
}