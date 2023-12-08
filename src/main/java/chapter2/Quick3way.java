package chapter2;
import edu.princeton.cs.algs4.StdRandom;
public class Quick3way {
    // This sort code partitions to put keys equal to the partitioning element in place and thus does not have
    // to include those keys in the sub-arrays for the recursive calls.
    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);       // Eliminate dependence on input.
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if (hi <= lo){
            return;
        }
        int lt = lo;
        int i = lo + 1;
        int gt = hi;
        Comparable v = a[lo];

        while (i <= gt){
            int cmp = a[i].compareTo(v);
            if (cmp < 0){
                exchange(a, lt++, i++);
            }
            else if (cmp > 0){
                exchange(a, i, gt--);
            }
            else{
                i++;
            }
        }   // Now a[lo ... lt-1] < v = a[lt ... gt] < a[gt+1 ... hi]
        sort(a, lo, lt-1);
        sort(a, gt + 1, hi);
    }
    public static void exchange(Comparable[] a, int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
