package chapter1.section1;

public class ex25 {
    /*1.1.25 Use mathematical induction to prove that Euclid's algorithm computes the greatest common divisor of any pair of
    non-negative integers p and q.*/
    public static void main(String[] args) {
        System.out.println(gcd(105, 24));
    }

    /*The algorithm recursively finds the greatest common divisor by finding the remainder of two numbers through modulo and using that number
    * as the argument of the next function. By doing so, each recursive call of the function is shrinking the argument values until one of them results in 0.
    * The argument resulting in 0 states that the other argument is a factor of both the original values, which is also the greatest common divisor.*/
    public static int gcd(int p, int q){
        System.out.println("p: " + p);
        System.out.println("q: " + q);

        if (q == 0) return p;
        int r = p % q;
        System.out.println("r: " + r +"\n");

        return gcd(q, r);
    }
}
