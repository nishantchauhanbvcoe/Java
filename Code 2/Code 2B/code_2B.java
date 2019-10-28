/**
 * @author nishant
 */

// Create 'stack' class and extend the class to provide functionality.

import java.util.Scanner;

class Stack {
    int stack[];

    Stack(int size) {
        stack = new int[size];
    }
}

class Stack_functional extends Stack {
    private int top;
    private int size;

    Stack_functional(int size) {
        super(size);
        this.size = size;
        top = -1;
    }

    void push(int x) {
        if (top < size) {
            top = top + 1;
            stack[top] = x;
        } else {
            System.out.println("StackOverFlow!");
        }
    }

    void pop() {
        if (top >= 0) {
            System.out.println("\nElement " + stack[top] + " from Stack popped!");
            top = top - 1;
        } else {
            System.out.println("\nStackUnderFlow!");
        }
    }

    void peek() {
        if (top >= 0) {
            System.out.println("\nTop Element of Stack: " + stack[top] + "(index - " + top + ")");
        } else {
            System.out.println("\nStackUnderFlow!");
        }
    }
}

public class code_2B {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.print("\nSize of the stack: ");
        int n = st.nextInt();

        // if (n < 0) {
        // return;
        // }
        Stack_functional stack = new Stack_functional(n);

        System.out.print("\nPush Element to Stack: ");
        n = st.nextInt();
        stack.push(n);
        System.out.print("\nPush Element to Stack: ");
        n = st.nextInt();
        stack.push(n);
        System.out.print("\nPush Element to Stack: ");
        n = st.nextInt();
        stack.push(n);

        stack.peek();
        stack.pop();
        stack.peek();

        st.close();
    }
}