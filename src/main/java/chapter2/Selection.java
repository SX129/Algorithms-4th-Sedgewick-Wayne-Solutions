package chapter2;

public class Selection {
    public static void sort(Comparable[] a){
        //Sort a[] into increasing order
        int n = a.length;   //Array length

        //Exchange a[i] with smallest entry in a[i], ..., a[n-1]
        for(int i = 0; i < n; i++){
            int min = i;    //Index of a minimal entry
            for (int j = i+1; j < n; j++){
                if (less(a[j], a[min])){
                    min = j;
                }
            }
            exchange(a, i, min);
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
