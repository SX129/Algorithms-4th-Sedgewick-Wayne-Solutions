package chapter1.section1;

public class ex18 {
    /*1.1.18 Consider the following recursive function: */
    public static void main(String[] args){
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));
    }

    public static int mystery(int a, int b){
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) * a;
    }
}
