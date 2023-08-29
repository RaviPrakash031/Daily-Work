import java.util.Scanner;
public class ReverseStringMain{
  public static void main(String[] args){
    ReverseString a=new ReverseString();
    a.reverse();
  }
}
class ReverseString{
  public void reverse(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enetre a string");
    String str=sc.nextLine();
    String rev="  ";
    
    for(int i=str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    System.out.println("reversed string is"+rev);
      
      
  }
}