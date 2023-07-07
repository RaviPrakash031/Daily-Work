/*Challenge- 3: 

You have been assigned the task of creating a program that implements a stack using an array in java. 

The program should include error handling to handle any exceptions that may arise during the execution.  

You need to test the program with various inputs and ensure that it works as expected. 

The program should accept the following commands from the user: 

1. push <value>: Add an element to the top of the stack 

2. pop: Remove the element at the top of the stack 

3. peek: Display the element at the top of the stack 

4. display: Display all the elements in the stack 

5. exit: Terminate the program 

For push and pop commands, the program should display the stack after the operation, along with any error messages if the stack is full or empty. 

For peek and display commands, the program should display the element(s) or the entire stack, along with any error messages if the stack is empty. 

The program should terminate gracefully when the user enters the exit command.*/

import java.util.*;
class InvalidErrorException1 extends Exception{
  InvalidErrorException1(String msg){
    super(msg);
  }
}
class Stack5 {
    private int maxSize; 
    private int[] stackArray; 
    private int top; 

    public Stack5(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }

   
    public void push(int value) {
      //try{
        if (isFull()) {
            //throw new InvalidErrorException("Stack is full. Cannot push element.")
            System.out.println("Stack is full. Cannot push element.");
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
      }
      //catch(InvalidErrorException e){
        //System.out.println("Invalid Exception");
      //}
        
      //}
    //}

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No elements to display.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
public class GrandTest4Challenge3{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   Stack5 s=new Stack5(5);
   while(true){
     System.out.println("1.push\n2.pop\n3.peek\n4.display\n5.exit");
     System.out.println("enter ur choice");
     int choice =sc.nextInt();
     switch(choice){
       case 1:
         System.out.println("enter the elements in to stack");
         s.push(sc.nextInt());
         s.push(sc.nextInt());
         s.push(sc.nextInt());
         s.push(sc.nextInt());
         s=new Stack5(5);
         break;
       case 2:
         s.pop();
         break;
       case 3:
         s.peek();
         break;
       case 4:
         s.display();
         break;
       case 5:
         System.out.println("exit");
         System.exit(0);
         
         
     }
   }
 } 
}