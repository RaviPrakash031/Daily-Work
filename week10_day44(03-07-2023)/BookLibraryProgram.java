import java.util.*;
class Book20{
   static String LibraryName=" Dhanekula Library"; 
  private static int nextId=1;
  int id;
  private String name;
  private String title;
  private double price;
  private int pages;
  private String author;
  private String dateOfPublishing;
  private String publisherName;
  Book20(String name,String title,double price,int pages ,String author,String dateOfPublishing,String publisherName){
  this.id=nextId++;
  this.name=name;
  this.title=title;
  this.price=price;
  this.pages=pages;
  this.author=author;
  this.dateOfPublishing=dateOfPublishing;
  this.publisherName=publisherName;
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
  public int getPages(){
    return pages;
  }
  public String getAuthor(){
    return author;
  }
  public String getDateOfPublishing(){
    return dateOfPublishing;
  }
  public String getPublisherName(){
    return publisherName;
  }
}
class Libraries{
  HashMap<Integer,Book20> hs=new HashMap<>();
  public void addBookDetails(Book20 b){
    hs.put(b.getId(),b);
  }
  public void  displayBookDetails(){
    boolean check=hs.isEmpty();
    if(check==false){
      for(Book20 emp:hs.values()){
        System.out.println("Displying all the book details");
        System.out.println("Book Id:"+emp.getId());
        System.out.println("Book name:"+emp.getName());
        System.out.println("Book title:"+emp.getTitle());
        System.out.println("Book Price:"+emp.getPrice());
        System.out.println("Book Pages:"+emp.getPages());
        System.out.println("Book author:"+emp.getAuthor());
        System.out.println("Date of publishing"+emp.getDateOfPublishing());
        System.out.println("Publisher name:"+emp.getPublisherName());
      }
    }
    else{
      System.out.println("collection is empty");
    }
  }
  public Book20 addBookDetailsById(int id){
    return hs.get(id);
  }
  public ArrayList<Book20> addBookDetailsByTitle(String title){
    ArrayList<Book20> al=new ArrayList<Book20>();
    for(Book20 b:hs.values()){
      if(b.getTitle().equalsIgnoreCase(title)){
        al.add(b);
      }
    }
    return al;
    
  }
  public ArrayList<Book20> addBookDetailsByPrice(double maxPrice,double minPrice){
    ArrayList<Book20> al1=new ArrayList<>();
    for(Book20 b2:hs.values()){
      if(b2.getPrice()<=maxPrice && b2.getPrice()>=minPrice){
        al1.add(b2);
      }
    }
    return al1;
  }
  public ArrayList<Book20> addBookByAuthor(String author){
    ArrayList<Book20> al2=new ArrayList<>();
    for(Book20 b3:hs.values()){
      if(b3.getAuthor().equalsIgnoreCase(author)){
        al2.add(b3);
      }
    }
    return al2;
  }
}
public class BookLibraryProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Libraries l=new Libraries();
    while(true){
      System.out.println("********welcome to book management system**********");
      System.out.println("1.add the details of the book\n2.displaydetails of the book\n3.display details by id\n4.dispaly details by title\n5.display details of the book by price of the book\n6.display detils pf the book by author");
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
          System.out.println("enter the pages ");
          int pages =sc.nextInt();
          System.out.println("enter the author name");
          sc.nextLine();
          String author=sc.nextLine();
          System.out.println("enter the date of the publishing");
          sc.nextLine();
          String dateOfPublishing=sc.nextLine();
          System.out.println("enter the publisher name");
          String publisherName=sc.nextLine();
          Book20 b=new Book20(name,title,price ,pages ,author,dateOfPublishing,publisherName);
          l.addBookDetails(b);
          break;
        case 2:
          l.displayBookDetails();
          break;
        case 3:
          System.out.println("ebter the id");
          int id=sc.nextInt();
          Book20 b1=l.addBookDetailsById(id);
          if(b1!=null){
            System.out.println("details of nthe book by is are");
            System.out.println("Book Id:"+b1.getId());
        System.out.println("Book name:"+b1.getName());
        System.out.println("Book title:"+b1.getTitle());
        System.out.println("Book Price:"+b1.getPrice());
        System.out.println("Book Pages:"+b1.getPages());
        System.out.println("Book author:"+b1.getAuthor());
        System.out.println("Date of publishing"+b1.getDateOfPublishing());
        System.out.println("Publisher name:"+b1.getPublisherName());
          }
          else{
            System.out.println("no details found for that id");
          }
          break;
        case 4:
          System.out.println("enter the title");
          sc.nextLine();
          String title1=sc.nextLine();
          ArrayList<Book20> l2=l.addBookDetailsByTitle(title1);
          if(l2!=null){
            for(Book20 b2:l2){
              System.out.println("display book details by title");
              System.out.println("Book Id:"+b2.getId());
        System.out.println("Book name:"+b2.getName());
        System.out.println("Book title:"+b2.getTitle());
        System.out.println("Book Price:"+b2.getPrice());
        System.out.println("Book Pages:"+b2.getPages());
        System.out.println("Book author:"+b2.getAuthor());
        System.out.println("Date of publishing"+b2.getDateOfPublishing());
        System.out.println("Publisher name:"+b2.getPublisherName());
          }
          }
          else{
            System.out.println("no details fournd for that title");
          }
          break;
        case 5:
          System.out.println("enetr the min and max price of the book");
            double maxPrice=sc.nextDouble();
            double minPrice=sc.nextDouble();
            ArrayList<Book20> l3=l.addBookDetailsByPrice(maxPrice,minPrice);
            if(l3!=null){
              for(Book20 b3:l3){
                System.out.println("display book details by price are");
                System.out.println("Book Id:"+b3.getId());
        System.out.println("Book name:"+b3.getName());
        System.out.println("Book title:"+b3.getTitle());
        System.out.println("Book Price:"+b3.getPrice());
        System.out.println("Book Pages:"+b3.getPages());
        System.out.println("Book author:"+b3.getAuthor());
        System.out.println("Date of publishing"+b3.getDateOfPublishing());
        System.out.println("Publisher name:"+b3.getPublisherName());
          }
          }
          else{
            System.out.println("no details fournd for that price");
          }
          break;
        case 6:
            System.out.println("enetr the author");
          sc.nextLine();
            String author1=sc.nextLine();
            ArrayList<Book20> l4=l.addBookByAuthor(author1);
            if(l4!=null){
              for(Book20 b4:l4){
                System.out.println("Display book ny author are");
                System.out.println("Book Id:"+b4.getId());
        System.out.println("Book name:"+b4.getName());
        System.out.println("Book title:"+b4.getTitle());
        System.out.println("Book Price:"+b4.getPrice());
        System.out.println("Book Pages:"+b4.getPages());
        System.out.println("Book author:"+b4.getAuthor());
        System.out.println("Date of publishing"+b4.getDateOfPublishing());
        System.out.println("Publisher name:"+b4.getPublisherName());
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


  
  
  
  
  
