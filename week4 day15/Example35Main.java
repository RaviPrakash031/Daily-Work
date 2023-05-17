//35. WAP to print all ASCII character with their values.


import java.util.Scanner;
public class Example35Main{
  public static void main(String[] args){
    char ch;
    int asciiValue;
    for(ch='A';ch<=122;ch++){
    asciiValue=ch;
    System.out.println(ch+"-"+ asciiValue);
    }
  }
}