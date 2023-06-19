//Library Management System: Create classes for "Book" and "Author" that represent books and authors in a library. The Book class should have properties such as title, author, ISBN, and publisher, and methods such as getTitle, getAuthor, and setAuthor. The Author class should have properties such as name, email, and a list of books, and methods such as getName, getEmail, and addBook.
import java.util.Scanner;
class Book{
  String title;
  String author;
  int ISBN;
  String Publisher;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getISBN() {
	return ISBN;
}
public void setISBN(int iSBN) {
	ISBN = iSBN;
}
public String getPublisher() {
	return Publisher;
}
public void setPublisher(String publisher) {
	Publisher = publisher;
}
}
  

class Author extends Book{
  String name;
  String email;
 int bookList;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = super.author;
  
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void setBookList(int list){
  bookList=list;
}
  public int addBook(int newList){
    bookList+=newList;
    return bookList;
  }
}
class LibraryManagementSystem{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value");
    int n=sc.nextInt();
    sc.nextLine();
    Author obj[]=new Author[n];
    

    for(int i=0;i<n;i++){
      obj[i]=new Author();
      System.out.print("enter the title");
      String title=sc.nextLine();
      obj[i].setTitle(title);
      sc.nextLine();
      System.out.print("enter the author name:");
      String author=sc.nextLine();
      obj[i].setAuthor(title);
      System.out.print("enter the ISBN name:");
      int iSBN=sc.nextInt();
      obj[i].setISBN(iSBN);
      System.out.print("enter the publisher name:");
      String Publisher=sc.nextLine();
      obj[i].setPublisher(Publisher);
      sc.nextLine();
      System.out.print("enter the  name:");
      String name=sc.nextLine();
      obj[i].setName(name);
      System.out.print("enter the email name:");
      String email=sc.nextLine();
      obj[i].setEmail(email);
      System.out.print("enter the no of books:");
      obj[i].setBookList(n);
      
      
    }
    for(int i=0;i<obj.length;i++){
      System.out.println("Options on "+(0+i)+" Book");
      System.out.println("1.Get Title\n2.Get Author\n3.Get name\n4.Get Email\n5.Add Book\nSelect one Option");
      int m=sc.nextInt();
      switch(m){
        case 1:
          System.out.println("Title of the Book is: "+obj[i].getTitle());
          break;
        case 2:
          System.out.println("Author of the Book is: "+obj[i].getAuthor());
          break;
        case 3:
          System.out.println("Name of the Author is: "+obj[i].getName());
          break;
        case 4:
          System.out.println("Email address of the Author is: "+obj[i].getEmail());
          break;
        case 5:
          System.out.println("Enter the number of books to be Add");
          int list=sc.nextInt();
          System.out.println("Total Books list After adding new Books: "+obj[i].addBook(list));
          break;
        default:
          System.out.println("Invalid option");
      }
    }
  }
}

      
      
    
    
    
   
    
    
  
