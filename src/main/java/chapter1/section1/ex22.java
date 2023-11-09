package chapter1.section1;

public class ex22 {
    /*1.1.22 Write a version of BinarySearch that uses the recursive indexOf() given on page 25 and traces the method calls.
    * Each time the recursive method is called , print the argument values lo and hi, indented by the depth of the recursion.
    * Hint: Add an argument to the recursive method that keeps track of the depth*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 9, 12, 15, 33, 45, 51, 69, 74, 82, 90, 106, 120};
        System.out.println(indexOf(arr, 12));
    }

    public static int indexOf(int[] a, int key){
        return indexOf(a, key, 0, a.length -1, 0);
    }

    public static int indexOf(int[] a, int key, int lo, int hi, int depth){
        if (lo > hi){
            return -1;
        }

        int mid = lo + (hi - lo) / 2;

        System.out.println("lo: " + lo);
        System.out.println("mid: " + mid);
        System.out.println("hi: " + hi);
        System.out.println("depth: " + depth + "\n");

        if(key < a[mid]){
            return indexOf(a, key, lo, mid - 1, depth + 1);
        }
        else if (key > a[mid]){
            return indexOf(a, key, mid + 1, hi, depth + 1);
        }
        else{
            return mid;
        }
    }
}
