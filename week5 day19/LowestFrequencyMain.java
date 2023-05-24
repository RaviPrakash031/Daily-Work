import java.util.Scanner;
public class LowestFrequencyMain{
  public static void main(String[] args){
    LowestFrequency a=new LowestFrequency();
    a.lowest();
  }
}
class LowestFrequency{
  public void lowest(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String str=sc.nextLine();
    int count[]=new int[200];
    for (int i=0;i<str.length();i++){
      count[str.charAt(i)]++;
    }
    int low=0;
    char result=' ';
    int i=0;
    for(int j=i+1;j<str.length();j++){
      if(low>count[str.charAt(j)]){
        low=count[str.charAt(j)];
        result=str.charAt(j);
      }
    }
    System.out.println("lowest frequency is "+result);
  }
}