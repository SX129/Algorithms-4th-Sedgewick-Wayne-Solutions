package chapter1.section3;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdOut;

public class ex7<Item> {
    /* 1.3.7 Add a method peek() to Stack that returns the most recently
    * inserted item on the stack (without popping it). */
    public static void main(String[] args){

    }

    private Node first;
    private int n;

    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void push(Item item) {
        Node oldFirst = first;

        first = new Node();
        first.item = item;
        first.next = oldFirst;
        n++;
    }

    public Item pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        Item item = first.item;
        first = first.next;
        n--;

        return item;
    }

    public Item peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        return first.item;
    }
}
