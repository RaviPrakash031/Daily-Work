//Count of vowels and Consonants in a String
import java.util.Scanner;
public class CountVowelsConsonantsMain{
  public static void main(String[] args){
    CountVowelsConsonants ba=new CountVowelsConsonants();
    ba.count();
  }
}
class CountVowelsConsonants{
  public void count(){
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter a string");
    String str=sc.nextLine();

    int countVowels=0;
    int countConsonant=0;
    
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if ((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z')){
        if ((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')|| (ch=='A'|| ch=='E' || ch=='I' 
           || ch=='O' ||ch=='U')){
          countVowels++;
        }
        else{
          countConsonant++;
        }
        
      }
    }
    System.out.println("no of vowels is "+countVowels);
    System.out.println("no of consonant is "+countConsonant);
  }
}