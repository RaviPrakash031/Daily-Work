/*Challenge 5:
You are working on a project that involves analyzing an array of integers. The task is to count the number of elements in the array that have specific properties, such as being divisible by a given number, having a digit sum greater than a certain value, being a perfect number, or having a repeating digit. You decide to create a program to automate this counting process.
Task: Write a Java program to count the number of elements in an array that have specific properties. The program should prompt the user to enter the size of the array and then input the elements of the array dynamically. After inputting the array elements, the program should count the number of elements that have each specific property and display the results.
 Input:
Welcome to the Array Analysis Program!
Enter the size of the array: 6
Enter element 1: 25
Enter element 2: 12
Enter element 3: 49
Enter element 4: 28
Enter element 5: 136
Enter element 6: 333

Enter the number by which the elements should be divisible: 5
Enter the digit sum threshold: 10

Output:
Number of elements divisible by 5: 1
Number of elements with digit sum greater than 10: 2
Number of perfect Number elements: 1
Number of elements with repeating digits: 1*/

import java.util.Scanner;
class ArrayAnalysis{
  public int division(int arr[],int div){
    int divCount=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%div==0){
        divCount++;
      }
      
    }
    return divCount;
    
  }
  public int digitSum(int arr[],int threshold){
    int digitCount=0;
    for(int i=0;i<arr.length;i++){
      int sum=0,digit=0;
      int val=arr[i];
      while(val>0){
        digit=val%10;
        sum=sum+digit;
        val=val/10;
        
      }
      if (sum<threshold){
        digitCount++;
        
      }
      
    }
    return digitCount;
    
  }
  public int isPerfect(int arr[]){
    int sum=0,perCount=0;
    for(int i=0;i<arr.length;i++){
      for(int j=1;j<arr.length;j++){
        if(arr[i]%j==0){
          sum=sum+j;
          
        }
        if(sum==arr[i]){
          perCount++;
        }
      }
    }
    return perCount;
  }
  public int repeting(int arr[]){
    int repCount=0;
    for(int i=0;i<arr.length;i++){
      int digit=0,rep=0;
      int number=arr[i];
      while(number>0){
        digit=arr[i]%10;
        number/=10;
        if(digit==rep){
        repCount++;
          break;
        }
        else{
          rep=digit;
        }
      }
    }
    return repCount;
  }

  
}
public class GrandTest3Challenge5{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("welcome to array analysis program");
    System.out.print("enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      System.out.println("enter element:"+(i+1));
      arr[i]=sc.nextInt();
      
    }
    int threshold=0,div;
    System.out.print("Enter the number by which the elements should be divisible: ");
    div=sc.nextInt();
    
    System.out.print("Enter the digit sum threshold: ");
    sc.nextInt();
    ArrayAnalysis call=new ArrayAnalysis();
    int divValue=call.division(arr,div);
    int valueSum=call.digitSum(arr,threshold);
    int Perfect=call.isPerfect(arr);
    int repeat=call.repeting(arr);
    System.out.print("Number of elements divisible by 5: "+divValue);
    System.out.print("Number of elements with digit sum greater than 10:"+valueSum);
    System.out.print("Number of perfect Number elements:"+Perfect);
    System.out.print("Number of elements with repeating digits:"+repeat);
  }
}