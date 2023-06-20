/*Challege 4:
Scenario:
You are tasked with developing a contact management system for a personal organizer application. The system should allow users to create, read, update, and delete contacts. As a software developer, your task is to create a program that can perform these operations using object-oriented programming concepts, interface implementation, and exception handling.
Task:
Write a Java program that implements a contact management system using classes and interfaces. The classes should include Contact, PersonalContact, and ContactManager. The interface should include CRUD operations.
The Contact class should have the following instance variables:
contactId: The unique identifier of the contact.
name: The name of the contact.
email : The email address of the contact.
phoneNumber :The phone number of the contact.
The PersonalContact class should inherit from the Contact class and add additional instance variables specific to personal contacts, such as address 
Input:
create
Enter Contact ID: 1
Enter Name: John
Enter Email: john@example.com
Enter Phone Number: 1234567890
create
Enter Contact ID: 2
Enter Name: Jane
Enter Email: jane@example.com
Enter Phone Number: 9876543210
Enter Address (if applicable): Personal 123 Main St
read
Enter Contact ID: 1
update
Enter Contact ID: 2
Enter New Name: JaneUpdated
Enter New Email: jane.updated@example.com
Enter New Phone Number: 9999999999
delete
Enter Contact ID: 1
read
Enter Contact ID: 1
 
Output:
Contact created successfully.
Contact created successfully.
Contact Details:
Contact ID: 1
Name: John
Email: john@example.com
Phone Number: 1234567890
Contact updated successfully.
Contact deleted successfully.
Contact not found.*/

import java.util.Scanner;
class contact{
  int contactId;
  String name;
  String email;
  long phone;
  public contact(int contactId,String name,String email,long phone){
    this.contactId=contactId;
    this.name=name;
    this.email=email;
    this.phone=phone;
  }
}
/*class PersonalContact extends Contact{
  stirng address;
  PersonalContact(int contactId,String name,String email,lond phone,String address){
    super(contactId,name,email,phone)
    this.address=address;
    
      
    }
    
  }
  public void read(){
      
    System.out.println("")
      
    }
}
public class GrandTest3Challenge4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PersonalContact a[]=new PersonalContact[2];
    for(int i=0;i<2;i++){
      System.out.println("create");
      System.out.print("contact Id");
      int contactId=sc.nextInt();
      System.out.print("enter the name:");
      String name=sc.nextLine();
      System.out.print("enter the aemail:");
      String email=sc.nextLine();
      System.out.print("enter the phone");
      long phone=sc.nextLong();
      System.out.println("enter the address");
      String address=sc.nextLine();
      System.out.println("read");
      System.out.println("ender the contact id:");
      a[i]=new PersonalContact()
    }
  }
}*/