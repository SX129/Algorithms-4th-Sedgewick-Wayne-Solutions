package chapter1.section1;

public class ex26 {
    /*1.1.26 Sorting three numbers. Suppose that the variables a, b, c, and t are all the same numeric primitive type.
    * Show that the following code puts a, b, and c in ascending order:*/
    public static void main(String[] args) {
        int a = 121;
        int b = 2;
        int c = 3;
        int t;

        //if a > b, swap the values of a and b so that the value of a is smaller.
        if (a > b){
            t = a;
            a = b;
            b = t;
        }

        //if a > c, swap the values of a and c so that the value of a is smaller.
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }

        //if b > c, swap the values of b and c so that the value of b is smaller.
        if (b > c){
            t = b;
            b = c;
            c = t;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
