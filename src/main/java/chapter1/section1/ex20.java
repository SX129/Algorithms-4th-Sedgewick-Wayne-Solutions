package chapter1.section1;

public class ex20 {
    /*1.1.20 Write a recursive static method that computes the value of ln (n!). */
    public static void main(String[] args) {
        System.out.println(lnF(5));
    }

    public static double lnF(int num){
        if (num == 1){
            return 0;
        }
        return Math.log(num) + lnF(num - 1);
    }
}
