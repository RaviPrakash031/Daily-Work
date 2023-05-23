//Menu based application on Array Operations: create an application which will display list of operations on array.
             //--> Insert an element in first index 
             //--> Insert an element in last index
             //--> Insert an element in specified index
             //--> Remove element from first index
             //--> Remove element from last index
             //--> Remove element from specified index

import java.util.Scanner;
public class InsertingDeletingProgram{
  public static void main(String[] args){
    int n,choice=0;
    Scanner sc=new Scanner(System.in);
    while(choice<7){
    System.out.println("**MENU***\n1.Insert the element at begining\n2.Insert the element at End\n3.Inser a Element at Specified Index Position\n4.Delet the element at begining\n5.Delet the element at End\n6.Delet a Element at Specified Index Position\n7.Quit");
    System.out.println("Enter the choice");
    choice=sc.nextInt();
      if(choice>0&&choice<7){
    System.out.println("Enter the n value of the array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the "+n+" values into array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    InsertingDeleting call=new InsertingDeleting();
    switch(choice){
      case 1:
        int value;
        System.out.println("Enter the value ");
        value=sc.nextInt();
        int b[]=new int[arr.length+1];
        b=call.first(arr,value);
        System.out.println("Array After Inserting new Element on First");
        for(int i=0;i<b.length;i++){
          System.out.print(b[i]+",");
        }
        System.out.println();
        break;
      case 2:
        System.out.println("Enter the value");
        value=sc.nextInt();
        b=call.insertLast(arr,value);
        System.out.println("Array After Inserting new Element on End");
        for(int i=0;i<b.length;i++)
          System.out.print(b[i]+",");
        System.out.println();
        break;
      case 3:
        int index;
        System.out.println("Enter the value");
        value=sc.nextInt();
        System.out.println("Enter the index value");
        index=sc.nextInt();
        b=call.insertSpe(arr,index,value);
        System.out.println("Array after inserting new element");
        for(int i=0;i<b.length;i++){
          System.out.print(b[i]+",");
        }
        System.out.println();
        break;
      case 4:
        int b1[]=new int[arr.length-1];
        b1=call.deletFirst(arr);
        System.out.println("Array After deleting First Element");
        for(int i=0;i<b1.length;i++){
          System.out.print(b1[i]+",");
        }
        System.out.println();
        break;
      case 5:
        b1=call.deletLast(arr);
        System.out.println("Array After deleting last Element");
        for(int i=0;i<b1.length;i++){
          System.out.print(b1[i]+",");
        }
        System.out.println();
        break;
      case 6:
        System.out.println("Enter the index value to be deleted");
        index=sc.nextInt();
        b1=call.deletSpe(arr,index);
        System.out.println("Array after Deleting a element at specified position");
        for(int i=0;i<b1.length;i++)
          System.out.print(b1[i]+",");
        System.out.println();
        break;
    }
    }
      else
        System.out.println("Program Quit");
  }
  }
}


class InsertingDeleting{
  public int[] first(int a[],int value){
    int b[]=new int[a.length+1];
    b[0]=value;
    for(int i=1;i<b.length;i++){
      b[i]=a[i-1];
    }
    return b;
  }
  public int[] insertLast(int a[],int value){
    int n;
    int b[]=new int[a.length+1];
    n=b.length;
    b[n-1]=value;
    for(int i=0;i<a.length;i++){
      b[i]=a[i];
    }
    return b;
  }
  public int[] insertSpe(int a[],int index,int value){
    int n;
    int b[]=new int[a.length+1];
    n=b.length;
    for(int i=0;i<n;i++){
      if(i<index){
        b[i]=a[i];
      }
      else if(i==index){
        b[i]=value;
      }
      else{
        b[i]=a[i-1];
      }
    }
    return b;
  }
  public int[] deletFirst(int a[]){
    int k=0;
    int b[]=new int[a.length-1];
    for(int i=1;i<a.length;i++){
      b[k++]=a[i];
    }
    return b;
  }
  public int[] deletLast(int a[]){
    int k=0;
    int b[]=new int[a.length-1];
    for(int i=0;i<b.length;i++){
      b[i]=a[i];
    }
    return b;
  }
  public int[] deletSpe(int a[],int index){
    int k=0;
    int b[]=new int[a.length-1];
    for(int i=0;i<a.length;i++){
      if(index==i)
        continue;
      b[k++]=a[i];
    }
    return b;
  }
}