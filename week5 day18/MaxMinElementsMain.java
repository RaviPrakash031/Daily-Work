//write a java program to find the maximum and minimum element of two dimensional array along with index values
import java.util.Scanner;
public class MaxMinElementsMain{
  public static void main(String[] args){
    MaxMinElements mr = new MaxMinElements();
    mr.findMinMax();
      }
}
class MaxMinElements{
  public void findMinMax(){
    Scanner sc = new Scanner(System.in);
    int m,n;
    int maxm=0,maxn=0,minm=0,minn=0;
    System.out.println("enter number of rows");
      m = sc.nextInt();
    System.out.println("enter number of columns");
      n = sc.nextInt();
    int arr[][] = new int[m][n];
    System.out.println("enter array elements");
    for(int i=0;i<arr.length;i++)
      for(int j=0;j<arr[i].length;j++)
        arr[i][j] = sc.nextInt();
    int max = arr[0][0];
    int min = arr[0][0];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(max<arr[i][j]){
          max=arr[i][j];
          maxm=i;
          maxn=j;
        }
        if(min>arr[i][j]){
          min=arr[i][j];
          minm=i;
          minn=j;
        }
      }
    }
    System.out.println("maximum array element is "+max+" which is at row index "+maxm+" and column index "+maxn);
    System.out.println("minimum array element is "+min+" which is at row index "+minm+" and column index "+minn);
  }
}
 
 