/*
 * As a security analyst, you need to send a confidential message to your
 * colleague without anyone being able to intercept it. You remember a simple
 * way to encrypt a message by rearranging its characters. You decide to write a
 * program to quickly encrypt your message.
 *
 * The program takes the string you entered and applies the encryption method of
 * selecting even-indexed characters first, followed by odd-indexed characters.
 * The encrypted string is displayed on the screen.
 *
 * Write a program that asks the user for a string and uses this method to
 * encrypt the string
 *
 * Input format:
 *
 * The program prompts the user to enter a message to encrypt. The input should
 * be a string containing a message to encrypt.
 *
 * Output format:
 *
 * The program outputs the encrypted message by selecting even-indexed
 * characters first, followed by odd-indexed characters. The output is a string
 * containing the encrypted message.
 *
 * Sample Input1:
 *
 * message
 *
 * Sample Output1:
 *
 * msaeesg
 */


import java.util.Scanner;
public class SecurityAnalystProgramMain {
public static void main(String[] args){
  SecurityAnalystProgram a=new SecurityAnalystProgram();
  a.analyst();
}
}
class SecurityAnalystProgram{
  public void analyst(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();
    char evenstr[]=new char[10];
    char oddstr[]=new char[10];
    System.out.println("after encryption the array is ");
    for(int i=0;i<str.length();i++)
      {
        if(i%2==0)
        {
          evenstr[i]=str.charAt(i);
        
        }
        if(i%2==1)
        {
          oddstr[i]=str.charAt(i);
         
        }
      }
    System.out.print(evenstr);
    System.out.print(oddstr);
  }
}