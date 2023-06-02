/*Question 5: 

You are developing a program to analyse and manipulate email addresses. The program should allow the user to enter an email address and perform various operations such as checking if the email address is valid, extracting the username and domain, and generating a masked email address. 

Note:  

   1. Email id does not starts with special characters and does not allow white spaces between characters. 

    2. Email id should end with domain and should contains ‘@’ symbol.  

Input: 

String email = "example@email.com"; 

Output: 

Is the email address valid? true 

Username: example 

Domain: email.com 

Masked Email: e******@email.com */
import java.util.Scanner;
public class GrandTestQuestion5Main{
  public static void main(String[] args){
    GrandTestQuestion5 a=new GrandTestQuestion5();
      a.question5();
    
  }
}
class GrandTestQuestion5{
  public void question5(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the email");
    String str=sc.nextLine();
    String username=" ",domain=" ",maskedmail="";
    int index=str.indexOf(" ");
    int index1=str.indexOf("@");
    if (index==-1){
      for(int i=0;i<index1;i++){
        username=username+str.charAt(i);
      }
      System.out.println("Usermail: "+username);
      for(int i=index1+1;i<str.length();i++){
        domain=domain+str.charAt(i);
      }
      System.out.println("Domain: "+domain);
      for(int i=0;i<str.length();i++ ){
        if(i==0 || i>=index1){
          maskedmail=maskedmail+str.charAt(i);
        }
        else{
          maskedmail=maskedmail+"*";
        }
      }
      System.out.println("Masked Email: "+maskedmail);
    }
    else{
      System.out.println("is the email is not valid");
    }
  }
}
      
      
      
    


      
    
