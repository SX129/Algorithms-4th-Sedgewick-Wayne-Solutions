package chapter1.section1;

public class ex12 {
    /*1.1.12 What does the following code fragment print: */
    public static void main(String[] args){
        //Initializes an integer array of length 10.
        int[] a = new int[10];

        //Iterate through the array and assign the values to be 9 through 0 descending.
        for (int i = 0; i < 10; i++){
            a[i] = 9 - i;
        }

        //Iterate through the array and assign the values to be 0 through 4 ascending and 4 through 0 descending.
        for (int i = 0; i < 10; i++){
            a[i] = a[a[i]];
        }
        for(int i = 0; i < 10; i++){
            System.out.println(a[i]);
        }
    }
}
