//You are working on a text editor application that allows users to write sentences. As part of an enhancement to the application, you need to implement a feature that automatically capitalizes the first letter of each word in a sentence. This will make the text appear more visually appealing and adhere to standard writing conventions. You are tasked with writing a program in Java to accomplish this.For example, if the user enters "the quick brown fox jumps over the lazy dog", the program should output "The Quick Brown Fox Jumps Over The Lazy Dog".

import java.util.Scanner;
public class CapitalFirstProgram{
  public static void main(String[] args){
    CapitalFirst a=new CapitalFirst();
    a.capital();
  }
}
class CapitalFirst{
  public void capital(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String s=" ";
    String word[]=str.split(" ");
    
    for(int i=0;i<word.length;i++){
      String w=word[i];
      for(int j=0;j<w.length();j++){
        char ch=w.charAt(0);
        if(ch>='a' && ch<='z'){
        String first=String.valueOf(ch);
        
        first=first.toUpperCase();
        s=first+w.substring(1);
        word[i]=first+w.substring(1);
        }
        
      }
    }
      s=String.join(" ",word);
      System.out.print(s);

    
    
      
      
    
  }
}