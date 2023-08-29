import java.util.Scanner;
public class FrequencyOfLastMain{
  public static void main(String[] args){
    FrequencyLast a=new FrequencyLast();
    a.frequency();
  }
}
class FrequencyLast{
  public void frequency(){
    Scanner sc=new Scanner(System.in);
    System.out.println("eneter a string");
    String str=sc.nextLine();
    String[] words=str.split(" ");
   
    String a=words[words.length-1];
    boolean visited[] = new boolean[a.length()];
    int count=0;
    for (int i=0;i<a.length();i++){
      if (visited[i] == true)
        continue;
      count = 1;
      for (int j = i + 1; j < a.length(); j++) {
        if (a.charAt(i) == a.charAt(j)) {
          count = count + 1;
          visited[j] = true;
        }
      }
      System.out.println(a.charAt(i)+"\t\t"+count);
    }
        
  }
}