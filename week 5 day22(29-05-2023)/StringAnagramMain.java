//write a java program to  check whether two strings are anagrams or not 
import java.util.Scanner;

public class StringAnagramMain{
  public static void main(String[] args){
    StringAnagramProgram a=new StringAnagramProgram();
    a.program();
  }
}
class StringAnagramProgram{
  public void program(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a  first string");
    String s1=sc.nextLine();
    System.out.println("enter a second string");
    String s2=sc.nextLine();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    String word1[]=s1.split(" ");
    String word2[]=s2.split(" ");
    if(s1.length() == s2.length()) {
      for(int i=0;i<word1.length;i++){
        String w1=word1[i];
        String w2=word2[i];
        for(int j=0;j<w1.length();j++){
          char ch1=w1.charAt(j);
          char ch2=w2.charAt(j);
          
          System.out.println(ch1);
          System.out.println(ch2);
          boolean result = w1.equals(w2);
          if(result) {
            System.out.println("s1 and s2   are anagram");
          }
          else {
            System.out.println("s1 and s2 not  are anagram");
          }
        }
      }
          
          
        
    }
  }
}