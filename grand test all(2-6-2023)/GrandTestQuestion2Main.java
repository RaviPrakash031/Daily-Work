/*You are developing a program to analyse a text message. The program should allow the user to enter a string and perform various operations on it, such as counting the number of characters, finding the occurrence of a specific word, find longest and smallest word. 

Note: if two words are having same length, print the last word of the order.  

Sample Input and Output: 

Enter a text string: Hello, how are you doing today 

Number of characters: 30 

Enter a word to find frequency: how 

Occurrences of "how": 1 

Longest word: today 

Smallest word: you */

import java.util.Scanner;

public class GrandTestQuestion2Main {
  public static void main(String[] args) {
    GrandTestQuestion2 a = new GrandTestQuestion2();
    a.question2();

  }
}

class GrandTestQuestion2 {
  public void question2(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the text string");
    String str=sc.nextLine();
    System.out.println("enter a word to find frequency");
    String key=sc.nextLine();
    String longest=" ",smallest=" ";
    int count=0;
    String word[]=str.split(" ");
    int length=str.length();
    System.out.println("Number of characters: "+length);
    for(int i=0;i<word.length;i++){
      if(word[i].equals(key)){
        count++;
      }
    }
    System.out.println("occorences of " +key + ":"+count);
    int longestWord=word[0].length();
    for(int i=0;i<word.length;i++){
      if(word[i].length()>=longestWord){
        longestWord=word[i].length();
        longest=word[i];
      }
    }
    System.out.println("Longest word: "+longest);
    int smallestWord=word[0].length();
    for(int i=0;i<word.length;i++){
      if(word[i].length()<=smallestWord){
        smallestWord=word[i].length();
        smallest=word[i];
      }
    }
    System.out.println("Smallest word: "+smallest);
      
         
      

  }
}