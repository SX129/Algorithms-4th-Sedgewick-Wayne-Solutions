package chapter1.section3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringJoiner;

import edu.princeton.cs.algs4.StdOut;
import org.jetbrains.annotations.NotNull;

public class ex19<Item> implements Iterable<Item> {
    /* 1.3.19 Give a code fragment that removes the last node in a linked list whose
    * first node is first. */

    private class Node{
        Item item;
        Node next;
    }

    private int size;
    private Node first;

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(Item item){
        if(isEmpty()){
            first = new Node();
            first.item = item;
        }
        else {
            Node current;
            for (current = first; current.next != null; current = current.next){

            }

            Node newNode = new Node();
            newNode.item = item;
            current.next = newNode;
        }

        size++;
    }

    public void deleteLastNode(){
        if(!isEmpty()){
            if(size == 1){
                first = null;
            }
            else {
                Node current = first;
                for (int i = 0; i < size - 2; i++){
                    current = current.next;
                }
                current.next = null;
            }
        }
        size--;
    }

    @NotNull
    @Override
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next(){
            Item item = current.item;
            current = current.next;

            return item;
        }
    }



    public static void main(String[] args){

    }
}
