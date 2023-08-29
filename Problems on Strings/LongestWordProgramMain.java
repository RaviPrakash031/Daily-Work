import java.util.Scanner;
public class LongestWordProgramMain{
  public static void main(String[] args){
    LongestWord a= new LongestWord();
    a.longest();
    
  }
}
class LongestWord{
  public void longest(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    String word[]=str.split(" ");
    int lar=word[0].length();
    String s=word[0];
    for(int i=0;i<word.length;i++){
      int num=word[i].length();
      if (lar<num)
        lar=num;
      s=word[i];

    }
    System.out.println("largest string is "+s+ "its length is "+lar);
      
      
    

  }
}