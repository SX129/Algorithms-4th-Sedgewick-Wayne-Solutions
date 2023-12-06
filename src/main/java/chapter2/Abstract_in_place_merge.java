package chapter2;

public class Abstract_in_place_merge {

    // This method merges by first copying into an auxiliary array aux[] then merging back to a[].
    // In the merge (the second for loop), there are four conditions:
    // left half exhausted (take from the right),
    // right half exhausted (take from the left),
    // current key on right less than current key on left (take from the right),
    // and current key on right greater than or equal to current key on left (take from the left).
    public static void merge(Comparable[] a, int lo, int mid, int hi){
        // Merge a[lo ...mid] with a[mid+1 ... hi]

        int i = lo;
        int j = mid + 1;

        Comparable[] aux = new Comparable[a.length];

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
