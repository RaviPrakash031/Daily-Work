//write aprogram to find vowels in a given string 
public class MockInterviewProgram{
  public static void main(String[] args){
    String str="Ravi Praksh";
    System.out.print("vowels are");
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if (ch=='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u'){
        System.out.println(" "+ch);
      }
    }
  }
}