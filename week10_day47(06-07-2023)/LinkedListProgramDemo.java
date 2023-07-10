import java.util.*;
class Node1{
  int data;
  Node1 next;
  Node1(int data){
    this.data=data;
    this.next=null;
    
  }
}
class LinkedList1{
  Node1 head;
  int size=0;
 
  public void add(int data){
    Node1 newNode=new Node1(data);
    if(head==null){
      head=newNode;
      
    }
    else{
      Node1 temp=head;
      while(temp.next!=null){
        temp=temp.next;
        
      }
      temp.next=newNode;
    }
  }
  public void atBeg(int data){
    Node1 newNode=new Node1(data);
    if(head==null){
      
    head=newNode;
    }
    else{
    newNode.next=head;
    head=newNode;
    }
  }
  public void insertPosition(int pos, int data) {
    
        Node1 newNode = new Node1(data);
        newNode.data = data;
        newNode.next = null;

        // Invalid positions
        
            // inserting first node
       if(pos == 1){
            newNode.next = head;
            head = newNode;
            size++;
        }

        else
        {
            Node1 temp = head;

            // traverse till the current (pos-1)th node
            while(--pos > 1){
                temp = temp.next;
            }
            newNode.next= temp.next;
            temp.next = newNode;
            size++;
        }
    }

  public void display(){
    Node1 temp=head;
      while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
        
      }
    
    System.out.println();
    
  }
  
}
public class LinkedListProgramDemo{
  public static void main(String [] args){
    LinkedList1 l=new LinkedList1();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    
    l.atBeg(5);
    l.display();
    l.insertPosition(2,6);
    
  }
}