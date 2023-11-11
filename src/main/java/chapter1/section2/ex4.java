package chapter1.section2;

public class ex4 {
    /* 1.2.4 What does the following code fragment print: */
    public static void main(String[] args){
        String string1 = "hello";
        String string2 = string1;

        string1 = "world";

        System.out.println(string1);
        System.out.println(string2);

        //world hello
    }
}
