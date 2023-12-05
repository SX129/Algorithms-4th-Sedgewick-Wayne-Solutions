package chapter2;

public class Insertion {
    public static void sort(Comparable[] a){
        //Sort a[] into increasing order
        int n = a.length;
        for (int i = 1; i < n; i++){
            //Insert a[i] among a[i-1], a[i-2], ...
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
                exchange(a, j, j-1);
            }
        }
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
