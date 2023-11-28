package chapter1.section3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class ex20<Item> implements Iterable<Item> {
    /* 1.3.20 Write a method delete() that takes an int argument k and deletes the kth element in a linked list
    , if it exists. */

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

    public void delete(int k){
        if (isEmpty() || k > size){
            return;
        }

        if (k == 1){
            first = first.next;
        }
        else{
            Node current;
            int count = 0;

            for (current = first; current != null; current = current.next){
                if (count == k && current.next != null){
                    current.next = current.next.next;
                    break;
                }
                count++;
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
