/**
 * @author nishant
 */

// Implement stack and queue using java collection framework

import java.util.*;
import java.util.stream.Stream;

import javax.print.DocFlavor.STRING;

public class code_2A
{
    public static void main(String[] args){
        // Stack Inbuilt
        Stack<Integer> stack_inbuilt = new Stack();
        for(int i=0; i++<10;){
            stack_inbuilt.push(i);
        }
        System.out.println("\n\nFirst Element of stack is: " + stack_inbuilt.peek());
        System.out.println("Size of stack is: " + stack_inbuilt.size());
        System.out.println("Index of Element \'5\' in stack is: " + stack_inbuilt.search(5));
        Stream stack_stream = stack_inbuilt.stream();
        System.out.print("Elements in stack(using Stream): ");
        stack_stream.forEach((el) -> {
            System.out.print(el + " ");
        });
        System.out.print("\nElements in stack(using POP - in reverse order): ");
        for(int i=0; i++<10;){
            System.out.print(stack_inbuilt.pop() + " ");
        }

        // Queue Inbuilt(using java.util.LinkedList)
        Queue<Integer> queue_inbuilt = new LinkedList();
        for(int i=0; i++<10;){
            queue_inbuilt.add(i);
        }     
        System.out.println("\n\nHead/First element of the queue is(use peek() or element()): " + queue_inbuilt.element());  
        // The peek() works like the element() method except it does not throw an exception if the Queue is empty. Instead it just returns null.
        Iterator queue_iterator = queue_inbuilt.iterator();
        System.out.print("Elements in queue(using Iterator): ");
        while(queue_iterator.hasNext()){
            System.out.print(queue_iterator.next() + " ");
        }
    }
}
