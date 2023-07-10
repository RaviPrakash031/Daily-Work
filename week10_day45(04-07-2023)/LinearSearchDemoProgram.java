import java.util.Scanner;
class LinearSearch1{
  public int linear(  int a[],int n,int key ){
    for(int i=0;i<a.length;i++){
      if(a[i]==key){
        return i;
      }
    }
    return -1;
  }
}
public class LinearSearchDemoProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetr the size of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements in the array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    LinearSearch1 ls=new LinearSearch1();
    System.out.println("enter the key to search");
    int key=sc.nextInt();
    
    int pos=ls.linear(a,n,key);
    if(pos!=-1){
      System.out.println("key value is found at index "+(pos));
    }
    else{
      System.out.println("key is not found");
    }
  }
}