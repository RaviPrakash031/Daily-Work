
import java.util.Scanner;
class WordsCountMain{
  public static void main(String[] args){
    WordCount cu=new WordCount();
    cu.count();
  }
}
class WordCount{
  public void count(){
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter a string");
    String str=sc.nextLine();
    int count=str.split("\\s").length;
    System.out.println(count);
  }
}