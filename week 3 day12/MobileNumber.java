// write a java program to check whether number is a valid mobile number or not( A number is valid mobile  number if it contains 10 digits)(use  only conditionals)(don't use loops)

import java.util.Scanner;
public class MobileNumber {
  public static void main(String[] args){
    long  mobileNum;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter phone number (10 digits)");
    mobileNum = scanner.nextLong();
    if((mobileNum/1000000000)>0 && ((mobileNum/1000000000)<10 ))
      System.out.println("Valid Mobile number");
    else
       System.out.println("invalid mobile number");
  }
}
