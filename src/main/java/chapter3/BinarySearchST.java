package chapter3;

import static edu.princeton.cs.algs4.BinaryStdIn.isEmpty;

public class BinarySearchST<Key extends Comparable<Key>, Value> {

    // This ST implementation keeps the keys and values in parallel arrays.
    // The put() implementation moves larger keys one position to the right before growing the table.

    private Key[] keys;
    private Value[] vals;
    private int n;

    public BinarySearchST(int capacity)
    {
        keys = (Key[]) new Comparable[capacity];
        vals = (Value[]) new Object[capacity];
    }

    public int size()
    {
        return n;
    }

    public Value get(Key key)
    {
        if (isEmpty())
        {
            return null;
        }

        int i = rank(key);

        if ( i < n && keys[i].compareTo(key) == 0)
        {
            return vals[i];
        }
        else
        {
            return null;
        }
    }

    public int rank(Key key)        // Compute the number of keys in the table that are smaller than key.
    {                               // Compare key with the key in the middle: if it is equal, return its index;
        int lo = 0, hi = n - 1;     // If it is less, look in the left half; if it is greater, look in the right half.
        while(lo <= hi)
        {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp < 0)
            {
                hi = mid - 1;
            }
            else if (cmp > 0)
            {
                lo = mid + 1;
            }
            else
            {
                return mid;
            }
        }

        return lo;
    }

    public void put(Key key, Value val)     // Search for key. Update value if found; grow table if new.
    {
        int i = rank(key);
        if (i < n && keys[i].compareTo(key) == 0)
        {
            vals[i] = val;
            return;
        }

        for (int j = n; j > i; j--)
        {
            keys[j] = keys[j-1];
            vals[j] = vals[j-1];
        }

        keys[i] = key;
        vals[i] = val;
        n++;
    }

}
