/*Question: 8 

You are given a string consisting of lowercase alphabets and digits. Write a Java program to find the length of the longest consecutive substring that contains an equal number of vowels and consonants. You can assume that there will be at least one such substring in the given string. Consider 'a', 'e', 'i', 'o', 'u' as vowels, and all other characters as consonants. The substring should consist of consecutive characters in the original string. 

For example, if the input string is "aabeedkjrthio", the longest consecutive substring that satisfies the condition is "eedkjrthio" with a length of 10, as it contains 5 vowels ('e', 'e', 'o', 'i', 'o') and 5 consonants ('d', 'k', 'j', 'r', 't'). 

Sample Input: 

 Enter a string:    

 Sample Output: 

 Length of the Longest Consecutive Substring: 6 

Explanation: In the input string "abceiokudr", the longest consecutive substring that contains an equal number of vowels and consonants is "ceioku" with a length of 6. It has 3 vowels ('e', 'i', 'o') and 3 consonants ('c', 'k', 'u'). 
  */
import java.util.Scanner;
public class GrandTestQuestion8Main{
  public static void main(String[] args){
    GrandTestQuestion8 a=new GrandTestQuestion8();
    a.question8();
  }
}
class GrandTestQuestion8{
  public void question8(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr a string");
    String str=sc.nextLine();
    String s1=str.substring(2,str.length()-2);
    System.out.println(s1);
    int consonant=0,count=0,count1=0,count2=0;
    for(int i=0;i<s1.length();i++){
      char ch=s1.charAt(i);
      if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
        
        
        System.out.println("it is an vowels"+ch);
      }
    
      else{
        consonant=consonant+s1.charAt(i);
        count2++;
      }
    }
    if(count1==count2){
      count++;
    }
    
    
    System.out.println(count);
    
  }
}
    
    

