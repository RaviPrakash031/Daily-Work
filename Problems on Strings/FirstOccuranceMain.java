import java.util.Scanner;
import java.lang.Math;
public class FirstOccuranceMain {
	
	public static void main(String[] args) {
    FirstOccurance a=new FirstOccurance();
    a.first();
  }
}
class FirstOccurance{
  public void first(){
    Scanner sc=new Scanner(System.in);
		int i, count= 0;
		
		sc= new Scanner(System.in);

		System.out.println("Enter String to Find First Char Occur ");
		String firstCharStr = sc.nextLine();
    
		
		System.out.println("Enter the Character to Find ");
		char ch = sc.next().charAt(0);
    System.out.println(firstCharStr.lastIndexOf("ch"));
    for(i = 0; i < firstCharStr.length(); i++)
		{
			if(firstCharStr.charAt(i) ==  ch) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println(" We haven't found the Character ");
		}
		else {
			System.out.println("The first Character Occurrence is" 
   +firstCharStr.charAt(i)+ " at index of"+i); 
		}
		
	}
}