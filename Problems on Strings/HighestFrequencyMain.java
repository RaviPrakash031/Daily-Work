import java.util.Scanner;
public class HighestFrequencyMain{
  public static void main(String[] args){
    HighestFrequency a=new HighestFrequency();
    a.high();
  }
}
class HighestFrequency{
  public void high(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    int count[]=new int[300];
    for(int i=0;i<str.length();i++)
      count[str.charAt(i)]++;
    int lar=0;
    char result=' ';
    int i=0;
    for(int j=i+1;j<str.length();j++){
      if(lar<count[str.charAt(j)]){
        lar=count[str.charAt(j)];
        result=str.charAt(j);
        
        
      }
      
    }
    System.out.println( "largest frequency of character is"  + result);
    
    
  }
}
