package chapter1.section1;

public class ex17 {
    /*1.1.17 Criticize the following recursive function: */
    public static void main(String[] args){

    }

    public static String exR2(int n){
        //The recursive structure should be called in the return body. The function will continue in a forever loop.
        String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) return "";
        return s;
    }
}
