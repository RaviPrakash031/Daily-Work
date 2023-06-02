/*Section - 3:   - 20 marks 

Question 7: 

Scenario: You are given a string that represents a sentence. Your task is to find the most frequently occurring word in the sentence. If there are multiple words with the same highest frequency, choose the word that appears first in the sentence. 

Sample Input: 

 String sentence = "the cat and the dog jumped over the fence and ran away"; 

 Sample Output: 

 The most frequent word is: the */

import java.util.Scanner;
public class GrandTestQuestion7Main{
  public static void main(String[] args){
    GrandTestQuestion7 a=new GrandTestQuestion7();
    a.question7();
  }
}
class GrandTestQuestion7{
  public void question7(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enetr a string");
    String str=sc.nextLine();
    String frequentWord=" ";
    String word[]=str.split(" ");
    Boolean visited[]=new Boolean [word.length];
    
    for(int i=0;i<word.length;i++){
      
      if (visited[i]=true){
        continue;
      }
      int count=1;
      for(int j=i+1;j<word.length;j++){
        if (word[i]==word[j]){
          count++;
          visited[j]=true;
        }
        
      }
      if (count>0){
        frequentWord=word[i];
        
      }
      
      
    }
    System.out.println("The most frequent word is: "+frequentWord);
    
  }
}