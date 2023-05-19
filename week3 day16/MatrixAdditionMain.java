import java.util.Scanner;
public class MatrixAdditionMain{
  public static void main(String[] args){
    MatrixAddition a=new MatrixAddition();
    a.matrix();
  }
}
class MatrixAddition{
  public void matrix(){
    Scanner sc=new Scanner(System.in);
    int n,m;
    System.out.println("enter the  no of rows");
    n=sc.nextInt();
    System.out.println("eneter the no of columns");
    m=sc.nextInt();
    int arr1[][]=new int[m][n];
    System.out.println("enter the no of elements in matrix 1");
    for(int i=0;i<n;i++)
      for( int j=0;j<m;j++)
        arr1[i][j]=sc.nextInt();
      int p,q;
    System.out.println("enter the  no of rows");
    p=sc.nextInt();
    System.out.println("eneter the no of columns");
    q=sc.nextInt();
    int arr2[][]=new int[p][q];
    System.out.println("enter the no of elements martix 2");
    for(int i=0;i<p;i++)
      for( int j=0;j<q;j++)
        arr2[i][j]=sc.nextInt();
      
    int arr3[][]=new int[n][m];
     if(n==p && m==q) {
       for(int i=0;i<p;i++){
         for( int j=0;j<q;j++){
           arr3[i][j]=arr1[i][j]+arr2[i][j];
           System.out.print(arr3[i][j]+" ");
         }
       }
     }
        for(int i=0;i<p;i++){
          for( int j=0;j<q;j++){
            System.out.print(arr3[i][j]+" ");
            System.out.println();
          }
        }
  }
}
    