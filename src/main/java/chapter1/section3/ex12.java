package chapter1.section3;

import edu.princeton.cs.algs4.Stack;


public class ex12 {
    /* 1.3.12 Write an iterable Stack client that has a static method copy() that takes a stack of strings as argument
    * and returns ac opy of the stack. */
    public static void main(String[] args){
    }

    private static Stack<String> copy(Stack<String> stack){
        Stack<String> tempStack = new Stack<>();
        Stack<String> copyStack = new Stack<>();

        for (String s : stack){
            tempStack.push(s);
        }

        for (String s : tempStack){
            copyStack.push(s);
        }

        return copyStack;
    }

}
