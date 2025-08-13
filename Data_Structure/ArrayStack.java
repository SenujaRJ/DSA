/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data_structures;

/**
 *
 * @author hp
 */
import java.util.EmptyStackException;

public class ArrayStack<T> {
    private T[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack size: " + stack.size());
    }
}
