import java.util.Scanner;
public class EncryptionProgramMain{
  public static void main(String[] args){
    EncryptionProgram a=new EncryptionProgram();
    a.program();
    
  }
}
class EncryptionProgram{
  public void program(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String enc=" ";
    System.out.println("enter the n values to encrypt");
    int n=sc.nextInt();
    int range=0;
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      range=n+(int)ch;
      if(range>='a'&& range<='z'){
        enc=enc+(char)(ch+n);
      }
      else{
        range=range-122;
        range=range+97;
        enc=enc+(char)range;
      }
    }
    System.out.println("the encryption of the string is");
    System.out.print(enc);
      
    
    
  }
}