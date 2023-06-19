class teacher{
  public void print(int n,int j){
    System.out.println("teaching");
    System.out.println(n+" and "+j);
  }
}
class mathsTeacher extends teacher{
  public void print(int m,int k){
    System.out.println("teaches maths");
    System.out.println(m+" and "+k);
    
  }
}
public class MethodOverriding{
  public static void main(String[] args){
    teacher ab=new teacher();
    ab.print(8,9);
    mathsTeacher bc=new mathsTeacher();
    bc.print(10,11);
  }
}