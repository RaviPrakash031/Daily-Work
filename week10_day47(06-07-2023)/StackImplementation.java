/*You have been assigned the task of creating a program that implements a stack using an array in java.
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
class InvalidErrorException extends Exception{
  InvalidErrorException(String msg){
    super(msg);
  }
}
public class StackImplementation {
    private int maxSize; // maximum size of the stack
    private int[] stackArray; // array to hold the stack elements
    private int top; // top of the stack
// Constructor to initialize the stack
    public StackImplementation(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // stack is initially empty
    }
// Method to push an element onto the stack
    public void push(int value) {
      //try{
        if (isFull()) {
            //throw new InvalidErrorException("Stack is full. Cannot push element.");
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
// Method to pop an element from the stack
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
// Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }
// Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
// Method to get the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        } else {
            return stackArray[top];
        }
    }
// Method to display the elements of the stack
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
// Main method to test the stack implementation
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
    }
}