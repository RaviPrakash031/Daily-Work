import java.util.Scanner;
public class InsertElementProgram{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("emetr the size of ana array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("enter the elements in an array");
    for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
    int newarr[]=new int[n+1];
    System.out.println("nnetr the value to be insert");
    int value =sc.nextInt();
    for(int i=0;i<n;i++){
      newarr[0]=value;
      newarr[i+1]=arr[i];
      System.out.println(newarr[i]);
    }
      System.out.println("enter the position to insert value");
      int pos=sc.nextInt();
      for (int i = 0; i < n + 1; i++) {
        if (i < pos - 1)
          newarr[i] = arr[i];
        else if (i == pos - 1)
          newarr[i] = value;
        else
          newarr[i] = arr[i - 1];
        System.out.println(newarr[i]);
      }
    System.out.println("insertion at ending ");
    for(int i=0; i<n+1; i++) {
        newarr[n]=value;
        newarr[i+1]=arr[i];
          System.out.println(newarr[i]);
        
        
    }
  }
}
    
    
    
      
      