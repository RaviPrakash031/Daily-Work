import java.util.Scanner;
public class SubstringPalindromeMain{
  public static void main(String[] args){
     SubStringPalindrome a=new SubStringPalindrome();
    a.longest();
  }
}
class SubStringPalindrome{
  public void longest(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String");
    String str=sc.nextLine();
    String largest="";
    int length=str.length();
    int maxlen=0;
    for(int i=0;i<length;i++){
      for(int j=i+1;j<=length;j++){
        String subString=str.substring(i,j);
        if(isPalindrome(subString)&&subString.length()>maxlen){
          largest=subString;
          maxlen=subString.length();
        }
      }
    }
    System.out.println("The largest palindrome sub-String is "+largest+" with length of "+maxlen);
  }
  public static boolean isPalindrome(String str){
     StringBuffer str1=new StringBuffer(str);
    String duplicate=str1.toString();
    str1.reverse();
    String subS1=str1.toString();
    String subS2=duplicate;
    boolean b=subS2.equals(subS1);
    if(b)
      return true;
    else
      return false;
  }
}
