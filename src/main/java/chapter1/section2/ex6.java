package chapter1.section2;

public class ex6 {
    /* 1.2.6 A string s is a circular shift (or circular rotation) of a string t
    * if it matches when the characters are circularly shifted by any number of positions; e.g., ACTGACG is a circular shift of TGACGAC, and vice versa.
    * Detecting this condition is important in the study of genomic sequences. Write a program that checks whether two given strings s and t are
    * circular shifts of one another. */
    public static void main(String[] args){
        String s = "ACTGACG";
        String t = "TGACGAC";

        System.out.println(circularShift(s, t));
    }

    public static boolean circularShift(String str1, String str2){
        //Checks if both strings are the same length, and
        //when one string is concatenated with itself, does it contain the other string.
        return (str1.length() == str2.length()) && ((str1 + str1).contains(str2));
    }
}
