package chapter1.section3;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;
public class ex5 {
    /* 1.3.5 What does the following code fragment print when n is 50?
    * Give a high-level description of what it does when presented with a positive integer n. */
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        int n = 50;

        while(n > 0){
            stack.push(n%2);
            n = n / 2;
        }

        for(int d : stack){
            StdOut.print(d);
            StdOut.println();
        }
    }

    //When n is 50, the code prints ihe integers in the stack: 1 1 0 0 1 0
    //When presented with a positive integer, the code prints out the binary representation of n.
}
