//write a java program to generate a random integer and also read an integer from the user and print matched if both are matched else print not matched//

import java.util.Scanner;
import java.lang.Math;
public class RandomInteger{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("random integer is " +Math.random());
    float n;
    System.out.println("enter the  integer" );
    n=sc.nextFloat();
   
    if (Math.random()==n){
      System.out.println("both are matched");
    }
    else{
      System.out.println("both are not matched");
    }
  }
}