/*Challenge 3:
Scenario:
You are building a student management system for a school that allows teachers to manage student information. The system should be able to add new students, display student details, calculate average marks, and handle exceptions for invalid inputs. Your task is to create a Java program that implements the necessary classes and methods to achieve these functionalities.
Instructions:
Create a class called "Student" with the following instance variables:
studentId 
name 
marks 
The "Student" class should have the following methods:
A constructor that takes the student ID, name, marks, and total number of subjects as parameters and initializes the instance variables.
Add a method that displays the student's ID, name, and marks for each subject.
Add a method to calculates and returns the average marks of the student.
Custom exception handling for invalid inputs:
Create a custom exception class called "InvalidMarkException" that extends the Exception class. This exception should be thrown when a mark is less than 0 or greater than 100.
In the main method of the program, create multiple Student objects with different student IDs, names, marks, and total subjects. Demonstrate the functionality of the Student class by calling the necessary methods to display student details and calculate average marks. Handle any possible exceptions that may occur.

Sample Output:
Welcome to the Student Management System!
Student Details:
Student ID: S001
Name: John Doe
Marks:
Subject 1: 85
Subject 2: 90
Subject 3: 92
Subject 4: 78
Subject 5: 87
Average Marks: 86.4

Student Details:
Student ID: S001
Name: John Doe
Marks:
Subject 1: 85
Subject 2: 90
Subject 3: 92
Subject 4: 78
Subject 5: -5
Exception: InvalidMarkException - Invalid mark entered: -5*/

import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidMarkException extends Exception{
  InvalidMarkException(String msg){
    super(msg);
  }
}
class Student8{
String studentId ;
 String name ;
  int subject1;
  int subject2;
  int subject3;
  int subject4;
  int subject5;
  
  
  
  
  public Student8(String studentId, String name, int subject1,  int  subject2,int subject3,int subject4,int subject5){
    this.studentId=studentId;
    this.name=name;
    this.subject1=subject1;
    this.subject2=subject2;
    this.subject3=subject3;
    this.subject4=subject4;
    this.subject5=subject5;
  }
  public void display(){
    try{
    System.out.println("student details");
    System.out.println("Student id:"+studentId);
    System.out.println("Name:"+name);
    System.out.println("Marks:");
    System.out.println("Subject1:"+subject1);
    System.out.println("Subject2:"+subject2);
    System.out.println("Subject3:"+subject3);
    System.out.println("Subject4:"+subject4);
    
    System.out.println("Subject5:"+subject5);
      if(subject5<0){
        throw new InvalidMarkException("amount is greater than the balance");
      }
    }
  
    catch(InvalidMarkException e){
        System.out.println("InvalidMarkException - Invalid mark entered: ");
    }
  }
    public void avgMarks(){
    
    double sum=0,avg=0;
    sum=subject1+subject2+subject3+subject4+subject5;
    avg=sum/5;
    System.out.println("Average Marks: "+avg);
    
    
    
  }
  
    
  
}
public class GrandTest3Challenge3{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of details");
    int n=sc.nextInt();
    
    Student8 a[]=new Student8[n];
    for(int i=0;i<n;i++){
      
      System.out.println("enter the "+(i+1)+"details"); 
      System.out.print("student Id:");
      String studentId=sc.nextLine();
        sc.nextLine();
      System.out.print("Student Name:");
      String name=sc.nextLine();
      
      System.out.print("Subject1:");
      int subject1=sc.nextInt();
      System.out.print("Subject2:");
      int subject2=sc.nextInt();
      System.out.print("Subject3:");
      int subject3=sc.nextInt();
      System.out.print("Subject4:");
      int subject4=sc.nextInt();
      System.out.print("Subject5:");
      int subject5=sc.nextInt();
        
      a[i]=new Student8(studentId,name,subject1,subject2,subject3,subject4,subject5);
    
    }
    System.out.println("Welcome to student management system");
    for(int i=0;i<a.length;i++){
    
    a[i].display();
    a[i].avgMarks();
    sc.nextLine();
    }
  }
  
}
