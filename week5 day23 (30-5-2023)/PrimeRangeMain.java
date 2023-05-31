/*Given an integer n, return the number of prime numbers that are strictly less than n.
 Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.*/

import java.util.Scanner;
public class PrimeRangeMain{
  public static void main(String[] args){
    PrimeRange a=new PrimeRange();
    a.prime();
  }
}
class PrimeRange{
  public void prime(){
    Scanner sc=new Scanner(System.in);
    int n,count1=0;
    System.out.println("enter the value of n");
    n=sc.nextInt();
    for(int i=2;i<n;i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          count++;
        }
      }
      if(count==2){
        count1++;
      }
    }
      
    
    System.out.println("the prime numbers are  "+count1);
    
    
    
  }
}