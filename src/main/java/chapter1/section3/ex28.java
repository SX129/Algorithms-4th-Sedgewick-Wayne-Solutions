package chapter1.section3;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class ex28<Item> implements Iterable<Item> {
    /* 1.3.28 Develop a recursive solution to the previous question. */

    private class Node{
        Item item;
        Node next;
    }

    private int size;
    private Node first;

    public Node createNode(Item item) {
        Node node = new Node();
        node.item = item;
        return node;
    }

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

    public void removeAfter(Node node){
        if(isEmpty() || node == null){
            return;
        }

        Node current;

        for(current = first; current != null; current = current.next){
            if(current.item.equals(node.item)){
                if(current.next != null){
                    current.next = current.next.next;
                    size--;
                }
                break;
            }
        }
    }

    public void insertAfter(Node node1, Node node2){
        if(isEmpty() || node1 == null || node2 == null){
            return;
        }

        Node current;

        for(current = first; current != null; current = current.next){
            if(current.item.equals(node1.item)){
                node2.next = current.next;
                current.next = node2;
                size++;
            }
        }
    }

    public void remove(Item key){
        if(isEmpty() || key == null){
            return;
        }

        while(first != null && first.item.equals(key)){
            first = first.next;
            size--;
        }

        Node current;

        for (current = first; current != null; current = current.next){
            Node next = current.next;

            while(next != null && next.item.equals(key)){
                next = next.next;
                size--;
            }

            current.next = next;
        }
    }

    public int max() {
        if (isEmpty()) {
            return 0;
        }

        int currentMaxValue = (Integer) first.item;
        return recurMax(first.next, currentMaxValue);
    }

    private int recurMax(Node node, int currentMaxValue) {
        if (node == null) {
            return currentMaxValue;
        }

        int currentValue = (Integer) node.item;

        if (currentValue > currentMaxValue) {
            currentMaxValue = currentValue;
        }
        return recurMax(node.next, currentMaxValue);
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
