class Node {
  int data;
  Node next;

 

  public Node(int data) {
    this.data = data;
    this.next = null;
  }
}

 

class LinkedList {
  Node head;

 

  public void add(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }
  }

 

  public void display() {
    Node current = head;
    while (current != null) {
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }

 

  /*
   * public void addAtIndex(int index, int data) {
   * if (index < 0) {
   * throw new IndexOutOfBoundsException("Index out of range");
   * }
   * 
   * Node newNode = new Node(data);
   * 
   * if (index == 0) {
   * newNode.next = head;
   * head = newNode;
   * } else {
   * Node current = head;
   * int currentIndex = 0;
   * 
   * while (current != null && currentIndex < index - 1) {
   * current = current.next;
   * currentIndex++;
   * }
   * 
   * if (current == null) {
   * throw new IndexOutOfBoundsException("Index out of range");
   * }
   * 
   * newNode.next = current.next;
   * current.next = newNode;
   * }
   * 
   * }
   */
  public void insert_at_beg(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;

 

    } else {
      newNode.next = head;
      head = newNode;
    }
  }

 

  public void insert_at_end(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;

 

    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;

 

    }
  }
}

 

public class SingleLinkedList {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(5);
    list.add(10);
    list.add(15);
    list.display();
    list.insert_at_beg(2);
    list.display();
    list.insert_at_end(60);
    list.display();
  }
}