//Write a Java program that prompts the user to enter their age and prints out the number of years left until they can retire (assuming retirement age is 65)
import java.util.Scanner;
public class RetirementProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int age;
    System.out.println("enter the age");
    age=sc.nextInt();
    if (age<=65)
      System.out.println(" no of years to left fot Retirement age is" + (65-age));
    else{
      System.out.println("no retiirement age");
    }
  }
}