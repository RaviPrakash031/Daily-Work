import java.util.Scanner;
public class ReverseStringProgram{
  public static void main(String[] args){
    ReverseStringPro a=new ReverseStringPro();
    a.reverse();
  }
}
class ReverseStringPro{
  public void reverse(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a  string");
    String str=sc.nextLine();
    String word[]=str.split(" ");
    for(int i=0;i<word.length;i++){
      String revWord="  ";
      String w=word[i];
      for(int j=w.length()-1;j>=0;j--){
        revWord=revWord+w.charAt(j);
      }
      System.out.print(revWord);
    }
   
      
  }
}