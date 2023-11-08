package chapter1.section1;

import java.util.Arrays;

public class ex15 {
    /*1.1.15 Write a static method histogram() that takes an array a[] of int values and an integer m as arguments and returns
    an array of length m whose i-th entry is the number of times the integer i appeared in the argument array.
    If the values in a[] are all between 0 and m-1, the sum of the values in the returned array should be equal to a.length.*/
    public static void main(String[] args){
        int[] a = {0, 1, 2, 1, 6, 7, 3};
        a = histogram(a, 9);

        System.out.println(Arrays.toString(a));
    }

    public static int[] histogram(int[] arr, int m){
        int[] newArr = new int[m];

        for(int i = 0; i < m; i++){
            int numCount = 1;
            newArr[i] = 0;

            for (int k : arr) {
                if (i == k) {
                    newArr[i] = numCount++;
                }
            }
        }

        return newArr;
    }
}
