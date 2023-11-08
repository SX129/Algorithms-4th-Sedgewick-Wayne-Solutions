package chapter1.section1;

public class ex9 {
    /*1.1.9 Write a code fragment that puts the binary representation of a positive integer n into a String s. */
    public static void main(String[] args){
        binToString(53);
        System.out.println(Integer.toBinaryString(53));
    }

    public static void binToString(int num){
        String s = "";
        for (int k = num; k > 0; k /= 2){
            s = (k % 2) + s;
        }
        System.out.println(s);
    }
}
