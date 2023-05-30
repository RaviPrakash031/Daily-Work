import java.util.Scanner;
public class AlternatingElementsArray{
  public static void main(String[] args){
    AlternatingElements a=new AlternatingElements();
    a.alternate();
  }
}
class AlternatingElements{
  public void alternate(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int a[]=new int[n];
    
    
    System.out.println("enter the elements in to an array");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
      
    }
      System.out.println("enter the k value");
      int k=sc.nextInt();
    int newa[]=new int[n-k];
    int newa1[]=new int[k];
    System.out.println("after changing array elements are");
    for(int i=0,j=k;i<newa.length;i++){
      newa[i]=a[j];
      j++;
    }
    for (int i=0,j=0;i<newa1.length;i++){
      newa1[i]=a[j];
      j++;
    }
    for(int i=0;i<newa.length;i++){
      System.out.print(newa[i]+"  ");
    }
    for (int i=0;i<newa1.length;i++){
      System.out.print(newa1[i]+"  ");
    }
  }
}
      
      
      
        
        
        
       
        
        
      
      
      
    
    
    
      
        
    
