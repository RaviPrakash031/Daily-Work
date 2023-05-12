/*Suppose you are withdrawing money from the ATM.Suppose available notes are 500,200 and 100 in the ATM.
User has asked for withdrawal of money from the ATM.
Write an program to determine the minimum number of notes to be dispensed to the user for the required money.*/
import java.util.Scanner;
public class Notes{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int amount,min_Notes=0,notes;
    System.out.println("enter the amount");
    amount = sc.nextInt();
    if(amount>=500)
      {
        notes = amount/500;
        min_Notes = min_Notes+notes;
        amount = amount%500;
      }
      if(amount>=200)
      {
        notes = amount/200;
        min_Notes = min_Notes+notes;
        amount = amount%200;
      }
      if(amount>=100)
      {
        notes = amount/100;
        min_Notes = min_Notes+notes;
        amount = amount%100;
      }
      System.out.println("minimum number of notes are :"+min_Notes);
    
  }
}