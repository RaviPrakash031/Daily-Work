/*Challenge- 1: 

As a manager of a book shop, you are responsible for managing all the operations related to books in the shop. You have a system that stores all the book details(book_id, title, author, price) in an ArrayList of Book objects. 

Your task is to create a Java program that helps you manage the book shop efficiently.  

Create a console-based menu-driven program that allows the user to perform the following operations: 

1. Add books 

2. Calculate total price of all books 

3. Remove a book by book_id 

4. Update book price by book_id 

5. Search books by author 

6. Quit the program 

If no books are found for the given author name, the method should throw a custom exception called BookNotFoundException with an appropriate error message. 

Each menu option should call the corresponding method and display the results or appropriate error messages. */

import java.util.*;
import java.util.*;
class Book25{
  private static int nextId=1;
  int id;
  private String name;
  private String title;
  private double price;
  private String author;
 Book25(String name,String title,double price ,String author){
  this.id=nextId++;
  this.name=name;
  this.title=title;
  this.price=price;
  this.author=author;
  
  }
  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return id;
  }
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public String getTitle(){
    return title;
  }
  public double getPrice(){
    return price;
  }
 
  public String getAuthor(){
    return author;
  }
  
}
class Libraries1{
  HashMap<Integer,Book25> hs=new HashMap<>();
  public void addBookDetails(Book25 b){
    hs.put(b.getId(),b);
  }
  
  public Book25 removeDetailsById(int id){
    return hs.remove(id);
  }
  public void updateBook(int nextId, int id) {
        for(Book25 b:hs.values()){
            if (b.getId() == nextId) {
                b.setId(id);
                System.out.println(" book updated successfully.");
                return;
            }
        }
        System.out.println("book not found.");
    }
  public ArrayList<Book25> addBookDetailsByTitle(String title){
    ArrayList<Book25> al=new ArrayList<Book25>();
    for(Book25 b:hs.values()){
      if(b.getTitle().equalsIgnoreCase(title)){
        al.add(b);
      }
    }
    return al;
    
  }
 
  public ArrayList<Book25> addBookByAuthor(String author){
    ArrayList<Book25> al2=new ArrayList<>();
    for(Book25 b3:hs.values()){
      if(b3.getAuthor().equalsIgnoreCase(author)){
        al2.add(b3);
      }
    }
    return al2;
  }
}
public class GrandTest4Challenge1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Libraries1 l=new Libraries1();
    while(true){
      System.out.println("********welcome to book management system**********");
      System.out.println("1.add the details of the book\n2.price of all books\n3.remove the book\n4.update the book\n5.display detils pf the book by author\n5.exit");
      System.out.println("enter the choice");
      int choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("enter the name:");
          sc.nextLine();
          String  name=sc.nextLine();
          System.out.println("enter the title:");
          String title=sc.nextLine();
          System.out.println("enter the price");
          double price=sc.nextDouble();
          System.out.println("enter the author name");
          sc.nextLine();
          String author=sc.nextLine();
         Book25 b=new Book25(name,title,price ,author);
          l.addBookDetails(b);
          break;
        case 2:
          
        System.out.println("enter the id update id");
          int id1=sc.nextInt();
          int id2=sc.nextInt();
          l.updateBook(id1,id2);
        case 3:
          System.out.println("ebter the id");
          int id=sc.nextInt();
          Book25 b1=l.removeDetailsById(id);
          if(b1!=null){
            System.out.println("Removed book details are:");
            System.out.println("Book Id:"+b1.getId());
        System.out.println("Book name:"+b1.getName());
        System.out.println("Book title:"+b1.getTitle());
        System.out.println("Book Price:"+b1.getPrice());
        
        System.out.println("Book author:"+b1.getAuthor());
       
          }
          else{
            System.out.println("no details found for that id");
          }
          break;
        
       
         
        
        case 5:
            System.out.println("enetr the author");
          sc.nextLine();
            String author1=sc.nextLine();
            ArrayList<Book25> l4=l.addBookByAuthor(author1);
            if(l4!=null){
              for(Book25 b4:l4){
                System.out.println("Display book ny author are");
                System.out.println("Book Id:"+b4.getId());
        System.out.println("Book name:"+b4.getName());
        System.out.println("Book title:"+b4.getTitle());
        System.out.println("Book Price:"+b4.getPrice());
        
        System.out.println("Book author:"+b4.getAuthor());
       
          }
          }
          else{
            System.out.println("no details fournd for that author");
          }
          break;
        }
    }
  }
}
