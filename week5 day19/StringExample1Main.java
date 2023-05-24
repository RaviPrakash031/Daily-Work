//Program frequency of a character in a string

import java.util.Scanner;
public class StringExample1Main{
  public static void main(String[] args){
    StringExample1 ba=new StringExample1();
    ba.count();
  }
}
class StringExample1{
  public void count(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
   
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      
      int count;
        System.out.println("character   count");
         boolean visited[] = new boolean[str.length()];
        for ( i = 0; i < str.length(); i++) {
          if (visited[i] == true)
            continue;
          count = 1;
          for (int j = i + 1; j < str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
              count = count + 1;
              visited[j] = true;
            }
          }
          System.out.println(str.charAt(i)+"\t\t"+count);
        }
    }
  }
}