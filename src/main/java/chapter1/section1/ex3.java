package chapter1.section1;

public class ex3 {
    /*1.1.3 Write a program that takes three integer command-line arguments and prints equal
    * if all three are equal, and not equal otherwise.*/
    public static void main(String[] args){
        int integer1 = Integer.parseInt(args[0]);
        int integer2 = Integer.parseInt(args[1]);
        int integer3 = Integer.parseInt(args[2]);

        isEqual(integer1, integer2, integer3);
    }

    public static void isEqual(int num1, int num2, int num3){
        if (num1 == num2 && num2 == num3){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}
