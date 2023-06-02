/*Question 6: 

Scenario: You are given two strings, s1 and s2, each containing only lowercase letters. Your task is to determine if s2 is a rotation of s1. s2 is a rotation of s1, so the function returns true otherwise false 

Question: Write a Java program that checks if one string is a rotation of another. Implement a logical approach using strings to determine the rotation. 

Sample Input: 

 String s1 = "abcd"; 

String s2 = "cdab"; 

 Sample Output: 

 Is s2 a rotation of s1? true 

Hint: 

Consider the string "abcd". If we rotate it by one position to the left, we get "bcda". If we continue rotating it, we get "cdab", "dabc", and finally, if we rotate it by one more position to the left, we get back to the original string "abcd". 
*/


import java.util.Scanner;

public class GrandTestQuestion6Main {
  public static void main(String[] args) {
    GrandTestQuestion6 a = new GrandTestQuestion6();
    a.question6();

  }
}

class GrandTestQuestion6 {
  public void question6(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the text string 1");
    String str1=sc.nextLine();
    System.out.println("enter a text string 2");
    String str2=sc.nextLine();
    if (str1.length() != str2.length()) {  
      System.out.println("length is not same");
    }
    String str3 = str1 + str1;
    if (str3.contains(str2)) 
      System.out.println("Is s2 a rotation of s1? true" ); 
    else  
      System.out.println("Is s2 a rotation of s1? false ");

  }
}