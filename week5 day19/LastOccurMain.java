import java.util.Scanner;

public class LastOccurMain {
	
	public static void main(String[] args) {
    LastOccur a=new LastOccur();
    a.last();
  }
}
class LastOccur{
  public void last(){
    Scanner sc=new Scanner(System.in);
		int i, count= 0;
		
		sc= new Scanner(System.in);

		System.out.println("Enter String to Find First Char Occur ");
		String lastCharStr = sc.nextLine();
		
		System.out.println("Enter the Character to Find ");
		char ch = sc.next().charAt(0);
    System.out.println(lastCharStr.lastIndexOf("ch"));
    for(i =lastCharStr.length()-1; i >=0; i--)
		{
			if(lastCharStr.charAt(i) ==  ch) {
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Sorry! We haven't found the Character ");
		}
		else {
			System.out.println("The last Character Occurrence is" 
   +lastCharStr.charAt(i)+ " at index of"+i); 
					
		}
		
		
	}

}