package chapter1.section3;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class ex9 {
    /* 1.3.9 Write a program that takes from standard input an expression without left parentheses
    * and prints the equivalent infix expression with the parentheses inserted. */
    public static void main(String[] args){
        String input = args[0];
        StdOut.println(getExpression(input));
    }

    private static String getExpression(String input){
        Stack<String> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        String[] inputValues = input.split("\\s");

        for (String value : inputValues){
            if(value.equals("(")){
                //Nothing
            }
            else if (value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")){
                operators.push(value);
            }
            else if (value.equals(")")){
                String operator = operators.pop();
                String value2 = operands.pop();
                String value1 = operands.pop();

                String subExpression = "( " + value1 + " " + operator + " " + value2 + " )";
                operands.push(subExpression);
            }
            else{
                operands.push(value);
            }
        }

        return operands.pop();
    }

}
