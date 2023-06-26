//2. Shapes: Create classes for different shapes (e.g. Circle, Rectangle, Triangle) that all extend a base Shape class. Each class should have methods to calculate the area and perimeter of the shape. You can also create a custom exception called InvalidDimensionsException to throw when the dimensions of a shape are invalid.


import java.util.Scanner;
class InvalidDimensionsException extends Exception{
  InvalidDimensionsException(String msg){
    super(msg);
  }
}
class Shape{
  double radius;
  double length;
  double breadth;
  double side1;
  double side2;
  double height;
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}
public double getSide1() {
	return side1;
}
public void setSide1(double side1) {
	this.side1 = side1;
}
public double getSide2() {
	return side2;
}
public void setSide2(double side2) {
	this.side2 = side2;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
  
  
}
class Circle1 extends Shape{
  Scanner sc=new Scanner(System.in);
  public void area(){
    
    System.out.println("enter tha radius");
    setRadius(sc.nextDouble());
    double radius=getRadius();
    double area=0;
    try{
      if (radius<0){
        throw new InvalidDimensionsException("radius is less than zero");
      }
      else{
       area=3.14*radius*radius;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("InvalidDimensionsException "+e.getMessage());
    }
    System.out.println("area is "+area);
    
  }
  public void perimeter(){
    System.out.println("enter tha radius");
    double radius=sc.nextDouble();
    double perimeter=0;
    try{
      if (radius<0){
        throw new InvalidDimensionsException("radius is less than zero");
      }
      else{
       perimeter=2*3.14*radius;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("InvalidDimensionsException "+e.getMessage());
    }
    System.out.println("perimeter is "+perimeter);
    
  }
    
    
}
class Rectangle extends Shape{
  Scanner sc=new Scanner(System.in);
  public void area(){
    System.out.println("enter length");
    double length=sc.nextDouble();
    System.out.println("enter the breadth");
    double breadth=sc.nextDouble();
    double Area=0;
    try{
      if(length<0||breadth<0){
        throw new InvalidDimensionsException("length and breadth is less than Zero");
      }
      else{
        Area=length*breadth;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("InvalidDimensionException"+e.getMessage());
    }
    System.out.println("Area of rectangle"+Area);
    
  }
  public void perimeter(){
    System.out.println("enter length");
    double length=sc.nextDouble();
    System.out.println("enter the breadth");
    double breadth=sc.nextDouble();
    double perimeter=0;
    try{
      if(length<0||breadth<0){
        throw new InvalidDimensionsException("length and breadth is less than Zero");
      }
      else{
        perimeter=2*(length+breadth);
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("InvalidDimensionException"+e.getMessage());
    }
    System.out.println("perimeter of rectangle"+perimeter);
    
  
  }
}
class Triangle extends Shape{
  Scanner sc=new Scanner(System.in);
  public void area(){
    System.out.println("enter the sides of a triangle");
    double side=sc.nextDouble();
    double height=sc.nextDouble();
    
    double area=0;
    try{
      if(side<0|| height<0){
        throw new InvalidDimensionsException("sides are negative values" );
      }
      else{
        area=1/2*side+height;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("InvalidDimension Exception"+e.getMessage());
    }
    System.out.println("perimeter of atriangle is "+area);
    
    
    
  }

  public void perimeter(){
    System.out.println("enter the sides of a triangle");
    double side=sc.nextDouble();
    double side1=sc.nextDouble();
    Double side2=sc.nextDouble();
    double perimeter=0;
    try{
      if(side<0|| side1<0||side2<0){
        throw new InvalidDimensionsException("sides are negative values" );
      }
      else{
        perimeter=side+side1+side2;
      }
    }
    catch(InvalidDimensionsException e){
      System.out.println("InvalidDimension Exception"+e.getMessage());
    }
    System.out.println("perimeter of atriangle is "+perimeter);
    
    
    
  }
}
public class ShapeHandling{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    Shape sh=new Shape();
    System.out.println("1.Circle\n2.Rectangle\n3.Triangle\nSelect One option");
    int n=sc.nextInt();
    switch(n){
      case 1:
        Circle1 s=new Circle1();
        System.out.println("1.Area\n2.perimeter\n3Select One option");
        int m=sc.nextInt();
        switch(m){
          case 1:
            
            s.area();
            break;
          case 2:
            
            s.perimeter();
            break;
            
        }
      case 2:
        Rectangle r=new Rectangle();
        System.out.println("1.Area\n2.perimeter\n3Select One option");
        int p=sc.nextInt();
        switch(p){
          case 1:
            
            r.area();
            break;
          case 2:
            
            r.perimeter();
            break;
            
        }
      case 3:
        Triangle t=new Triangle();
        System.out.println("1.Area\n2.perimeter\n3Select One option");
        int q=sc.nextInt();
        switch(q){
          case 1:
            
            t.area();
            break;
          case 2:
            
            t.perimeter();
            break;
            
        }
        
    }
  }
}






