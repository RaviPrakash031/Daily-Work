import java.util.Scanner;
public class FrequencyOfEachWordMain{
  public static void main(String[] args){
    FrequencyOfEachWord a=new FrequencyOfEachWord();
    a.frequency();
  }
}
class FrequencyOfEachWord{
  public void frequency(){
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter a string");
    String str=sc.nextLine();
    
    String[] words=str.split(" ");
   
    
    boolean visited[] = new boolean[words.length];
    int count=0;
    for (int i=0;i<words.length;i++){
      if (visited[i] == true)
        continue;
      count = 1;
      for (int j = i + 1; j < words.length; j++) {
        if (words[i] == words[j]) {
          count = count + 1;
          visited[j] = true;
        }
      }
      System.out.println(words[i]+"\t\t"+count);
    }
        
  }
}