//5. Calculator: Create a class called Calculator that can perform basic arithmetic operations and a custom exception called InvalidExpressionException that should be thrown when the expression to be evaluated is invalid.
import java.util.Scanner;
class InvalidExpressionException extends Exception{
  InvalidExpressionException(String msg){
    super(msg);
  }
}
class calculator{
  int number1;
  int number2;
  calculator(int number1,int number2){
    this.number1=number1;
    this.number2=number2;
    
  }
  public int getNumber1(){
    return number1;
  }
  public int getNumber2(){
    return number2;
  }
}
public class CalculatorException{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
  
    System.out.println("enter the number");
    int n=sc.nextInt();
    System.out.println("enter the another number");
    int m=sc.nextInt();
    
    calculator c=new calculator(n,m);
    System.out.println("enter the expression symbol");
    sc.nextLine();
    String exp=sc.nextLine();
    switch(exp){
      case "+":
        System.out.println("sum of two numbers are"+c.getNumber1()+c.getNumber2());
        break;
      case "-":
        System.out.println("sub of two numbers"+c.getNumber1()+c.getNumber2());
        break;
      case "*":
        System.out.println("product of two numbers"+c.getNumber1()+c.getNumber2());
        break;
      case "/":
        System.out.println("divide of two numbers"+c.getNumber1()+c.getNumber2());
        break;
      default:
        try{
      
        throw new InvalidExpressionException("Symbol is not found");
      }
          catch(InvalidExpressionException e){
      System.out.println("InvalidExpressionException"+e.getMessage());
      
      
    }
    
    }
    
    
    
    
    
  }
  

}





    
    


