package chapter1.section1;

public class ex24 {
    /*1.1.24 Give the sequence of values of p and q that are computed when Euclid's algorithm
    * is used to compute the greatest common divisor of 105 and 24. Extend the code given on page
    * 4 to develop a program Euclid that takes two integers from the command line and computes their greatest common divisor,
    * printing out the two arguments for each call on the recursive method.
    * Use your program to compute the greatest common divisor of 1111111 and 1234567.*/
    public static void main(String[] args) {
        System.out.println(gcd(1234567, 1111111));
    }

    public static int gcd(int p, int q){
        System.out.println("p: " + p);
        System.out.println("q: " + q);

        if (q == 0) return p;
        int r = p % q;
        System.out.println("r: " + r +"\n");

        return gcd(q, r);
    }
}
