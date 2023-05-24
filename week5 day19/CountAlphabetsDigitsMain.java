//program for count of alphabets ,digits and special characters in a string
import java.util.Scanner;
public class CountAlphabetsDigitsMain{
  public static void main(String[] args){
    CountAlphabetDigit ba=new CountAlphabetDigit();
    ba.count();
  }
}
class CountAlphabetDigit{
  public void count(){
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter a string");
    String str=sc.nextLine();

    int countAlphabets=0;
    int countDigits=0;
    int countSpecial=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if ((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')){
        countAlphabets++;
        
      }
      else if(ch>='0' && ch<='9'){
        countDigits++;
      }
      else{
        countSpecial++;
      }
      
    }
    System.out.println("no of alphabets is "+countAlphabets);
    System.out.println("no of digits is "+countDigits);
    System.out.println("no of special is "+countSpecial);
  }
}