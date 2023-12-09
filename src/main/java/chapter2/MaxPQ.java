package chapter2;

public class MaxPQ<Key extends Comparable<Key>> {
    // The priority queue is maintained in a heap-ordered complete binary tree in the array pq[] with
    // pq[0] unused and the n keys in the priority queue in pq[1] through p1[n].

    private Key[] pq;       // heap-ordered complete binary tree
    private int n = 0;      //  in pq[1...n] with pq[0] unused

    public MaxPQ(int maxN){
        pq = (Key[]) new Comparable[maxN + 1];
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public void insert(Key v){
        pq[++n] = v;
        swim(n);
    }

    public Key delMax(){
        Key max = pq[1];        // Retrieve max key from top.
        exchange(1, n--);    // Exchange with last item.
        pq[n+1] = null;        // Avoid loitering.
        sink(1);            // Restore heap property.
        return max;
    }

    private void swim (int k){
        while (k > 1 && less(k/2, k)){
            exchange(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k){
        while (2*k <= n){
            int j = 2*k;
            if (j < n && less (j, j+1)){
                j++;
            }

            if(!less(k, j)){
                break;
            }

            exchange(k, j);
            k = j;
        }
    }

    public void exchange( int i, int j){
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    public boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }


}
