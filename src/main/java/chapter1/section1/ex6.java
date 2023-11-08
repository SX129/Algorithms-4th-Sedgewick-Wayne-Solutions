package chapter1.section1;

public class ex6 {
    /*1.1.6 What does the following program print:*/
    public static void main(String[] args){
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++){
            System.out.println(f);

            f = f + g;
            g = f - g;
        }
    }
    /*The program will print the numbers: 0, 1, 1, 2, 3, 5, 8, 13...
    * The next number in the sequence is the sum of the previous two numbers.*/
}
