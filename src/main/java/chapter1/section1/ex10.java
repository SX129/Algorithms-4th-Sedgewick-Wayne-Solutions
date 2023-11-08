package chapter1.section1;

public class ex10 {
    /*1.1.10 What is wrong with the following code fragment: */
    public static void main(String[] args){
        int[] a;
        for (int i = 0; i < 10; i++){
            a[i] = i * i;
        }
        //Int array a is declared but is never initialized with the 'new' keyword.
    }
}
