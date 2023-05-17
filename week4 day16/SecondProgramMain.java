//WAP for array of the cities by using string

import java.util.Scanner;
public class SecondProgramMain{
  public static void main(String[] args){
    SecondProgram a=new SecondProgram();
    a.cities();
  }
}
class SecondProgram{
  public void cities(){
    Scanner sc=new Scanner(System.in);
    String cities[]=new String[5];
  System.out.println("enter the cities names");
  for( int i=0;i<cities.length;i++)
    cities[i]=sc.nextLine();
  System.out.println("the enetred cities names  are");
  for(int i=0;i<cities.length;i++)
    System.out.println("cities[i]"+cities[i]);
  }
}