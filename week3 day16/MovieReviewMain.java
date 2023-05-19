import java.util.Scanner;
public class MovieReviewMain{
  public static void main(String[] args){
    MovieReview a=new MovieReview();
    a.movie();
  }
}
class MovieReview{
  public void movie(){
    Scanner sc=new Scanner(System.in);
    int n,m,sum=0,avg;
    System.out.println("enter the  no of rows");
    n=sc.nextInt();
    System.out.println("eneter the no of columns");
    m=sc.nextInt();
    int arr[][]=new int[m][n];
    System.out.println("enter the no of elements");
    for(int i=0;i<m;i++)
      for( int j=0;j<n;j++)
        arr[i][j]=sc.nextInt();
    
      for(int i=0;i<arr.length;i++)
        for(int j=0;j<arr[i].length;j++){
          sum=sum+arr[i][j];
          avg=sum/m*n;
         System.out.println("average="+avg);
        }
        avg=sum/m*n;
        System.out.println("average="+avg);
       int max=arr[0][1];
       for(int i=0;i<arr.length;i++)
         if(max<arr[i][1]){
           max=arr[i][1];
        }
      System.out.println(max);
  }
}