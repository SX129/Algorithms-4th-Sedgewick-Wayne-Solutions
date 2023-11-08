package chapter1.section1;

public class ex4 {
    /*1.1.4 What (if anything) is wrong with each of the following statements:*/
    public static void main(String[] args){
        String statementA = "if (a > b) then c = 0;";
        String statementB = "if a > b { c = 0; }";
        String statementC = "if (a > b) c = 0;";
        String statementD = "if (a > b) c = 0 else b = 0";

        System.out.println(statementA);
        System.out.println("Invalid keyword 'then'.\n");

        System.out.println(statementB);
        System.out.println("Missing parentheses on if statement.\n");

        System.out.println(statementC);
        System.out.println("Correct if statement.\n");

        System.out.println(statementD);
        System.out.println("Missing semicolon after if statement block.\n");
    }
}
