//WAP for array of the integers values

import java.util.Scanner;
public class FirstProgramMain{
  public static void main(String[] args){
    FirstProgram a=new FirstProgram();
    a.array();
  }
}
class FirstProgram{
  public void array(){
    Scanner sc=new Scanner(System.in);
    int marks[]=new int[5];
  System.out.println("enter the elements");
  for( int i=0;i<marks.length;i++)
    marks[i]=sc.nextInt();
  System.out.println("the enetred elements are");
  for(int i=0;i<marks.length;i++)
    System.out.println("marks[i]="+marks[i]);
  }
}