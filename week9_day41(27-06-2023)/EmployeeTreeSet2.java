// Importing util package
import java.util.*;

 

// Custome class Car implements Comparable interface
class Car implements Comparable<Car> {

 

    // attributes
    private int Modelno;
    private String name, city;
    private int stock;

 

    // Car constructor
    public Car(int Modelno, String name, String city,
            int stock)
    {
        this.Modelno = Modelno;
        this.name = name;
        this.city = city;
        this.stock = stock;
    }

 

    public int getModelno() {
        return Modelno;
    }

 

    public void setModelno(int modelno) {
        Modelno = modelno;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public String getCity() {
        return city;
    }

 

    public void setCity(String city) {
        this.city = city;
    }

 

    public int getStock() {
        return stock;
    }

 

    public void setStock(int stock) {
        this.stock = stock;
    }

 

    // Override the compareTo() method
    public int compareTo(Car c)
    {
        return name.compareTo(c.name);
    }
}

 

public class EmployeeTreeSet2{
    // Main driver method
    public static void main(String[] args)
    {

 

        // Define an objects of TreeSet class
        TreeSet<Car> set = new TreeSet<Car>();

        // Creating Car objects
        Car c1 = new Car(132, "BMW", "Rajkot", 35);
        Car c2 = new Car(269, "Audi", "Surat", 20);
        Car c3 = new Car(560, "Kia", "Vadodara", 15);
        Car c4 = new Car(109, "Creta", "Ahmedabad", 26);

 

        // Adding Car objects to TreeSet
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);

 

        // Traversing TreeSet
        for (Car c : set) {
            System.out.println(c.getName() + " " + c.getStock() + " "
                            + c.getCity() + " " + c.getModelno());
        }

    //System.out.println(set);
    }
}