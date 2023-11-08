package chapter1.section1;

import java.util.Arrays;

public class ex13 {
    /*1.1.13 Write a code fragment to print the transposition (rows and columns changed)
    * of a two-dimensional array with m rows and n columns. */
    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        transposeMatrix(arr);
    }

    public static void transposeMatrix(int[][] arr){
        int[][] newArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                newArr[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(newArr));
    }
}
