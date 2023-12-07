package chapter2;

public class MergeBU {

    // Bottom-up mergesort consists of a sequence of passes over the whole array, doing len-by-len merges,
    // starting with len equal to 1 and doubling len on each pass. The final sub-array is of length len only when
    // the array length is an even multiple of len (otherwise it is less than len).

    private static Comparable[] aux;    // Auxiliary array for merges.

    public static void sort (Comparable[] a){
        // Do lg n passes of pairwise merges.

        int n = a.length;
        aux = new Comparable[n];

        for (int len = 1; len < n; len *= 2){
            for (int lo = 0; lo < n-len; lo += len+len){
                merge(a, lo, lo+len-1, Math.min(lo + len + len-1, n-1));
            }
        }
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        // Merge a[lo ...mid] with a[mid+1 ... hi]

        int i = lo;
        int j = mid + 1;

        for (int k = lo; k <= hi; k++){     // Copy a[lo ... hi] to aux[lo ... hi]
            aux[k] = a[k];
        }

        for (int k = lo; k <= hi; k++){
            if(j > mid){
                a[k] = aux[j++];
            }
            else if (j > hi){
                a[k] = aux[i++];
            }
            else if (less(aux[j], aux[i])){
                a[k] = aux[j++];
            }
            else{
                a[k] = aux[i++];
            }
        }

    }

    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w) < 0;
    }

}
