package chapter1.section1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex23 {
    /*1.1.23 Add to the BinarySearch test client the ability to respond to a second argument: + to print numbers from standard
    * input that are not in the whitelist, - to print numbers that are in the whitelist.*/
    public static void main(String[] args) {
        String fileName = "./filepath" + args[0];
        int[] whitelist = (new In(fileName)).readAllInts();
        char operation = args[1].charAt(0);

        if (operation != '-' && operation != '+') {
            throw new IllegalArgumentException("Operation needs to be - or +");
        }

        boolean searchForWhiteList = operation == '-';
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            int index = binarySearch(key, whitelist);

            if (index != -1 && searchForWhiteList) {
                StdOut.println("Number in whitelist: " + key);
            } else if (index == -1 && !searchForWhiteList) {
                StdOut.println("Number not in whitelist: " + key);
            }
        }
    }

    private static int binarySearch(int key, int[] numbers) {
        return rank(key, numbers, 0, numbers.length - 1);
    }

    private static int rank(int key, int[] arr, int lo, int hi) {
        if (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (key < arr[mid]) {
                return rank(key, arr, lo, mid - 1);
            } else if (key > arr[mid]) {
                return rank(key, arr, mid + 1, hi);
            } else {
                return mid;
            }
        } else {
            return -1;
        }
    }
}
