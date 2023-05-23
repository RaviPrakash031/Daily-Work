//write a java program to read the array elements and then display the following menu.1. find the sum of array elements2. find the maximum and minimum elements3. reverse the array elements 4. find the prime elements of the array. now read the choice from the user and perform appropriate action

import java.util.Scanner;
public class ArrayDisplayProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    ArrayDisplay a=new ArrayDisplay();
    
    
    int n;
    System.out.println("enter the elements");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("array elements are");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    System.out.println("***Menu*****");
    System.out.println("1.finding sum of elements are\n2.finding the maximum and minimum elements are\n3.reverse the array elements are\n4.prime elements are");
    System.out.println("enter ur choice");
    int choice;
    choice=sc.nextInt();
    switch (choice) {
      case 1:
        int add=a.sum(arr);
        
        System.out.println("sum of elements are "+add);
        break;
      case 2:
        int maximum=a.max(arr);
        int minimum=a.min(arr);
        System.out.println("maximum of elements are "+maximum);
        System.out.println("minimum of elements are "+minimum);
        break;
      case 3:
        System.out.println("after reverse elements are");
        a.rev(arr);
        for(int i=0;i<n;i++)
    
        System.out.println(arr[i]);
        break;
    }
  }
}
class ArrayDisplay{
  public int sum(int a[]){
    int add=0;
      for(int i=0;i<a.length;i++)
        add=add+a[i];
      return add;
  }
  public int max(int a[]){
    int max=a[0];
    for(int i=0;i<a.length;i++)
      if(max<a[i])
        max=a[i];
    return max;
  }
  public int min(int a[]){
    int min=a[0];
    for(int i=0;i<a.length;i++)
      if(min>a[i])
        min=a[i];
    return min;
  }
  public int[] rev(int a[]){
    int temp=0,i=0,j=a.length;
      for(i=0,j=a.length-1;i<j;i++,j--){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
      return a;
  }
}
  
  //public int[] prime(int a[]){
    //int i=0,count=0;
    //int a1[]=new int[a.length];
    //a[j]=sc.nextInt();
    //for (int i=0;i<=a.length;i++){
      //for(int j=1;j<a.length;j++){
        //if (a[i]%j==0){
          //count=count+1;
        //}
      //}
      //if(count==2)
        //j++;
    //}
  //}
   
  
    
