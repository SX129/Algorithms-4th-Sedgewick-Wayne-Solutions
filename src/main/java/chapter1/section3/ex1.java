package chapter1.section3;

public class ex1 {
    /* 1.3.1 Add a method isFUll() to FixedCapacityStackOfStrings. */
    public static void main(String[] args){

    }

    public class FixedCapacityStack<Item>{
        private Item[] a;
        private int n;

        public FixedCapacityStack(int capacity){
            a = (Item[]) new Object[capacity];
        }

        public boolean isEmpty(){
            return n == 0;
        }

        public boolean isFull(){
            return n == a.length;
        }

        public int size(){
            return n;
        }

        public void push(Item item){
            a[n++] = item;
        }

        public Item pop(){
            return a[--n];
        }
    }
}
