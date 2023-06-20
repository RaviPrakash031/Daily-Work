/*Challenge 2:
Scenario: Online Shopping Platform Product Data Input
You are a software developer working for an online shopping platform. The platform allows customers to purchase a wide variety of products. Your task is to develop a program that allows the platform administrators to input product data dynamically and validate the inputs according to specific requirements. The program should also display the data for all the products entered.
As per the requirements, each product should have the following attributes: productId, productName, price, category, and quantityInStock. The program should enforce the following validations:
1.	productId: A unique 4-digit number.
2.	productName: A name between 2 and 50 characters in length.
3.	price: A positive value (in dollars).
4.	category: The category or type of the product.
5.	quantityInStock: A positive integer indicating the quantity of the product available in stock.
Your task is to implement a Java program that fulfills these requirements. The program should allow the user to input data for five products dynamically. Each product's data should be validated according to the mentioned rules. After inputting the data for all five products, the program should display the entered product data for verification.
In addition, you are required to add a custom exception for the price attribute. If the price entered for a product is not a positive value, an InvalidPriceException should be thrown with an appropriate error message.
Write the Java program that implements the above requirements, including input validation and displaying the product data.

Example Input and Output:
Sample Input:
Enter data for product 1:
Product ID: P001
Product Name: Laptop
Price: 1500.0
Category: Electronics
Quantity in Stock: 10

Enter data for product 2:
Product ID: P002
Product Name: T-Shirt
Price: -34.4
Category: Clothing
Quantity in Stock: 50

Output:
Product ID: P001
Product Name: Laptop
Price: 1500.0
Category: Electronics
Quantity in Stock: 10

Product ID: P002
Product Name: T-Shirt
InvalidPriceException : Invalid price format, please enter a positive value
Category: Clothing
Quantity in Stock: 50*/



import java.util.Scanner;
class Product8{
  int ProductId;
  String name;
  float price;
  String category;
  int quantity;
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
  
}
public class GrandTest3Challenge2{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    Product8 obj[]=new Product8[2];
    for(int i=0;i<2;i++){
      obj[i]=new Product8();
      System.out.println("enter the product Id");
      int ProductId=sc.nextInt();
      obj[i].setProductId(ProductId);
      System.out.print("enter the product name");
      String name=sc.nextLine();
      sc.nextLine();
      obj[i].setName(name);
    System.out.print("enter the price");
    float price=sc.nextFloat();
    if (price>0){
      obj[i].setPrice(price);
    }
    System.out.println("enter the category");
    String category=sc.nextLine();
    obj[i].setCategory(category);
    sc.nextLine();
    System.out.println("enter the quantity");
    int quantity=sc.nextInt();
    obj[i].setQuantity(quantity);
    }
    for(int i=0;i<obj.length;i++){
      System.out.println("Product Id: "+obj[i].getProductId());
      System.out.println("Product Name: "+obj[i].getName());
      System.out.println("Price: "+obj[i].getPrice());
      System.out.println("Category: "+obj[i].getQuantity());
      System.out.println("Quantity: "+obj[i].getQuantity());
    }
  }
}
