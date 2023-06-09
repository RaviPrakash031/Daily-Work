class A{
  public void details1(){
    System.out.println("Iam belongs to class A");
  }
  
}
class B extends A{
  public void details2(){
    System.out.println("Iam belongs to class B");
  }
}
public class SingleInheritanceProgram{
  public static void main(String[] args){
    //A s=new A();//for both A it will A Object Only
    B s=new B(); //it will print both the objects
    //A s=new B(); it will print only s1
    //A s=new B();it will error because B oject wii not features of the A
    s.details1();
    s.details2();
    
  }
}