package chapter1.section1;

public class ex14 {
    /*1.1.14 Write a static method lg() that takes an int value n as argument and returns the largest int not larger than the base-2
    * logarithm of n. Do not use Math. */
    public static void main(String[] args){
        System.out.println(lg(729));
    }

    public static int lg(int num){
        int logInt = 0;

        while(num > 0){
            logInt++;
            num /= 2;
        }
        return logInt - 1;
    }
}
