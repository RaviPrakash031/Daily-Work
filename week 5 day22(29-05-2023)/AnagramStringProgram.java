//write a java program to  check whether two strings are anagrams or not 
import java.util.Scanner;
import java.util.Arrays;
public class AnagramStringProgram{
  public static void main(String[] args){
    AnagramString a=new AnagramString();
    a.program();
  }
}
class AnagramString{
  public void program(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a  first string");
    String s1=sc.nextLine();
    System.out.println("enter a second string");
    String s2=sc.nextLine();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    if(s1.length() == s2.length()) {
      char[] charArray1 = s1.toCharArray();
      char[] charArray2 = s2.toCharArray();
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      System.out.println(charArray1);
      System.out.println(charArray2);
      boolean result = Arrays.equals(charArray1, charArray2);
      if(result) {
        System.out.println("s1 and s2   are anagram");
      }
      else {
        System.out.println("s1 and s2 not  are anagram");
      }
    }
  }
}