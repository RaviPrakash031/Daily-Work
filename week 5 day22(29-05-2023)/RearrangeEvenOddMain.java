import java.util.Scanner;
public class RearrangeEvenOddMain{
  public static void main(String[] args){
    RearrangeEvenOdd a=new RearrangeEvenOdd();
    a.rearrange();
  }
}
class RearrangeEvenOdd{
  public void rearrange(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int n=sc.nextInt();
    int a[]=new int[n];
     System.out.println("enter the elements in to an array");
    for(int i=0;i<a.length;i++)
      a[i]=sc.nextInt();
    int j = -1,temp;
    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        j++;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
        
    }
    System.out.println("after rearrange the elements are");
    for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
  }
}