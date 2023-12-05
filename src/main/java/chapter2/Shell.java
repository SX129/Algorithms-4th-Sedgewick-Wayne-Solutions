package chapter2;

public class Shell {
    public static void sort(Comparable[] a){
        //Sort a[] into increasing order
        int n = a.length;
        int h = 1;

        while (h < n/3){
            h = 3*h + 1;    //1, 4, 13, 40, 121, 364
        }

        while (h >= 1){
            //h-sort the array
            for (int i = h; i < n; i++){
                //Insert a[i] among a[i-h], a[i-2*h], a[i-3*h]...
                for (int j = i; j >= h && less(a[j], a[j-h]); j -= h){
                    exchange(a, j, j-h);
                }

                h = h/3;
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
