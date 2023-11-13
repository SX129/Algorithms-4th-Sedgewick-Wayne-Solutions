package chapter1.section2;

public class ex7 {
    /* 1.2.7 What does the following recursive function return: */
    public static void main(String[] args){
        System.out.println(mystery("henrynguyen"));
    }

    // The recursive function reverses a string by cutting it in half, swapping the order of the halves, cutting the halves again, and repeating,
    // until the length of the cut is less than or equal to one.
    public static String mystery(String s){
        int n = s.length();

        if (n <= 1){
            return s;
        }
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, n);

        return mystery(b) + mystery(a);
    }
}
