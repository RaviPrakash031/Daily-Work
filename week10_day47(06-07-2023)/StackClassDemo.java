import java.util.Stack;

 

public class StackClassDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

 

        // Push elements to the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

 

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

 

        // Peek the top element in the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

 

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}