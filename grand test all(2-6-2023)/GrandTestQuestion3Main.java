/*You are a software developer working on a student grade analysis program. Your task is to develop a program that allows users to enter the grades for each student and perform various operations, such as calculating the average grade, finding the highest and lowest grades, and determining the number of students who passed or failed based on a pass mark of 50. 

Sample Input and Output: 

Welcome to the Student Grade Analyzer! 

Enter the number of students: 5 

Enter the grades for each student: 

Student 1: 85 

Student 2: 90 

Student 3: 76 

Student 4: 68 

Student 5: 92 

 

Average Grade: 82.2 

Highest Grade: 92 

Lowest Grade: 68 

Passing Grade: 70 

Number of students who passed: 3 

Number of students who failed: 2 

Thank you for using the Student Grade Analyzer! */





import java.util.Scanner;
public class GrandTestQuestion3Main{
  public static void main(String[] args){
    GrandTestQuestion3 a=new GrandTestQuestion3();
      a.question3();
    
  }
}
class GrandTestQuestion3{
  public void question3(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no of students");
    int n=sc.nextInt();
    System.out.println("enter the marks of each student");
    /*System.out.println ("student1");
    float a=sc.nextFloat();
    System.out.println ("student2");
    float b=sc.nextFloat();
    System.out.println ("student3");
    float c=sc.nextFloat();
    System.out.println ("student4");
    float d=sc.nextFloat();
    System.out.println ("student5");
    float e=sc.nextFloat();
    float  sum=0,avarage;
    sum=a+b+c+d+e;
    avarage=sum/500*100;
    System.out.println(avarage);*/
    int a[]=new int[n];
    
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      
    }
    int sum=0;
    float avg=0;
    for(int i=0;i<n;i++){
      
      sum=sum+a[i];
      avg=(float)sum/(5);
    }
    System.out.println(avg);
    int high=a[0];
    for(int i=0;i<a.length;i++){
      if(high<a[i])
        high=a[i];
    }
    System.out.println("Highest Grade: "+high);
    int low=a[0];
    for(int i=0;i<a.length;i++){
      if(low>a[i])
        low=a[i];
    }
    System.out.println("Lowest Grade: "+low);
    int count=0,count1=0;
    for(int i=0;i<a.length;i++){
      
      if(a[i]>70){
        count++;
      }
      else{
        count1++;
      }
    }
    System.out.println("Number of students who  passed " +count);
      System.out.println("Number of students who failed "+count1); 
  }
}