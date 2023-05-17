//40. WAP to print all Prime numbers between 1 to n.
import java.util.Scanner;  
public class Example40Main {  
  public static void main(String[] args) {  
    Example40 b = new Example40();
    b .value();
    
   
  }
}
class Example40{
  public void value(){
    int n,i=2;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    n = sc.nextInt();
    int count = 0;
	  for (i = 2; i <= n; i++){
      if(n % i == 0){
      count++;
		  }
	  }
		if(count == 0 && n != 1 )
		{
		  System.out.print(n + " ");
		}  
	
  }
}
    