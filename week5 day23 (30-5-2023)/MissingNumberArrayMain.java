/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 
 
Example 1:
 
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:
 
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
Example 3:
 
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/


import java.util.Scanner;
import java.util.Arrays;
public class MissingNumberArrayMain{
  public static void main(String[] args){
    MissingNumberArray a=new MissingNumberArray();
    a.missing();
  }
}
class MissingNumberArray{
  public void missing(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of array elements");
    int num=sc.nextInt();
    int arr[]=new int[num];
    int sum=0,sum1=0,missing=0;
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++)
      arr[i]=sc.nextInt();
    System.out.println("enter the n value");
    int n=sc.nextInt();
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    for(int i=0;i<=n;i++){
      sum1=sum1+i;
    }
    missing=sum1-sum;
    System.out.println("Missing number is "+missing);
    
    
  }
}