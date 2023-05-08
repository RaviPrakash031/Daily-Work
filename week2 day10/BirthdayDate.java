//Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class BirthdayDate{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter ur date of birth(YYYY-MM-DD):");
    String birthDate=sc.nextLine();
    LocalDate birthdate=LocalDate.parse(birthDate);
    LocalDate currentDate=LocalDate.now();
    Period age=Period.between(birthdate,currentDate);
    System.out.println("your age is"+age.getYears() +"years,"+age.getMonths()+"months"+age.getDays()+"days");
   int age_In_Years=age.getYears();
    if(age_In_Years>18){
     System.out.println("minor");
    }
    else{
     System.out.println("adult");
    }
  }
}