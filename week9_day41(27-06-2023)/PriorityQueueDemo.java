//program to illustrate Priority Queue
//Priority Queue uses heap

 

import java.util.*; 
class PriorityQueueDemo 
{ 
    public static void main(String[] args) 
    { 
        PriorityQueue q=new PriorityQueue(); 

        q.offer("B"); 
        q.offer("C"); 
        q.offer("D"); 
        q.offer("E"); 
        q.offer("F"); 
        q.offer("A");

        System.out.println(q);  // [A, C, B, E, F, D]
        System.out.println(q.peek()); // A
        System.out.println(q); 
        System.out.println(q.element()); //A
        System.out.println(q); 
        /*
        PriorityQueue q1=new PriorityQueue();
        System.out.println(q1.peek());--> Null
        System.out.println(q1.element());--> Exception
         */ 
        System.out.println(q.poll()); //A
        System.out.println(q); // [B, C, D, E, F]
        System.out.println(q.remove()); //B
        System.out.println(q);// [C, E, D, F]
        /*
        PriorityQueue q1=new PriorityQueue();
        System.out.println(q1.poll());--> Null
        System.out.println(q1.remove());-->Exception
        */ 
    }
}