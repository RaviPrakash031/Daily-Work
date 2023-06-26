//3. Online Store: Create a class called Product that represents a product in an online store, and a class called Store that represents the store. The store class should have methods to add, remove, and display products. You can also create a custom exception called ProductNotFoundException to throw when a product is not found in the store.
import java.util.Scanner;
class InvalidProductException extends Exception{
  InvalidProductException(String msg){
    super(msg);
  }
}
class Product_1{
  String name;
  double price;
  int quantity;
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
  return name;
  }
  public void setPrice(double price){
    this.price=price;
  }
  public double getPrice(){
  return price;
  }
  public void setQuantity(int quantity){
    this.price=price;
  }
  public int getQuantity(){
  return quantity;
  }
}
class Store extends Product_1{
  Scanner sc=new Scanner(System.in);
  public void addProduct(Product_1 pro[]){
    Product_1 newPro[]=new Product_1[pro.length+1];
    int j=newPro.length-1;
    newPro[j]=new Product_1();
    for(int i=0;i<pro.length;i++){
      newPro[i]=pro[i];
    }
    System.out.println("enter product name to add");
    newPro[j].setName(sc.nextLine());
    System.out.println("netr the prodyct price:");
    newPro[j].setPrice(sc.nextDouble());
    System.out.println("enter the product quantity" );
    newPro[j].setQuantity(sc.nextInt());
    for(int i=0;i<pro.length;i++){
      System.out.println("Product Name:"+newPro[i].getName());
      System.out.println("Product price:"+newPro[i].getPrice());
      System.out.println("Priduct Quantity"+newPro[i].getQuantity());
    }
    
    
  }
  public void removeProduct(Product_1 pro[],int index){
    Product_1 newPro[]=new Product_1[pro.length-1];
    int k=0;
    for (int i=0;i<pro.length;i++){
      if(index==i){
        continue;
      }
      else{
      newPro[k++]=pro[i];
      }
    }
    for(int i=0;i<newPro.length;i++){
      System.out.println("Product name"+newPro[i].getName());
      System.out.println("Product Price:"+newPro[i].getPrice());
      System.out.println("Product Quantity"+newPro[i].getQuantity());
      
      
    }
    
    
  }
  public void displayProduct(Product_1 pro[],int index){
    try{
      if(pro.length-1<index){
        throw new InvalidProductException("product not found");
        
      }
      else{
        for(int i=0;i<pro.length;i++){
          if(i!=index)
            continue;
          else{
            System.out.println("Product Name:"+pro[i].getName());
            System.out.println("Product Price"+pro[i].getPrice());
            System.out.println("product Quantity"+pro[i].getQuantity());
          }
        }
      }
    }
    catch(InvalidProductException e){
      System.out.println("exception"+e.getMessage());
    }
    
    
  }
}
public class OnlineStoreHandling{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the count of the products");
    int n=sc.nextInt();
    Product_1 pro[]=new Product_1[n];
    for(int i=0;i<n;i++){
      pro[i]=new Product_1();
      System.out.println("enterthe "+(i+1)+"product details");
      sc.nextLine();
      System.out.println("enter the product name");
      pro[i].setName(sc.nextLine());
      System.out.println("enter the prodyct price");
      pro[i].setPrice(sc.nextDouble());
      
      System.out.println("enter the quantity product");
      pro[i].setQuantity(sc.nextInt());

    }
    for(int i=0;i<n;i++){
      System.out.println("product id:"+pro[i].getName());
      System.out.println("product price:"+pro[i].getPrice());
      System.out.println("product id:"+pro[i].getQuantity());
    }
    System.out.println("1.addEmployee\n2.removeEmployee\n3.displayEmployee\nSelect an option");
    System.out.println("enter the choice");
    int choice=sc.nextInt();
    Store s=new Store();
    switch(choice){
      case 1:
        s.addProduct(pro);
        break;
      case 2:
        
        
        System.out.println("enter the index to remove product");
        int ind=sc.nextInt();
        s.removeProduct(pro,ind);
        break;
      case 3:
        System.out.println("enter the index vlue");
        int index=sc.nextInt();
        s.displayProduct(pro,index);
        break;
      default:
        System.out.println("invalid option");
        
    }
      
  }
}

