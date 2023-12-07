package chapter2;

public class Top_down_mergesort {

    // To sort a sub-array a[lo ... hi] we divide it into two parts: a[lo ... mid] and a[mid+1 ... hi],
    // sort them independently (via recursive calls), and merge the resulting ordered sub-arrays to produce the result.

    private static Comparable[] aux;    // Auxiliary array for merges.

    public static void sort (Comparable[] a){
        aux = new Comparable[a.length];     // Allocate space just once.
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        // Sort a[lo ... hi]

        if (hi <= lo){
            return;
        }

        int mid = lo + (hi - lo)/2;
        sort(a, lo, mid);   // Sort left half
        sort(a, mid+1, hi);     // Sort right half

        merge(a, lo, mid, hi);      // Merge results (method from abstract in-place merge)
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
