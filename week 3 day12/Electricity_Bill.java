import java.util.Scanner;
public class Electricity_Bill{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int units;  
      float total_bill;
    System.out.println("enter the units");
    units=sc.nextInt();
    if (units>=50)
      total_bill=(float)units*(float)0.50;
    else if(units<=150)
      total_bill=(float)((units-50)*0.75)+(float)25;
    else if(units<=250)
      total_bill=(float)((units-150)*1.20)+(float)(100);
    else{
      total_bill=(float)((units-250)*1.50+(float)(220));
    }
    total_bill=total_bill+total_bill+(float)0.20;
    System.out.println("total bill is"+total_bill);
  }
}