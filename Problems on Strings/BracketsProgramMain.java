import java.util.Scanner;
public class BracketsProgramMain{
  public static void main(String[] args){
    BracketsProgram a=new BracketsProgram();
    System.out.println(a.program());
    
  }
}
class BracketsProgram{
  public int program(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String s=sc.nextLine();
    int count1=0,count2=0;
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if (ch=='('){
        count1++;
      }
      if (ch==')'){
        count2++;
      }
    }
    if(count1==count2){
      return 1;
    }
    else{
      return 0;
      
    }
    
  }
}