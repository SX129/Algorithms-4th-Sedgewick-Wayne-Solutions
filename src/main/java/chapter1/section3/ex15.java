package chapter1.section3;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class ex15 {
    /* 1.3.15 Write a Stack or Queue client that a command-line argument k and prints the kth
    * from the last string found on standard input (assuming that standard input has k or more strings).
    * Use memory proportional to k. */
    public static void main(String[] args){

    }

    private static void printItems(Queue<String> queue, int k){
        int count = 0;

        for (String item : queue){
            count++;

            if(count == queue.size() - (k-1)){
                StdOut.println(item);
                break;
            }
        }
    }

}
