package chapter2;

import edu.princeton.cs.algs4.StdRandom;

public class Quicksort {

    // Quicksort is a recursive program that sorts a sub-array a[lo ... hi] by using a partition() method
    // that puts a[j] into position and arranges the rest of the entries such that the recursive calls finish the sort.

    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);       // Eliminate dependence on input.
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if(hi <= lo){
            return;
        }
        int j = partition(a, lo, hi);

        sort(a, lo, j-1);       // Sort left part a[lo ... j-1]
        sort(a, j+1, hi);       // Sort right part a[j+1 ... hi]
    }

    private static int partition(Comparable[] a, int lo, int hi){
        // Partition into a[lo ... j-1], a[j], a[j+1 ... hi] and return j

        int i = lo;         // Left scan indices
        int j = hi + 1;     // Right scan indices

        Comparable v = a[lo];       // Partition item

        while(true){
            // Scan right, scan left, check for scan complete, and exchange
            while (less(a[++i], v)){
                if (i == hi){
                    break;
                }
            }

            while (less(v, a[--j])){
                if (j == lo){
                    break;
                }
            }

            if (i >= j){
                break;
            }

            exchange(a, i, j);
        }
        exchange(a, lo, j);     // Put partitioning item v into a[j]
        return j;               // with a[lo ... j-1] <= a[j] <= a[j+1 ... hi]
    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

    public static void exchange(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
