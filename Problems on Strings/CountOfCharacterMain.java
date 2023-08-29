//WAP to count occurrences of a character in given string.
import java.util.Scanner;

public class CountOfCharacterMain {
	
	public static void main(String[] args) {
    CountOfCharacter a=new CountOfCharacter();
    a.first();
  }
}
class CountOfCharacter{
  public void first(){
    Scanner sc=new Scanner(System.in);
		int i, count= 0;
		
		sc= new Scanner(System.in);

		System.out.println("Enter String to Find First Char Occur ");
		String firstCharStr = sc.nextLine();
    
		
		System.out.println("Enter the Character to Find ");
		char ch = sc.next().charAt(0);
    
    for(i = 0; i < firstCharStr.length(); i++)
		{
			if(firstCharStr.charAt(i) ==  ch) {
				count++;
				
			}
		}
    System.out.println("count of character is" +count);
  }
}