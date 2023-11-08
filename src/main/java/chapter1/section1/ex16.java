package chapter1.section1;

public class ex16 {
    /*1.1.16 Give the value of exR1(6): */
    public static void main(String[] args){
        //311361142246
        String a = exR1(6);
        System.out.println(a);
    }

    public static String exR1(int num){
        if (num <= 0) return "";
        return exR1(num - 3) + num + exR1(num - 2) + num;
    }
}
