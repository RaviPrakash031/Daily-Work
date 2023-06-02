/*Question 4: 

You are given an array of integers. The array contains both positive and negative numbers. Your task is to find the two numbers in the array whose sum is closest to zero. If there are multiple pairs with the same absolute sum, return the pair with the smallest positive number. 

Write a Java program that takes an array of integers as input and returns the two numbers whose sum is closest to zero. 

Input: 

int[] nums = {1, 5, -4, -2, 9, -7, 3}; 

Output: 

result = [-2, 1] */

import java.util.Scanner;
public class GrandTestQuestion4Main{
  public static void main(String[] args){
    GrandTestQuestion4 a=new GrandTestQuestion4();
      a.question4();
    
  }
}
class GrandTestQuestion4{
  public void question4(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array");
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("enter the elements in to array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      
    }
    int sum=0,check=0,num1=0,num2=0,neg=0,pos=0;
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        sum=a[i]+a[j];
        if(sum==1&&sum==-1){
          
          num1=a[i];
          num2=a[j];
            
        }
        else{
          num1=a[i];
          num2=a[j];
        }
        
      }
    }
    System.out.println(num1+","+num2);
  }
}
