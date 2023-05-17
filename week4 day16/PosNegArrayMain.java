//WAP for the finding the number of negative and posotive elements in an array

import java.util.Scanner;
public class PosNegArrayMain{
  public static void main(String[] args){
    PosNeg a=new PosNeg();
    a.array();
  }
}
class PosNeg{
  public void array(){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[8];
    System.out.println("enter the elements");
    for( int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    int count1=0,count2=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]>0){
      count1=count1+1;
      }
      else{
      count2=count2+1;
      }
    }
    System.out.println("no of positive elements are="+count1);
    System.out.println("no of negative elements are="+count2);
    
  }
}
  