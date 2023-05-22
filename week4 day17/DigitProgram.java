//WAP to input any character and check whether it is alphabet, digit    or special character.
import java.util.Scanner;
public class DigitProgram
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any  character");
        ch=sc.next().charAt(0);
       
        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                    System.out.println(ch + " is an alphabet.");
        }
            else{
                    System.out.println(ch + " is not an alphabet.");
            }
         if (ch >='0' && ch <='9'){
           System.out.println(ch + " is an digit.");
        }
           else{
             System.out.println(ch + " is an special symbol.");
           }
    }
}