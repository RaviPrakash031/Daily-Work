import java.util.*;
class Book5{
  String title;
  double price;
  String author;
  Book5(String title,double price,String author){
    this.title=title;
    this.price=price;
    this.author=author;
  }
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public double getPrice() {
	return price;
}
public void setName(double price) {
	this.price = price;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
  

}
public class BookCollection{
  public static void  main(String[] args){
    ArrayList<Book5> a=new ArrayList<Book5>();
    Book5 book1=new Book5("Machines",230.45,"ravi");
    Book5 book2=new Book5("CS",245,"praaksh");
    Book5 book3=new Book5("DCS",280,"prasad");
    a.add(book1);
    a.add(book2);
    a.add(book3);
    for(int i=0;i<a.size();i++){
      Book5 book=a.get(i);
      System.out.println("Book title is "+book.getTitle());
      System.out.println("Book price is "+book.getPrice());
      System.out.println("Book author is "+book.getAuthor());
      System.out.println();
    }
    for(Book5 book:a){
      System.out.println("Book title is "+book.getTitle());
      System.out.println("Book price is "+book.getPrice());
      System.out.println("Book author is "+book.getAuthor());
      System.out.println();
    }
      
    
  }
}