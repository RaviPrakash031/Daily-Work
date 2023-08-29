//You are working on a stock market analysis tool that helps investors analyze historical stock prices. This tool allows users to input an array of stock prices for a specific stock and identifies the minimum and maximum prices to help users make informed investment decisions.You are tasked with writing a program in Java to accomplish this.
import java.util.Scanner;
public class StockMarketProgramMain{
  public static void main(String[] args){
    StockMarketProgram a=new StockMarketProgram();
    a.stock();
  }
}
class StockMarketProgram{
  public void stock(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    int n=sc.nextInt();
    
    System.out.println("enter the stock market prices");
    double arr[]=new double[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextDouble();
    }
    double max= arr[0];
    for(int i=0;i<n;i++){
      if(max < arr[i])
        max=arr[i];
    }
    double min= arr[0];
    for(int i=0;i<n;i++){
      if(min > arr[i])
        min=arr[i];
    }
    System.out.println("maximum price is:"+ max);
    System.out.println("manimum price is:"+ min);
  }
}
    
  